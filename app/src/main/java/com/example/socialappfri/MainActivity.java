package com.example.socialappfri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.data);
        btn = findViewById(R.id.open_btn);







        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,TestActivity.class);
                String data = editText.getText().toString();
                int id = 200;
                Bundle bundle = new Bundle();
                bundle.putSerializable("user",new UserModel(id,data));
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });


    }
}