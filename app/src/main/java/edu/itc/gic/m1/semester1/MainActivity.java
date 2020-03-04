package edu.itc.gic.m1.semester1;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import edu.itc.gic.m1.semester1.api.HomexApiClient;
import edu.itc.gic.m1.semester1.api.HomexService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * This class is used for ...
 *
 * @autor MAO Hieng 2/26/2020
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        HomexApiClient apiClient = HomexApiClient.getInstance();
        HomexService homexService = apiClient.getHomexService();

        Call<List<HomexService.HomexFeedsReponse>> listCall = homexService.customerFeeds("0");

        listCall.enqueue(new Callback<List<HomexService.HomexFeedsReponse>>() {
            @Override
            public void onResponse(Call<List<HomexService.HomexFeedsReponse>> call, Response<List<HomexService.HomexFeedsReponse>> response) {
                if (response.isSuccessful()) {
                    List<HomexService.HomexFeedsReponse> homexFeedsReponses = response.body();
                    // save into DB
                    Log.i("MainActivity", homexFeedsReponses.toString());
                }
            }

            @Override
            public void onFailure(Call<List<HomexService.HomexFeedsReponse>> call, Throwable t) {

            }
        });

    }
}
