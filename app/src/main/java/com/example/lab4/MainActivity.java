package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button.setText("Bekturganov");
                Toast toast = Toast.makeText(getApplicationContext(),
                        "My last name", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        ImageButton ibutton = (ImageButton) findViewById(R.id.imageButton);
        ibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setText("Aidin");
                Toast toast = Toast.makeText(getApplicationContext(),
                        "My first name", Toast.LENGTH_SHORT);
                toast.show();
                ibutton.setBackgroundColor(Color.parseColor("#fcba03"));
            }
        });


    }
}