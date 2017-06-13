package com.example.kevin.supertictactoe;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Button rules = (Button) findViewById(R.id.rules);
        Button playAgainstAI = (Button) findViewById(R.id.playAgainstAI);
        Button twoPlayerMode = (Button) findViewById(R.id.twoPlayerMode);

        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog alertDialog = new AlertDialog.Builder(MainPage.this).create();
                alertDialog.setTitle("Game Instructions");
                alertDialog.setMessage("The game is a larger version of Tic Tac Toe. It is played with one larger Tic Tac Toe board made up of 9 smaller Tic Tac Toe boards.\n\nPlayers must win in the large Tic Tac Toe board in order to win the game.\n\n" +
                        "Winning in a smaller section will let you mark that in the larger board.\n\nThe location in which a player plays on their turn determines where their opponent plays during their turn.\n\n" +
                        "For example, playing in the top right corner of the top left smaller board will make your opponent have to play in the top right board on their turn.\n\n You can still be made to play in a smaller board that has already been won.");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Close",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });

        playAgainstAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(v.getContext(), GamePage.class);
                myIntent.putExtra("Mode", "0");
                startActivityForResult(myIntent,0);

            }
        });

        twoPlayerMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Sorry, Not Available Yet", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                toast.show();
            }
        });
    }
}
