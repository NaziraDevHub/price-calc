package com.nazira.pricecalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edBuy,edPercentage;
    Button buttonCalculate;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edBuy = findViewById(R.id.edBuy);
        edPercentage = findViewById(R.id.edPercentage);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        tvDisplay = findViewById(R.id.tvDisplay);

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float byPrice,proPercentage,sellPrice;

                byPrice = Float.parseFloat(edBuy.getText().toString());
                proPercentage = Float.parseFloat(edPercentage.getText().toString());
                sellPrice = byPrice+(proPercentage/100*byPrice);

                tvDisplay.setText("Sellprice is:"+sellPrice);

            }
        });

    }
}