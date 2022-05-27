package com.example.tp1_1.Controleur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tp1_1.R;
import com.example.tp1_1.View.BallView;

public class MainActivity extends AppCompatActivity {

    // View component to be displayed
    private BallView ballview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}