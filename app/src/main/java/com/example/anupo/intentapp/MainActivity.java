package com.example.anupo.intentapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Send_Mesage(View v){
        if(v.getId()==R.id.button)
            //Intent intent=new Intent( MainActivity.this, SubActivity.Class);
            Intent intent= new Intent(MainActivity.this, SubActivity.Class);
            startActivity(intent);
    }
}
