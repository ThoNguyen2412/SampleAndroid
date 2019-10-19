package com.example.tho1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    private EditText et1, et2;
    private int a;
    private int b;
    private String result;
    private TextView tong ;
    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        et1 = (EditText)findViewById(R.id.et_a);
        et2 = (EditText)findViewById(R.id.et_b);
        btnAdd = (Button)findViewById(R.id.btn_cong);
        tong = (TextView)findViewById(R.id.result);


        btnAdd.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(et1.getText().toString());
                b = Integer.parseInt(et2.getText().toString());
                result = String.valueOf(a+b);
                tong.setText("TỔNG: "+ result);
                Toast.makeText(Main3Activity.this,"Tổng "+a+" + "+b+" là: " +result,Toast.LENGTH_SHORT).show();
            }
        });









    }
}
