package com.ptrkcsak.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private Button btn_plus, btn_minus;
    private TextView countOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        countOutput.setOnLongClickListener(view -> {
            counter = 0;
            countOutput.setText(Integer.toString(counter));
            szinkezeles();
            return false;
        });

        btn_minus.setOnClickListener(view -> {
            counter--;
            countOutput.setText(Integer.toString(counter));
            szinkezeles();

        });

        btn_plus.setOnClickListener(view -> {
            counter++;
            countOutput.setText(Integer.toString(counter));
            szinkezeles();
        });
    }

    public void init() {
        btn_minus = (Button)findViewById(R.id.btn_minus);
        btn_plus = (Button)findViewById(R.id.btn_plus);
        countOutput = (TextView)findViewById(R.id.countOutput);
    }

    public void szinkezeles() {
        if (counter > 0) {
            countOutput.setTextColor(Color.rgb(128, 235, 52));
        } else if (counter < 0) {
            countOutput.setTextColor(Color.rgb(255, 41, 41));
        } else {
            countOutput.setTextColor(Color.rgb(135, 206, 235));
        }
    }
}