package com.example.evaluacion1sol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnsend;
    Integer cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0, cont8=0, cont9=0, tot=0;
    EditText usuario, email;

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int viewId = v.getId();
            switch (viewId){
                case R.id.boton1:
                    cont1++;
                    btn1.setText("Producto 1 \n" + cont1);
                    break;
                case R.id.boton2:
                    cont2++;
                    btn2.setText("Producto 2 \n" + cont2);
                    break;
                case R.id.boton3:
                    cont3++;
                    btn3.setText("Producto 3 \n"+ cont3);
                    break;
                case R.id.boton4:
                    cont4++;
                    btn4.setText("Producto 4 \n"+cont4);
                    break;
                case R.id.boton5:
                    cont5++;
                    btn5.setText("Producto 5 \n"+cont5);
                    break;
                case R.id.boton6:
                    cont6++;
                    btn6.setText("Producto 6 \n"+ cont6);
                    break;
                case R.id.boton7:
                    cont7++;
                    btn7.setText("Producto 7 \n"+ cont7);
                    break;
                case R.id.boton8:
                    cont8++;
                    btn8.setText("Producto 8 \n"+ cont8);
                    break;
                case R.id.boton9:
                    cont9++;
                    btn9.setText("Producto 9 \n"+ cont9);
                    break;
            }
        }
    };

    private View.OnClickListener clickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            tot = cont1 + cont2 + cont3 + cont4 + cont5 + cont6 + cont7 + cont8 + cont9;
            Intent intent = new Intent(MainActivity.this, NewActivity.class);
            intent.putExtra(AppConstans.TEXT_KEY1, usuario.getText().toString());
            intent.putExtra(AppConstans.TEXT_KEY2, email.getText().toString());
            intent.putExtra(AppConstans.TEXT_KEY3, tot.toString());

            intent.putExtra(AppConstans.cont_KEY1, cont1.toString());
            intent.putExtra(AppConstans.cont_KEY2, cont2.toString());
            intent.putExtra(AppConstans.cont_KEY3, cont3.toString());
            intent.putExtra(AppConstans.cont_KEY4, cont4.toString());
            intent.putExtra(AppConstans.cont_KEY5, cont5.toString());
            intent.putExtra(AppConstans.cont_KEY6, cont6.toString());
            intent.putExtra(AppConstans.cont_KEY7, cont7.toString());
            intent.putExtra(AppConstans.cont_KEY8, cont8.toString());
            intent.putExtra(AppConstans.cont_KEY9, cont9.toString());

            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
        btn1 = findViewById(R.id.boton1);
        btn2 = findViewById(R.id.boton2);
        btn3 = findViewById(R.id.boton3);
        btn4 = findViewById(R.id.boton4);
        btn5 = findViewById(R.id.boton5);
        btn6 = findViewById(R.id.boton6);
        btn7 = findViewById(R.id.boton7);
        btn8 = findViewById(R.id.boton8);
        btn9 = findViewById(R.id.boton9);
        btnsend = findViewById(R.id.btn_send);

        usuario = findViewById(R.id.users);
        email = findViewById(R.id.emails);

        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);
        btn3.setOnClickListener(clickListener);
        btn4.setOnClickListener(clickListener);
        btn5.setOnClickListener(clickListener);
        btn6.setOnClickListener(clickListener);
        btn7.setOnClickListener(clickListener);
        btn8.setOnClickListener(clickListener);
        btn9.setOnClickListener(clickListener);
        btnsend.setOnClickListener(clickListener2);
    }
}
