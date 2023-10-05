package com.example.helloandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity{
    private int simpleCounter = 0;
    Button btn;
    TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        btn = (Button)findViewById(R.id.btn_counter);
        txv = (TextView)findViewById(R.id.text_counter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleCounter ++;
                txv.setText(Integer.toString(simpleCounter));
            }
        });
    }
}
