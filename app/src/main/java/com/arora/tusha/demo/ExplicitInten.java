package com.arora.tusha.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ExplicitInten extends AppCompatActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_inten);
           Button button1=(Button)findViewById(R.id.Button01);

           button1.setOnClickListener(new View.OnClickListener(){
               public void onClick(View view) {
                   Intent i = new Intent(getApplicationContext(), ExplicitInten2.class);
                   i.putExtra("Value1", "Android By Javatpoint");
                   i.putExtra("Value2", "Simple Tutorial");
                   // Set the request code to any code you like, you can identify the
                   // callback via this code
                   startActivity(i);
               }
           });
       }
}