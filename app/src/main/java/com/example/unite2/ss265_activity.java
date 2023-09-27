package com.example.unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ss265_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ss265);
    }

    public void onayla(View view) {
        Toast.makeText(this, "MERHABA MOBİL DERS", Toast.LENGTH_SHORT).show();
    }
}