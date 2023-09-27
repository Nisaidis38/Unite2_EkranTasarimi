package com.example.unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ss65_activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss65);
    }

    public void kaydet(View view) {
        Toast.makeText(this, "MERHABA DÜNYA", Toast.LENGTH_SHORT).show();

    }
}