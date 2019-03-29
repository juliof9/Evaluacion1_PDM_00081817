package com.example.evaluacion1sol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    public void recibirdatos(){
        mText1 = findViewById(R.id.prueba_text);
        mText2 = findViewById(R.id.text2);
        mText3 = findViewById(R.id.text3);
        mText4 = findViewById(R.id.text4);
        mSubmitAction = findViewById(R.id.submit2_action);

        Intent new_intent = getIntent();
        Bundle datos = new_intent.getExtras();

        if(datos != null || dato2 != null || dato3 != null || dato4 != null){
            assert datos != null;
            text_aux = datos.getString(AppConstants.TEXT1_KEY);
            dato2 = datos.getString(AppConstants.TEXT2_KEY);

        }

        mText1.setText(text_aux);
        mText2.setText(dato2);

    }
}
