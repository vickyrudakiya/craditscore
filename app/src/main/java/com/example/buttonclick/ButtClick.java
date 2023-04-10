package com.example.buttonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtClick extends AppCompatActivity {

    EditText edtname;
    Button btnsubit;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butt_click);
        initview();
    }

    private void initview() {
        edtname=findViewById(R.id.edtname);
        btnsubit=findViewById(R.id.btnsubit);
        btnsubit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name;

                name=edtname.getText().toString();
                if(name.isEmpty())
                {
                    Toast.makeText(ButtClick.this,"Please enter your name",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(ButtClick.this,"Your name is==>"+name,Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}