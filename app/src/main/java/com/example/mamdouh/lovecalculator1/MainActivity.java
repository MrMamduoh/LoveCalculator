package com.example.mamdouh.lovecalculator1;

import android.content.Intent;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Button btn_Calc, btn_New;
    TextView tv_heart;
    


    public String Name;
    public String CName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText) findViewById(R.id.txt1);
        txt2 = (EditText) findViewById(R.id.txt2);
        btn_Calc = (Button) findViewById(R.id.btn_Calc);
        btn_New = (Button) findViewById(R.id.btn_New);
        tv_heart = (TextView) findViewById(R.id.tv_heart);



        btn_Calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calc();


            }
        });


        btn_New.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                New();
            }
        });



    }


    protected void calc() {
        Name = txt1.getText().toString();
        CName = txt2.getText().toString();

        Random rndm = new Random();
        tv_heart.setText(Name + " Love " + "\n" + CName + " " +"\n"+ rndm.nextInt(100) + "%");
        btn_Calc.setEnabled(false);

    }


        protected void New () {
        txt1.setText("");
        txt2.setText("");
        txt1.requestFocus();
        btn_Calc.setEnabled(true);
 }





    }



