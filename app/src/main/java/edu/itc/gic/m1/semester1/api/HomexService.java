package edu.itc.gic.m1.semester1.api;

import java.util.List;

import edu.itc.gic.m1.semester1.Option;
import edu.itc.gic.m1.semester1.Technician;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * This class is used for ...
 *
 * @autor MAO Hieng 3/4/2020
 */
public interface HomexService {

    @GET("customers/feeds.json")
    Call<List<HomexFeedsReponse>> customerFeeds(@Query("last_updated_date") String lastUpdatedDate);

    public class HomexFeedsReponse {

        List<Technician> technicians;

        List<Option> options;

    }
}
