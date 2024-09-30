package com.example.sayaclar;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtsayac;
    private Button btn;
   // private  CountDownTimer count;

    private Runnable runnable;
    private Handler handler;
    private int sayac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtsayac = findViewById(R.id.txtsayac1);
        btn=findViewById(R.id.button);


        // İLERİYE DOĞRU SAYAÇ
         handler= new Handler();
         runnable= new Runnable() {
             @Override
             public void run() {
                 txtsayac.setText("sayım: "+ sayac);
                 sayac++;
                 handler.postDelayed(this::run,1000);

             }
         };
         handler.post(runnable);


        // GERİYE DOĞRU SAYAÇ
         //count= new CountDownTimer(5100,1000) {
        /*@Override
            public void onTick(long millisUntilFinished) {
                txtsayac.setText("kalan:" + (millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                txtsayac.setText("kalan:0");

            }
        };
        count.start(); */


    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View v) {
            sayac=0;
            //1.yol
           /* new CountDownTimer(10100, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    txtsayac.setText("kalan :" + (millisUntilFinished/1000));
                }

                @Override
                public void onFinish() {

                    txtsayac.setText("kalan:0");
                }
            }.start(); */




        }
    });

    }




}