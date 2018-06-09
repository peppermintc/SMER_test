package com.example.chrisantus.smer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class HomeActivity extends AppCompatActivity {

    Button btnMenu,btnPrice,btnIng,btnPush,btnFresh,btnRandom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnMenu=findViewById(R.id.btnMenu);
        btnPrice=findViewById(R.id.btnPrice);
        btnIng=findViewById(R.id.btnIgredient);
        btnPush=findViewById(R.id.btnPush);
        btnFresh=findViewById(R.id.btnFresh);
        btnRandom=findViewById(R.id.btnRandom);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent0=new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intent0);
            }
        });
        btnPrice.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1=new Intent(getApplicationContext(),PriceActivity.class);
                startActivity(intent1);
            }
        });

        btnIng.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent2=new Intent(getApplicationContext(),IngredientActivity.class);
                startActivity(intent2);
            }

        });

        btnPush.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent3=new Intent(getApplicationContext(),PushIngredient.class);
                startActivity(intent3);
            }

        });

        btnRandom.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent4=new Intent(getApplicationContext(),Rice.class);
                startActivity(intent4);
            }
        });
        btnFresh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent5=new Intent(getApplicationContext(),Freshness.class);
                startActivity(intent5);
            }
        });
    }
}
