package com.example.socialappfri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.socialappfri.databinding.ActivityMainBinding;
import com.example.socialappfri.util.MyPrefernce;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        Log.d("ddddddddd", "onCreate: " + MyPrefernce.getSharedInstance(this)
                .getString("key", "nothing"));


        binding.openBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyPrefernce.getEditorInstance(MainActivity.this)
                                .putString("key", "test shared")
                                        .apply();

            }
        });


    }
}