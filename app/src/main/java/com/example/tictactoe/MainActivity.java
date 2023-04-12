package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText player1Name,player1Sign,player2Name,player2Sign;
Button startGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player1Sign=findViewById(R.id.player1Sign);
        player2Sign=findViewById(R.id.player2Sign);
        player1Name=findViewById(R.id.player1Name);
        player2Name=findViewById(R.id.player2Name);
        startGame=findViewById(R.id.startGame);
        startGame.setOnClickListener(new View.OnClickListener(){
            public void onClick(View button){
            String strPlayer1Name,strPlayer1Sign,strPlayer2Name,strPlayer2Sign;
            strPlayer1Name=player1Name.getText().toString();
            strPlayer2Name=player2Name.getText().toString();
            strPlayer1Sign=player1Sign.getText().toString();
            strPlayer2Sign=player2Sign.getText().toString();

           if(strPlayer1Sign.isEmpty() || strPlayer2Sign.isEmpty()){
               Toast.makeText(MainActivity.this,"Players Please Enter your sign",Toast.LENGTH_SHORT).show();
           }
           else if(strPlayer1Name.isEmpty() || strPlayer2Name.isEmpty()){
               Toast.makeText(MainActivity.this,"Players please Enter your name",Toast.LENGTH_SHORT).show();
           }
           else if(strPlayer1Sign.length()!=1 || strPlayer2Sign.length()!=1){
               Toast.makeText(MainActivity.this,"Symbol Should be of 1 character Only",Toast.LENGTH_SHORT).show();

           }
           else if(strPlayer1Sign.equals(strPlayer2Sign)){
               Toast.makeText(MainActivity.this,"Please use different Signs",Toast.LENGTH_SHORT).show();
           }
           else{
               Intent startAnotherActivity=new Intent(MainActivity.this,Game.class);
               startAnotherActivity.putExtra("player1Name",strPlayer1Name);
               startAnotherActivity.putExtra("player1Sign",strPlayer1Sign);
               startAnotherActivity.putExtra("player2Name",strPlayer2Name);
               startAnotherActivity.putExtra("player2Sign",strPlayer2Sign);
               startActivity(startAnotherActivity);
           }

        }});

    }
}