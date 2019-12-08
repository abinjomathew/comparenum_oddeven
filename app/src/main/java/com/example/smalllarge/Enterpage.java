package com.example.smalllarge;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Enterpage extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b1;
    TextView t1;
    String n1,n2,n3,n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enterpage);
        e1=(EditText)findViewById(R.id.t1);
        e2=(EditText) findViewById(R.id.t2);
        e3=(EditText) findViewById(R.id.t3);
        e4=(EditText) findViewById(R.id.t4);
        b1=(Button)findViewById(R.id.b1);
        t1=(TextView)findViewById(R.id.e1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1=e1.getText().toString();
                n2=e2.getText().toString();
                n3=e3.getText().toString();
                Float a=Float.parseFloat(n1);
                Float b=Float.parseFloat(n2);
                Float c=Float.parseFloat(n3);
                if(a>b && a>c)
                {
                e4.setVisibility(View.VISIBLE);
                t1.setVisibility(View.VISIBLE);
                e4.setText(n1);

                }
                else if(b>a && b>c)
                {
                    e4.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    e4.setText(n2);
                }
                else if(c>a && c>b)
                {
                    e4.setVisibility(View.VISIBLE);
                    t1.setVisibility(View.VISIBLE);
                    e4.setText(n3);
                }

            }
        });
    }
}
