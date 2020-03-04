package edu.itc.gic.m1.semester1;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * This class is used for ...
 *
 * @autor MAO Hieng 2/26/2020
 */
public class SplashScreenActivity extends AppCompatActivity {
    private static boolean isLogin = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isLogin == false){
            startActivityForResult(new Intent(this, LoginActivity.class), 12);
        }
        else {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == 12) { // result from LoginActivity
                isLogin = true;
                startActivity(new Intent(this, MainActivity.class));
                finish();
            }
        }
    }

    //    check if isLogin == false, start a LoginActivity by startActivityForResult, otherwise starts a MainActivity then finish itself
}
