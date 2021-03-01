package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ans;
    Double variable1, variable2, result;
    char operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans = (TextView) findViewById(R.id.ans);


    }

    public void Clear(View view){
        ans.setText("");
    }

    public void Back(View view){
        String s = ans.getText().toString();
        if(s.length() != 0) {
            s = s.substring(0, s.length() - 1);
            ans.setText(s);
        }
    }

    public void btn1(View view){
        String s = ans.getText().toString();
        ans.setText(s+"1");
    }

    public void btn2(View view){
        String s = ans.getText().toString();
        ans.setText(s+"2");
    }

    public void btn3(View view){
        String s = ans.getText().toString();
        ans.setText(s+"3");
    }

    public void btn4(View view){
        String s = ans.getText().toString();
        ans.setText(s+"4");
    }

    public void btn5(View view){
        String s = ans.getText().toString();
        ans.setText(s+"5");
    }

    public void btn6(View view){
        String s = ans.getText().toString();
        ans.setText(s+"6");
    }

    public void btn7(View view){
        String s = ans.getText().toString();
        ans.setText(s+"7");
    }

    public void btn8(View view){
        String s = ans.getText().toString();
        ans.setText(s+"8");
    }

    public void btn9(View view){
        String s = ans.getText().toString();
        ans.setText(s+"9");
    }

    public void btn0(View view){
        String s = ans.getText().toString();
        if(s.length() != 0){
            ans.setText(s+"0");
        }
    }

    public void btnadd(View view){
        String s = ans.getText().toString();
        variable1 = Double.parseDouble(s);
        ans.setText("");
        operator = '+';
    }

    public void btnsub(View view){
        String s = ans.getText().toString();
        variable1 = Double.parseDouble(s);
        ans.setText("");
        operator = '-';
    }

    public void btnmulti(View view){
        String s = ans.getText().toString();
        variable1 = Double.parseDouble(s);
        ans.setText("");
        operator = '*';
    }

    public void btndiv(View view){
        String s = ans.getText().toString();
        variable1 = Double.parseDouble(s);
        ans.setText("");
        operator = '/';
    }

    public void btnequal(View view){

        if(operator != 0) {
            String s = ans.getText().toString();
            variable2 = Double.parseDouble(s);

            if (operator == '+') {
                result = variable1 + variable2;
                s = String.valueOf(result);
                ans.setText(s);
                operator = '0';
            }

            if (operator == '-') {
                result = variable1 - variable2;
                s = String.valueOf(result);
                ans.setText(s);
                operator = '0';
            }

            if (operator == '*') {
                result = variable1 * variable2;
                s = String.valueOf(result);
                ans.setText(s);
                operator = '0';
            }

            if (operator == '/') {
                result = variable1 / variable2;
                s = String.valueOf(result);
                ans.setText(s);
                operator = '0';
            }
        }
    }
}