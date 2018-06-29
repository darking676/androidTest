package com.bit.app01.myapp02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    private Button btn, go, send;
    private EditText et, msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        this.setTitle("1st Page");

        btn = (Button)findViewById(R.id.btn01);
        go =  (Button)findViewById(R.id.btn02);
        et = (EditText)findViewById(R.id.editText);

        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et = (EditText)findViewById(R.id.editText);
                String msg = et.getText().toString();
                for(int i=0;i<msg.length();i++){
                    if(!Character.isDigit(msg.charAt(i))){
                        msg = "숫자를 입력하시오";
                        et.setText("");
                        break;
                    }
                }
                Toast.makeText(view.getContext(), msg+" 입력됨", Toast.LENGTH_SHORT).show();

            }
        });

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
                finish();
            }
        });





        }




}
