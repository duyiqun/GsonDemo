package com.qun.gsondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private TextView mTvJsion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String json = "{'name':'zs',age:'18','married':'true'}";

        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);
//        System.out.println(user.toString());
        mTvJsion = (TextView) findViewById(R.id.tv_json);
        mTvJsion.setText(user.toString());
    }
}
