package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int a,b;
    String x="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonjam = findViewById(R.id.buttonjam);
        Button buttonmenha = findViewById(R.id.buttonmenha);
        Button button0 = findViewById(R.id.button0);
        Button buttond = findViewById(R.id.buttond);
        Button buttonm = findViewById(R.id.buttonm);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonzarb = findViewById(R.id.buttonzarb);
        Button buttontaghsim = findViewById(R.id.buttontaghsim);
        EditText editTextText = findViewById(R.id.editTextText);



        buttonjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(editTextText.getText().toString());
                editTextText.setText("");
                x="+";
            }
        });
        buttonmenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(editTextText.getText().toString());
                editTextText.setText("");
                x="-";
            }
        });
        buttontaghsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(editTextText.getText().toString());
                editTextText.setText("");
                x="/";
            }
        });
        buttonzarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.parseInt(editTextText.getText().toString());

                x="*";
            }
        });
        buttonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=Integer.parseInt(editTextText.getText().toString());
                editTextText.setText("");
                if (x.equals("+")){
                    editTextText.setText((a+b)+"");
                }
                if (x.equals("-")){
                    editTextText.setText((a-b)+"");
                }
                if (x.equals("*")){
                    editTextText.setText((a*b)+"");
                }
                if (x.equals("/")){
                    editTextText.setText((a/b)+"");
                }



                //Intent intent1 =new Intent(MainActivity.this,MainActivity2.class);
                //intent1.putExtra("a",a);
                //Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                //intent.putExtra("b",b);
                //startActivity(intent);
                //startActivity(intent1);
                //Intent intent3 = new Intent(MainActivity.this, MainActivity2.class);
                //intent3.putExtra("x",x);
                //startActivity(intent3);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"1");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"0");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextText.setText(editTextText.getText() .toString() +"9");
            }
        });

    }
}