package com.tt.xin.test02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    View btn,btn1;
    EditText edt;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findview();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat df = new DecimalFormat("0.00");
                double resault = Double.parseDouble(edt.getText().toString()) * 3.28;
                tv.setText(Double.parseDouble(edt.getText().toString())
                        + "公尺 = " + df.format(resault) + "英呎");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DecimalFormat df = new DecimalFormat("0.00");
                double resault = Double.parseDouble(edt.getText().toString()) * 0.3048;
                tv.setText(Double.parseDouble(edt.getText().toString())
                        + "英呎 = " + df.format(resault) + "公尺");
            }
        });

    }

    private void findview() {
        btn=findViewById(R.id.button);
        btn1=findViewById(R.id.button2);
        edt= (EditText) findViewById(R.id.editText);
        tv= (TextView) findViewById(R.id.textView2);

    }
}
