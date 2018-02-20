package com.arora.tusha.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
//    String str="123a";

Button btn;
    EditText et;
    TextView txt;

    String  numberOnly, Edit;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt=(TextView)findViewById(R.id.txt);
        et=(EditText)findViewById(R.id.editText);
        btn=(Button)findViewById(R.id.btn);




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Edit=et.getText().toString();
                numberOnly= Edit.replaceAll("[^0-9]", "");
                Toast.makeText(getApplicationContext(), numberOnly, Toast.LENGTH_LONG).show();
                txt.setText(numberOnly);
            }
        });
    }
}
