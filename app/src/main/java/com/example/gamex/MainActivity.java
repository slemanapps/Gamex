package com.example.gamex;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int c =10;
    int point = 0;
    ImageView start;
    TextView txcount, tvpoint;


    public void addpoint(View view){
        if(c>0 && c<10) {
            point++;
            tvpoint.setText(point + "");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txcount = findViewById(R.id.txcount);
        tvpoint = findViewById(R.id.tvpoint);
        tvpoint.setText( point+"");
        start = findViewById(R.id.startbt);





        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                point =0;



                new CountDownTimer(10000,1000){
                    @Override
                    public void onTick(long l) {

                        c--;
                        txcount.setText(c+"");

                    }

                    @Override
                    public void onFinish() {
                     c=10;
                     txcount.setText(c+"");

                        Toast.makeText(getApplicationContext(),"finish",LENGTH_LONG).show();;
                    }
                }.start();
            }
        });



    }
}