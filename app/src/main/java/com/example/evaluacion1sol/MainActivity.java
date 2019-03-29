package com.example.evaluacion1sol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    View view;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;
    private int cont1;
    EditText users, emails;
    String dato1, dato2;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (view.getId()){
                case R.id.btn1:
                    cont1();
                    btn1.setText("Producto 1/n"+cont1);
                    break;
                case R.id.btn2:
                    cont1();
                    btn2.setText("Producto 2/n"+ cont1);
                    break;
                case R.id.btn3:
                    cont1();
                    btn3.setText("Producto 3/n"+ cont1);
                    break;
                case R.id.btn4:
                    cont1();
                    btn4.setText("Producto 4/n"+cont1);
                    break;
                case R.id.btn5:
                    cont1();
                    btn5.setText("Producto 5 /n"+cont1);
                    break;
                case R.id.btn6:
                    cont1();
                    btn6.setText("Producto 6/n"+ cont1);
                    break;
                case R.id.btn7:
                    cont1();
                    btn7.setText("Producto 7/n"+ cont1);
                    break;
                case R.id.btn8:
                    cont1();
                    btn8.setText("Producto 8/n"+ cont1);
                    break;
                case R.id.btn9:
                    cont1();
                    btn9.setText("Producto 9/n"+ cont1);
                    break;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_intent = new Intent(MainActivity.this, NewActivity.class);

                dato1 = users.getText().toString();
                dato2 = emails.getText().toString();

                m_intent.putExtra(AppConstans.TEXT_KEY1, dato1);
                m_intent.putExtra(AppConstans.TEXT_KEY2, dato2);
                startActivity(m_intent);
            }
        });
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);
        btn3.setOnClickListener(clickListener);
        btn4.setOnClickListener(clickListener);
        btn5.setOnClickListener(clickListener);
        btn6.setOnClickListener(clickListener);
        btn7.setOnClickListener(clickListener);
        btn8.setOnClickListener(clickListener);
        btn9.setOnClickListener(clickListener);
        initCounter();
    }

    private void initCounter(){
        cont1 = 0;
    }

    private void cont1(){
        cont1++;
    }
}
