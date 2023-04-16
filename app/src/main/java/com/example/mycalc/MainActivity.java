package com.example.mycalc;

import static java.lang.String.format;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText weight;
    EditText height;
    TextView bmi;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        bmi = findViewById(R.id.bmi);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String w = weight.getText().toString();
                String h = height.getText().toString();

                float we = Float.parseFloat(w);
                float he = Float.parseFloat(h);

                float calc = we / (he * he);


                bmi.setText("BMI = "+format("%.2f", calc));

            }
        });








    }
}