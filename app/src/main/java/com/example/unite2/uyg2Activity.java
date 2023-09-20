package com.example.unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.time.Instant;

public class uyg2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uyg2);
    }

    public void Geri(View view) {
        Intent i = new Intent(uyg2Activity.this,MainActivity.class);
        startActivity(i);
    }
}