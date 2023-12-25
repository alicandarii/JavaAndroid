package com.dari.storingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        textView = findViewById(R.id.textView);

        sharedPreferences = this.getSharedPreferences("com.dari.storingdata", Context.MODE_PRIVATE);

        int age = 40;



        int storeAge = sharedPreferences.getInt("storeAge",0);

        if (storeAge == 0){
            textView.setText("Your Age:");
        }else {
            textView.setText("Your Age : " + storeAge);
        }


    }


    public void yasGetir(View view){

        if (editText.getText().toString().matches("")){
            textView.setText("Lütfen Yaş Giriniz!");
        }else {
            int userAge = Integer.parseInt(editText.getText().toString());
            textView.setText("Your age :" + userAge);

            sharedPreferences.edit().putInt("storeAge",userAge).apply();


        }


    }

    public void delete(View view) {
        int storedData = sharedPreferences.getInt("storeAge",0);

        if (storedData !=0){
            sharedPreferences.edit().remove("storeAge").apply();
            textView.setText("Your Age");
        }
    }
}