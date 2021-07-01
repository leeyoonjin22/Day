package com.example.day;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
EditText ame,lat,moca;
TextView sum,dc,won;
int A,L,M;
int total;
double dcwon = 0.0;
double won1,won2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        A= Integer.parseInt(ame.getText().toString());
        L= Integer.parseInt(lat.getText().toString());
        M= Integer.parseInt(moca.getText().toString());
    }

    public void onCheck(View view) {
        won1 = A*1000+L*1500+M+1700; //할인 전 총금액
        dcwon = won1*0.1; //할인 뒤 금액

    }

    public void onClick(View view) {
    total = A+L+M;
    won1 = A*1000+L*1500+M*1700; //할인 전 총금액
     //할인 뒤 금액
    won2 = won1-dcwon;
       sum.setText("주문개수 : " + total);
       dc.setText("할인금액 : "+(int) dcwon);
       won.setText("결제금액 : "+won2 );
    }


}