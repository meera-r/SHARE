package com.example.meerarajeev.share;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Button button=findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg0) {


                Intent myIntent = new Intent(welcome.this,
                        DONATE.class);
                startActivity(myIntent);
            }
        });
        Button buttonnew=findViewById(R.id.button4);
        buttonnew.setOnClickListener(new View.OnClickListener() {
            public void onClick (View arg1) {

                Intent myIntentnow = new Intent(welcome.this,
                        donate1.class);
                startActivity(myIntentnow);
            }
        });
    }




}
