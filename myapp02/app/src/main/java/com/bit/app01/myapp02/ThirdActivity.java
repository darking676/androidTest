package com.bit.app01.myapp02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    EditText result;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
        this.setTitle("3rd Page");

        result = findViewById(R.id.textParam);
        btn = findViewById(R.id.back);
        Intent res = this.getIntent();
        String msg = res.getStringExtra("param");

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("bitbit", "3rd page Event");
            }
        });
    }

}
