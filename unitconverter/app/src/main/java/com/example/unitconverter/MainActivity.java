package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView,textView3,textView9,valuesofgrams;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText3);
        textView = findViewById(R.id.textView);
        textView3 = findViewById(R.id.textView3);
        textView9 = findViewById(R.id.textView9);
        valuesofgrams=findViewById(R.id.valuesofgrams);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                convertkilogramtogram();
            }
        });
    }

    private void convertkilogramtogram() {
        String valueenteredinkilo=editText.getText().toString();
        double kilo=Double.parseDouble(valueenteredinkilo);
        double gram=kilo*1000;
        valuesofgrams.setText("" + gram);

    }
}
