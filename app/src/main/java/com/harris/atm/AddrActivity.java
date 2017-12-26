package com.harris.atm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class AddrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addr);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        String[] data2 = {"基隆市","新北市","台北市"};
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        if ("基隆市".equals(data2)){
            String[] data3 = {"中正區","暖暖區","八堵區"};
        }
        if ("新北市".equals(data2)){
            String[] data3 = {"永和區","板橋區","新莊區"};
        }
        if ("台北市".equals(data2)){
            String[] data3 = {"信義區","大安區","士林區"};
        }
    }
}
