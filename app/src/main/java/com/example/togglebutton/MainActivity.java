package com.example.togglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iV;
    ToggleButton tB;
    Switch sW;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        tB = findViewById(R.id.tB);
        sW = findViewById(R.id.sW);
        iV = findViewById(R.id.iV);
    }
    public void click(View view) {
        if (tB.isChecked()){
            iV.setImageResource(R.drawable.twenty);
           }
        else{
            iV.setImageResource(R.drawable.fifty);
        }
        if (sW.isChecked()){
            iV.setImageResource(R.drawable.hundred);
        }
        else{
            iV.setImageResource(R.drawable.two_hundred);
        }
    }
}