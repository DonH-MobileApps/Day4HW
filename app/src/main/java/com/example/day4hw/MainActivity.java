package com.example.day4hw;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFirstName;
    EditText etLastName;
    EditText etAddress;
    EditText etCity;
    EditText etState;
    EditText etPostalCode;
    Button   btnSendData;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSendData = findViewById(R.id.SendData);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName  = findViewById(R.id.etLastName);
        etAddress   = findViewById(R.id.etAddress);
        etCity      = findViewById(R.id.etCity);
        etState     = findViewById(R.id.etState);
        etPostalCode = findViewById(R.id.etPostalCode);



    }



    }




