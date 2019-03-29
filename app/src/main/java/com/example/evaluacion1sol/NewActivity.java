package com.example.evaluacion1sol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class NewActivity extends AppCompatActivity {

    String cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9, text1, text2, text3;
    TextView user, email, total;
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, btn_Share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        final JSONObject jsonObject = new JSONObject();

        getdatos();

        try {
            jsonObject.put("User",text1);
            jsonObject.put("Email",text2);
            jsonObject.put("Total",text3);
            jsonObject.put("Cantidad 1",cont1);
            jsonObject.put("Cantidad 2",cont2);
            jsonObject.put("Cantidad 3",cont3);
            jsonObject.put("Cantidad 4",cont4);
            jsonObject.put("Cantidad 5",cont5);
            jsonObject.put("Cantidad 6",cont6);
            jsonObject.put("Cantidad 7",cont7);
            jsonObject.put("Cantidad 8",cont8);
            jsonObject.put("Cantidad 9",cont9);
        }catch (JSONException e){
            e.printStackTrace();;
        }

        btn_Share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent new_intent2 = new Intent();
                new_intent2.setAction(Intent.ACTION_SEND);
                new_intent2.setType("text/plain");
                new_intent2.putExtra(Intent.EXTRA_TEXT, jsonObject.toString());
                startActivity(new_intent2);
            }
        });
    }

    private void getdatos(){

        button1 = findViewById(R.id.b1);
        button2 = findViewById(R.id.b2);
        button3 = findViewById(R.id.b3);
        button4 = findViewById(R.id.b4);
        button5 = findViewById(R.id.b5);
        button6 = findViewById(R.id.b6);
        button7 = findViewById(R.id.b7);
        button8 = findViewById(R.id.b8);
        button9 = findViewById(R.id.b9);
        btn_Share = findViewById(R.id.Share);

        user = findViewById(R.id.users2);
        email = findViewById(R.id.emails2);
        total = findViewById(R.id.total2);

        Intent new_intent = getIntent();

        text1=text2=text3=cont1=cont2=cont3=cont4=cont5=cont6=cont7=cont8=cont9= "";

        if(new_intent != null){
            text1 = new_intent.getStringExtra(AppConstans.TEXT_KEY1);
            text2 = new_intent.getStringExtra(AppConstans.TEXT_KEY2);
            text3 = new_intent.getStringExtra(AppConstans.TEXT_KEY3);

            cont1 = new_intent.getStringExtra(AppConstans.cont_KEY1);
            cont2 = new_intent.getStringExtra(AppConstans.cont_KEY2);
            cont3 = new_intent.getStringExtra(AppConstans.cont_KEY3);
            cont4 = new_intent.getStringExtra(AppConstans.cont_KEY4);
            cont5 = new_intent.getStringExtra(AppConstans.cont_KEY5);
            cont6 = new_intent.getStringExtra(AppConstans.cont_KEY6);
            cont7 = new_intent.getStringExtra(AppConstans.cont_KEY7);
            cont8 = new_intent.getStringExtra(AppConstans.cont_KEY8);
            cont9 = new_intent.getStringExtra(AppConstans.cont_KEY9);
        }

        user.setText("Usuario: "+text1);
        email.setText("Email: "+text2);
        total.setText("Total: "+text3);

        button1.setText("Cantidad: " +cont1);
        button2.setText("Cantidad: " +cont2);
        button3.setText("Cantidad: " +cont3);
        button4.setText("Cantidad: " +cont4);
        button5.setText("Cantidad: " +cont5);
        button6.setText("Cantidad: " +cont6);
        button7.setText("Cantidad: " +cont7);
        button8.setText("Cantidad: " +cont8);
        button9.setText("Cantidad: " +cont9);
    }

}
