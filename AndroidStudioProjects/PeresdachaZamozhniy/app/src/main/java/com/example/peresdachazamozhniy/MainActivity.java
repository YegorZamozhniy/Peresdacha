package com.example.peresdachazamozhniy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    private RadioGroup edit;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button1);

        button = (Button) findViewById(R.id.button1);
    }

    @Override
    public void onClick (View view) {
        switch (view.getId()){
            case R.id.button1:
                edit = findViewById(R.id.radiogroup1);
                edit.setVisibility(View.VISIBLE);

                break;
        }
    }
}