package com.example.shakeddromi.targil001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.button1);
        btn2=(Button) findViewById(R.id.button2);
        txt=(TextView) findViewById(R.id.textView);
    }

    public void clickme(View view) {
        Random rd=new Random();
        int r=rd.nextInt();
        txt.setText("number - "+r);
    }

    public void cnlnumber(View view) {
        txt.setText("number not found");
    }
}
