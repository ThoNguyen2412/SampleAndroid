package com.example.tho1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String text1 = intent.getStringExtra("text1");
        String text2 = intent.getStringExtra("text2");

        final TextView tx1 = (TextView)this.findViewById(R.id.textView1);
        final TextView tx2 = (TextView)this.findViewById(R.id.textView2);

        tx1.setText(text1);
        tx2.setText(text2);

        Button button = (Button) this.findViewById(R.id.button7);
        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("You Click button");
                Toast.makeText(Main2Activity.this, "Xin Chào Thọ", Toast.LENGTH_SHORT).show();

            }
        });

        button.setOnLongClickListener(new Button.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tx2.setText("You Long Click Button");
                Toast.makeText(Main2Activity.this,"Hello", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
