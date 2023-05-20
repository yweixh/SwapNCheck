package com.example.swapncheck;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultmessage extends MainActivity{

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.resultdisplay);
        Intent resultDp = getIntent();
        tv = (TextView) findViewById(R.id.result_message);
        String result = resultDp.getStringExtra("same");
        tv.setText(result);
    }
}
