package com.bit.app01.myapp02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        this.setTitle("2nd Page");

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);


        button1.setOnClickListener(new BtnEvent());


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SecondActivity.this, FirstActivity.class);
//                intent2.setClassName(view.getContext(), "com.bit.app01.myapp02.SecondActivity");
                startActivity(intent2);
                finish();
            }
        });
    }

    class BtnEvent implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if(button1==v){

            }


        }
    }
}
