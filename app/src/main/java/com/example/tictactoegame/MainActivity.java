package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView p1_score, p2_score;
    int p1score = 0;
    int p2score = 0;
    Button resetBtn, b00, b01, b02, b10, b11, b12, b20, b21, b22;
    int active_player = 0;
    boolean player = true;   //p1=0 and p2=1
    int[][] winning_patterns = {{1,2,3},{4,5,6},{7,8,9},{1,5,9},{3,5,7},{1,4,7},{2,5,8},{3,6,9}};
    List<Integer> p1;
    List<Integer> p2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1_score = findViewById(R.id.p1_score);
        p2_score = findViewById(R.id.p2_score);
        resetBtn = findViewById(R.id.resetBtn);
        b00 = findViewById(R.id.b00);
        b01 = findViewById(R.id.b01);
        b02 = findViewById(R.id.b02);
        b10 = findViewById(R.id.b10);
        b11 = findViewById(R.id.b11);
        b12 = findViewById(R.id.b12);
        b20 = findViewById(R.id.b20);
        b21 = findViewById(R.id.b21);
        b22 = findViewById(R.id.b22);
        p1 = new ArrayList<>();
        p2 = new ArrayList<>();


        playGame();
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                p1_score.setText("Player 1: 0");
                p2_score.setText("Player 2: 0");
                p1score=0;
                p2score=0;

                resetBoard();
            }
        });


    }


    private boolean checkWinner(List<Integer> p1) {

            Collections.sort(p1);
            int ct = 0;
            int flag = 0;
            for (int i = 0; i < winning_patterns.length; i++) {
                ct=0;
                int k=0;  //p1
                int e=0;  //winning_pattern
                while(k<p1.size()) {
                    if (winning_patterns[i][e] == p1.get(k)) {
                        e++;
                        k++;
                        ct = ct + 1;
                    } else {
                        k++;
                    }


                }
                if (ct == 3) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {


                resetBoard();

                return true;
            }



            return false;

    }



   private void playGame(){
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(active_player==0){
                    b00.setText("X");
                    b00.setEnabled(false);
                    p1.add(1);
                    active_player=1;
                    if(checkWinner(p1)){
                        Toast.makeText(MainActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                        p1score++;
                        p1_score.setText("Player 1: " + p1score);
                    }
                }else{
                    b00.setText("0");
                    b00.setEnabled(false);
                    p2.add(1);

                    active_player=0;
                    if(checkWinner(p2)){
                        Toast.makeText(MainActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                        p2score++;
                        p2_score.setText("Player 2: " + p2score);
                    }
                }
            }
        });

       b01.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(active_player==0){
                   b01.setText("X");
                   b01.setEnabled(false);
                   p1.add(2);

                   active_player=1;
                   if(checkWinner(p1)){
                       Toast.makeText(MainActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                       p1score++;
                       p1_score.setText("Player 1: " + p1score);
                   }
               }else{
                   b01.setText("0");
                   b01.setEnabled(false);
                   p2.add(2);

                   active_player=0;
                   if(checkWinner(p2)){
                       Toast.makeText(MainActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                       p2score++;
                       p2_score.setText("Player 2: " + p2score);
                   }
               }
           }
       });

       b02.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(active_player==0){
                   b02.setText("X");
                   b02.setEnabled(false);
                   p1.add(3);

                   active_player=1;
                   if(checkWinner(p1)){
                       Toast.makeText(MainActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                       p1score++;
                       p1_score.setText("Player 1: " + p1score);
                   }
               }else{
                   b02.setText("0");
                   b02.setEnabled(false);
                   p2.add(3);

                   active_player=0;
                   if(checkWinner(p2)){
                       Toast.makeText(MainActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                       p2score++;
                       p2_score.setText("Player 2: " + p2score);
                   }
               }
           }
       });

       b10.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(active_player==0){
                   b10.setText("X");
                   b10.setEnabled(false);
                   p1.add(4);

                   active_player=1;
                   if(checkWinner(p1)){
                       Toast.makeText(MainActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                       p1score++;
                       p1_score.setText("Player 1: " + p1score);

                   }
               }else{
                   b10.setText("0");
                   b10.setEnabled(false);
                   p2.add(4);

                   active_player=0;
                   if(checkWinner(p2)){
                       Toast.makeText(MainActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                       p2score++;
                       p2_score.setText("Player 2: " + p2score);
                   }
               }
           }
       });

       b11.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(active_player==0){
                   b11.setText("X");
                   b11.setEnabled(false);
                   p1.add(5);

                   active_player=1;
                   if(checkWinner(p1)){
                       Toast.makeText(MainActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                       p1score++;
                       p1_score.setText("Player 1: " + p1score);
                   }
               }else{
                   b11.setText("0");
                   b11.setEnabled(false);
                   p2.add(5);

                   active_player=0;
                   if(checkWinner(p2)){
                       Toast.makeText(MainActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                       p2score++;
                       p2_score.setText("Player 2: " + p2score);
                   }
               }
           }
       });

       b12.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(active_player==0){
                   b12.setText("X");
                   b12.setEnabled(false);
                   p1.add(6);

                   active_player=1;
                   if(checkWinner(p1)){
                       Toast.makeText(MainActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                       p1score++;
                       p1_score.setText("Player 1: " + p1score);
                   }
               }else{
                   b12.setText("0");
                   b12.setEnabled(false);
                   p2.add(6);

                   active_player=0;
                   if(checkWinner(p2)){
                       Toast.makeText(MainActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                       p2score++;
                       p2_score.setText("Player 2: " + p2score);
                   }
               }
           }
       });

       b20.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(active_player==0){
                   b20.setText("X");
                   b20.setEnabled(false);
                   p1.add(7);

                   active_player=1;
                   if(checkWinner(p1)){
                       Toast.makeText(MainActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                       p1score++;
                       p1_score.setText("Player 1: " + p1score);
                   }
               }else{
                   b20.setText("0");
                   b20.setEnabled(false);
                   p2.add(7);

                   active_player=0;
                   if(checkWinner(p2)){
                       Toast.makeText(MainActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                       p2score++;
                       p2_score.setText("Player 2: " + p2score);
                   }
               }
           }
       });

       b21.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(active_player==0){
                   b21.setText("X");
                   b21.setEnabled(false);
                   p1.add(8);

                   active_player=1;
                   if(checkWinner(p1)){
                       Toast.makeText(MainActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                       p1score++;
                       p1_score.setText("Player 1: " + p1score);
                   }
               }else{
                   b21.setText("0");
                   b21.setEnabled(false);
                   p2.add(8);

                   active_player=0;
                   if(checkWinner(p2)){
                       Toast.makeText(MainActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                       p2score++;
                       p2_score.setText("Player 2: " + p2score);
                   }
               }
           }
       });

       b22.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(active_player==0){
                   b22.setText("X");
                   b22.setEnabled(false);
                   p1.add(9);

                   active_player=1;
                   if(checkWinner(p1)){
                       Toast.makeText(MainActivity.this, "Player 1 wins", Toast.LENGTH_SHORT).show();
                       p1score++;
                       p1_score.setText("Player 1: " + p1score);
                   }
               }else{
                   b22.setText("0");
                   b22.setEnabled(false);
                   p2.add(9);

                   active_player=0;
                   if(checkWinner(p2)){
                       Toast.makeText(MainActivity.this, "Player 2 wins", Toast.LENGTH_SHORT).show();
                       p2score++;
                       p2_score.setText("Player 2: " + p2score);
                   }
               }
           }
       });
   }

    private void resetBoard(){

        b00.setEnabled(true);
        b01.setEnabled(true);
        b02.setEnabled(true);
        b10.setEnabled(true);
        b11.setEnabled(true);
        b12.setEnabled(true);
        b20.setEnabled(true);
        b21.setEnabled(true);
        b22.setEnabled(true);

        b00.setText("");
        b01.setText("");
        b02.setText("");
        b10.setText("");
        b11.setText("");
        b12.setText("");
        b20.setText("");
        b21.setText("");
        b22.setText("");

        p1.clear();
        p2.clear();

    }
}