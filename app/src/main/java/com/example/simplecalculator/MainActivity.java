package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtValue1;
    EditText txtValue2;
    EditText txtAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValue1 = findViewById(R.id.txtValue1);
        txtValue2 = findViewById(R.id.txtValue2);
        txtAnswer = findViewById(R.id.txtAnswer);
    }


//    EditText txtValue1;
//    EditText txtValue2;
//    EditText txtAnswer;

    public void btnAdd(View v){
        //txtValue1 = findViewById(R.id.txtValue1);
        double num1 = Double.parseDouble(txtValue1.getText().toString());
        //txtValue2 = findViewById(R.id.txtValue2);
        double num2 = Double.parseDouble(txtValue2.getText().toString());
        double answer = num1 + num2;
        //txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.setText(""+answer);
    }

    public void btnSub(View v){
        //txtValue1 = findViewById(R.id.txtValue1);
        double num1 = Double.parseDouble(txtValue1.getText().toString());
        //txtValue2 = findViewById(R.id.txtValue2);
        double num2 = Double.parseDouble(txtValue2.getText().toString());
        double answer = num1 - num2;
        //txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.setText(""+answer);
    }

    public void btnMul(View v){
        //txtValue1 = findViewById(R.id.txtValue1);
        double num1 = Double.parseDouble(txtValue1.getText().toString());
        //txtValue2 = findViewById(R.id.txtValue2);
        double num2 = Double.parseDouble(txtValue2.getText().toString());
        double answer = num1 * num2;
        //txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.setText(""+answer);
    }

    public void btnDiv(View v){
        //txtValue1 = findViewById(R.id.txtValue1);
        double num1 = Double.parseDouble(txtValue1.getText().toString());
        //txtValue2 = findViewById(R.id.txtValue2);
        double num2 = Double.parseDouble(txtValue2.getText().toString());
        double answer = num1 / num2;
        //txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.setText(""+answer);
    }

    public void btnClear(View v){
        //txtValue1 = findViewById(R.id.txtValue1);
        txtValue1.getText().clear();
        //txtValue2 = findViewById(R.id.txtValue2);
        txtValue2.getText().clear();
        //txtAnswer = findViewById(R.id.txtAnswer);
        txtAnswer.getText().clear();


    }

}