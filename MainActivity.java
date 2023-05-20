package com.example.swapncheck;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button click;
    EditText edit1;
    EditText edit2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = (Button) findViewById(R.id.check_button);
        edit1 = (EditText) findViewById(R.id.firstInput);
        edit2 = (EditText) findViewById(R.id.secondInput);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), resultmessage.class);
                String msg = edit1.getText().toString();
                String msg2 = edit2.getText().toString();

                if (msg.equalsIgnoreCase(msg2)) {
                    i.putExtra("same", "SAME");
                    startActivity(i);
                } else {
                    i.putExtra("same", "NOT THE SAME");
                    startActivity(i);
                }
            }
        });
    }
        public void onSwap(View view) {
            edit1 = (EditText) findViewById(R.id.firstInput);
            edit2 = (EditText) findViewById(R.id.secondInput);
            String getFirstString = String.valueOf(edit1.getText());
            String getSecondString = String.valueOf(edit2.getText());

            edit1.setText(getSecondString);
            edit2.setText(getFirstString);
        }
}