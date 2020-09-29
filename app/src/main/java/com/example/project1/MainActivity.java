package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void ShowMessage(View view) {
        EditText edittext=findViewById(R.id.editetxt);
        TextView textview= findViewById(R.id.txtmsg);
        textview.setText(edittext.getText().toString());
    }
}