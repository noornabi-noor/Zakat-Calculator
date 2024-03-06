package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvId,Zakat1,Zakat2,Zakat3;
    Button btn,refreshBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvId = findViewById(R.id.tvId);
        Zakat1 = findViewById(R.id.Zakat1);
        Zakat2 = findViewById(R.id.Zakat2);
        Zakat3 = findViewById(R.id.Zakat3);
        btn = findViewById(R.id.btn);
        refreshBtn=findViewById(R.id.refreshBtn);

        // Set OnClickListener for Zakat1 TextView
        Zakat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the detailed_info string from strings.xml and set it to tvId
                //String detailedInfo = getString(R.string.detailed_info);
                String detailedInfo = getString(R.string.detailed_info);
                tvId.setText(detailedInfo);
            }
        });

        // Set OnClickListener for Zakat2 TextView
        Zakat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the detailed_info string from strings.xml and set it to tvId
                //String detailedInfo = getString(R.string.detailed_info);
                String detailedInfo = getString(R.string.detailed_info2);
                tvId.setText(detailedInfo);
            }
        });

        // Set OnClickListener for Zakat3 TextView
        Zakat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the detailed_info string from strings.xml and set it to tvId
                //String detailedInfo = getString(R.string.detailed_info);
                String detailedInfo = getString(R.string.detailed_info3);
                tvId.setText(detailedInfo);
            }
        });

        refreshBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Clear the EditText fields and TextView
                tvId.setText("");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(myIntent);
                finish();
            }
        });
    }
}