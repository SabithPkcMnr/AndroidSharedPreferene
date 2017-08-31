package com.sabithpkcmnr.sharedprefexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultDisplay = (TextView) findViewById(R.id.resultText);

        SharedPreferences resultPref = getSharedPreferences("MySavedData", Context.MODE_PRIVATE);

        String MyStringValue = resultPref.getString("myValue", "Data not found");

        resultDisplay.setText(MyStringValue);

    }
}