package com.example.tho1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) this.findViewById(R.id.button);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                intent1.putExtra("text1","Tuan");
                intent1.putExtra("text2","Tu");
                MainActivity.this.startActivity(intent1);
            }
        });

        Button button2 = (Button) this.findViewById(R.id.button2);
        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,Main3Activity.class);
                MainActivity.this.startActivity(intent2);
            }
        });

        Button button3 = (Button) this.findViewById(R.id.button3);
        button3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,Main4Activity.class);
                MainActivity.this.startActivity(intent3);
            }
        });

        Button button4 = (Button) this.findViewById(R.id.button4);
        button4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,Main5Activity.class);
                MainActivity.this.startActivity(intent4);
            }
        });

        Button button5 = (Button) this.findViewById(R.id.button5);
        button5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MainActivity.this,Main6Activity.class);
                MainActivity.this.startActivity(intent5);
            }
        });

        Button button6 = (Button) this.findViewById(R.id.button6);
        button6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MainActivity.this,Main7Activity.class);
                MainActivity.this.startActivity(intent6);
            }
        });
    }
}
