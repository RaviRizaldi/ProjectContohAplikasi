package com.example.projectcontohaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText TEXTINPUT;
    Button BTNPROSES;
    TextView TEXTOUTPUT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TEXTINPUT = findViewById(R.id.txtinput);
        BTNPROSES = findViewById(R.id.btnproses);
        TEXTOUTPUT = findViewById(R.id.txtoutput);

        BTNPROSES.setOnClickListener(view -> {
            Editable GETTINGINPUT = TEXTINPUT.getText();
            TEXTOUTPUT.setText(GETTINGINPUT);
        });


    }
}