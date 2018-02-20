package com.arora.tusha.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ExplicitInten2 extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView tv=new TextView(this);
        tv.setText("second activity");
        setContentView(R.layout.activity_explicit_inten2);
        Bundle extras = getIntent().getExtras();
        String value1 = extras.getString("Value1");
        String value2 = extras.getString("Value2");
        Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
                "\n Second Value: "+value2,Toast.LENGTH_LONG).show();
        Button button1=(Button)findViewById(R.id.Button01);
        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ExplicitInten.class);
                startActivity(i);
            }
        });
    }
}
