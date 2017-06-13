package com.example.kevin.supertictactoe;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kevin on 5/12/2017.
 */

public class GamePage extends AppCompatActivity implements View.OnClickListener{

    Button[][] buttons;
    String[][] buttonValues;
    String[] largeBoard;
    TextView messageBox;
    int box;
    Boolean gameOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_page);

        messageBox = (TextView) findViewById(R.id.messageBox);
        initializeButtons();

    }



    protected void initializeButtons(){

        box = -1;
        gameOver = false;
        buttons = new Button[9][9];
        buttonValues = new String[9][9];
        largeBoard = new String[9];
        for(int i=0; i<9; i++){
            largeBoard[i] ="";
        }
        for(int i =0; i<9; i++){
            for(int j=0; j<9; j++){
                buttonValues[i][j] = "";
            }
        }

        buttons[0][0] = (Button) findViewById(R.id.button00);
        buttons[0][1] = (Button) findViewById(R.id.button01);
        buttons[0][2] = (Button) findViewById(R.id.button02);
        buttons[0][3] = (Button) findViewById(R.id.button03);
        buttons[0][4] = (Button) findViewById(R.id.button04);
        buttons[0][5] = (Button) findViewById(R.id.button05);
        buttons[0][6] = (Button) findViewById(R.id.button06);
        buttons[0][7] = (Button) findViewById(R.id.button07);
        buttons[0][8] = (Button) findViewById(R.id.button08);

        buttons[1][0] = (Button) findViewById(R.id.button10);
        buttons[1][1] = (Button) findViewById(R.id.button11);
        buttons[1][2] = (Button) findViewById(R.id.button12);
        buttons[1][3] = (Button) findViewById(R.id.button13);
        buttons[1][4] = (Button) findViewById(R.id.button14);
        buttons[1][5] = (Button) findViewById(R.id.button15);
        buttons[1][6] = (Button) findViewById(R.id.button16);
        buttons[1][7] = (Button) findViewById(R.id.button17);
        buttons[1][8] = (Button) findViewById(R.id.button18);

        buttons[2][0] = (Button) findViewById(R.id.button20);
        buttons[2][1] = (Button) findViewById(R.id.button21);
        buttons[2][2] = (Button) findViewById(R.id.button22);
        buttons[2][3] = (Button) findViewById(R.id.button23);
        buttons[2][4] = (Button) findViewById(R.id.button24);
        buttons[2][5] = (Button) findViewById(R.id.button25);
        buttons[2][6] = (Button) findViewById(R.id.button26);
        buttons[2][7] = (Button) findViewById(R.id.button27);
        buttons[2][8] = (Button) findViewById(R.id.button28);

        buttons[3][0] = (Button) findViewById(R.id.button30);
        buttons[3][1] = (Button) findViewById(R.id.button31);
        buttons[3][2] = (Button) findViewById(R.id.button32);
        buttons[3][3] = (Button) findViewById(R.id.button33);
        buttons[3][4] = (Button) findViewById(R.id.button34);
        buttons[3][5] = (Button) findViewById(R.id.button35);
        buttons[3][6] = (Button) findViewById(R.id.button36);
        buttons[3][7] = (Button) findViewById(R.id.button37);
        buttons[3][8] = (Button) findViewById(R.id.button38);

        buttons[4][0] = (Button) findViewById(R.id.button40);
        buttons[4][1] = (Button) findViewById(R.id.button41);
        buttons[4][2] = (Button) findViewById(R.id.button42);
        buttons[4][3] = (Button) findViewById(R.id.button43);
        buttons[4][4] = (Button) findViewById(R.id.button44);
        buttons[4][5] = (Button) findViewById(R.id.button45);
        buttons[4][6] = (Button) findViewById(R.id.button46);
        buttons[4][7] = (Button) findViewById(R.id.button47);
        buttons[4][8] = (Button) findViewById(R.id.button48);

        buttons[5][0] = (Button) findViewById(R.id.button50);
        buttons[5][1] = (Button) findViewById(R.id.button51);
        buttons[5][2] = (Button) findViewById(R.id.button52);
        buttons[5][3] = (Button) findViewById(R.id.button53);
        buttons[5][4] = (Button) findViewById(R.id.button54);
        buttons[5][5] = (Button) findViewById(R.id.button55);
        buttons[5][6] = (Button) findViewById(R.id.button56);
        buttons[5][7] = (Button) findViewById(R.id.button57);
        buttons[5][8] = (Button) findViewById(R.id.button58);

        buttons[6][0] = (Button) findViewById(R.id.button60);
        buttons[6][1] = (Button) findViewById(R.id.button61);
        buttons[6][2] = (Button) findViewById(R.id.button62);
        buttons[6][3] = (Button) findViewById(R.id.button63);
        buttons[6][4] = (Button) findViewById(R.id.button64);
        buttons[6][5] = (Button) findViewById(R.id.button65);
        buttons[6][6] = (Button) findViewById(R.id.button66);
        buttons[6][7] = (Button) findViewById(R.id.button67);
        buttons[6][8] = (Button) findViewById(R.id.button68);

        buttons[7][0] = (Button) findViewById(R.id.button70);
        buttons[7][1] = (Button) findViewById(R.id.button71);
        buttons[7][2] = (Button) findViewById(R.id.button72);
        buttons[7][3] = (Button) findViewById(R.id.button73);
        buttons[7][4] = (Button) findViewById(R.id.button74);
        buttons[7][5] = (Button) findViewById(R.id.button75);
        buttons[7][6] = (Button) findViewById(R.id.button76);
        buttons[7][7] = (Button) findViewById(R.id.button77);
        buttons[7][8] = (Button) findViewById(R.id.button78);

        buttons[8][0] = (Button) findViewById(R.id.button80);
        buttons[8][1] = (Button) findViewById(R.id.button81);
        buttons[8][2] = (Button) findViewById(R.id.button82);
        buttons[8][3] = (Button) findViewById(R.id.button83);
        buttons[8][4] = (Button) findViewById(R.id.button84);
        buttons[8][5] = (Button) findViewById(R.id.button85);
        buttons[8][6] = (Button) findViewById(R.id.button86);
        buttons[8][7] = (Button) findViewById(R.id.button87);
        buttons[8][8] = (Button) findViewById(R.id.button88);

        for(int i =0; i<9; i++){
            for(int j=0; j<9; j++){
                buttons[i][j].setOnClickListener(this);
                buttons[i][j].setText("");
                buttons[i][j].setBackgroundResource(android.R.drawable.btn_default);
            }
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onClick(View v) {

        String tempString = getResources().getResourceEntryName(v.getId());
        tempString = tempString.substring(6);
        int num1= Integer.parseInt(tempString.charAt(0)+"");
        int num2 = Integer.parseInt(tempString.charAt(1)+"");

        if(box == -1 || box-num1 == 0){
            if(buttonValues[num1][num2] == ""){
                buttons[num1][num2].setText("X");
                buttonValues[num1][num2] = "player1";
                box = num2;
                checkWin();

                if(!gameOver){
                    disableButtons();
                    messageBox.setText("Computer's Turn");
                    highlightButtons(num1, num2);
                    Handler timerHandler = new Handler();
                    timerHandler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            computerTurn();
                        }
                    }, 1000);
                }

            }else{

                Toast toast = Toast.makeText(getApplicationContext(), "Box has already been taken", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                toast.show();
            }
        }
        else{

            Toast toast = Toast.makeText(getApplicationContext(), "Cannot play in that box", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
            toast.show();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void computerTurn(){

        makeGoodChoice();

        checkMove();
        checkWin();
        enableButtons();
    }

    public void disableButtons(){
        for(int i = 0; i<9; i++){
            for(int j= 0;j<9;j++){
                buttons[i][j].setEnabled(false);
            }
        }
    }

    public void enableButtons(){
        for(int i = 0; i<9; i++){
            for(int j= 0;j<9;j++){
                buttons[i][j].setEnabled(true);
            }
        }
        messageBox.setText("Players's Turn, Choose a Highlighted Square");
    }

    public void checkWin(){
        for(int i = 0; i<9;i++){
            String check = checkSmallWin(buttonValues[i]);
            if(!check.equals("")){
                if(largeBoard[i].equals("")){
                    largeBoard[i] = check;
                    String tempString;
                    if(check.equals("computer")){
                        tempString = "O";
                    }else{
                        tempString = "X";
                    }
                    for(int j = 0; j<9; j++){
                        buttons[i][j].setText(tempString);
                        buttonValues[i][j] = check;
                    }
                }
            }
        }

        String win = checkSmallWin(largeBoard);
        if(!win.equals("")){
            gameOver = true;
            AlertDialog alertDialog = new AlertDialog.Builder(GamePage.this).create();
            alertDialog.setTitle("Winner!");
            alertDialog.setMessage("The winner is: " + win);
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Restart",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            initializeButtons();
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        }
    }

    public String checkSmallWin(String[] array){

        if(array[0].equals(array[1]) && array[0].equals(array[2]) && !array[0].equals("")){
            return array[0];
        }else if(array[3].equals(array[4]) && array[3].equals(array[5]) && !array[3].equals("")){
            return array[3];
        }else if(array[6].equals(array[7]) && array[6].equals(array[8]) && !array[6].equals("")){
            return array[6];
        }else if(array[0].equals(array[3]) && array[0].equals(array[6]) && !array[0].equals("")){
            return array[0];
        }else if(array[1].equals(array[4]) && array[1].equals(array[7]) && !array[1].equals("")){
            return array[1];
        }else if(array[2].equals(array[5]) && array[2].equals(array[8]) && !array[2].equals("")){
            return array[2];
        }else if(array[0].equals(array[4]) && array[0].equals(array[8]) && !array[0].equals("")){
            return array[0];
        }else if(array[2].equals(array[4]) && array[2].equals(array[6]) && !array[2].equals("")){
            return array[2];
        }

        return "";
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void highlightButtons(int num1, int num2){

        for(int i = 0; i<9; i++){
            for(int j= 0; j<9; j++){
                buttons[i][j].setBackgroundResource(android.R.drawable.btn_default);
            }
        }

        buttons[num1][num2].setBackground(getResources().getDrawable(R.drawable.my_button_bg));
        for(int i = 0; i<9; i++){
            buttons[num2][i].setBackground(getResources().getDrawable(R.drawable.my_button_bg));
        }
    }

    public void checkMove(){
        ArrayList<Integer> possibleChoices = new ArrayList<Integer>();
        for(int i = 0; i<9; i++){
            if(buttonValues[box][i] == ""){
                possibleChoices.add(i);
            }
        }
        if(possibleChoices.size() == 0){
            box = -1;
            for(int i = 0; i<9; i++){
                for(int j= 0; j<9; j++){
                    buttons[i][j].setBackgroundResource(android.R.drawable.btn_default);
                }
            }
            Toast toast = Toast.makeText(getApplicationContext(), "No Choices Available, Player can select any location", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
            toast.show();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void makeBadChoice(){
        boolean check = false;

        ArrayList<Integer> possibleChoices = new ArrayList<Integer>();
        for(int i = 0; i<9; i++){
            if(buttonValues[box][i] == ""){
                possibleChoices.add(i);
            }
        }
        if(possibleChoices.size()==0){
            Toast toast = Toast.makeText(getApplicationContext(), "No Choices Available, Computer can select any location", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
            toast.show();

            while(!check){

                Random random = new Random(System.currentTimeMillis());
                int number = random.nextInt(8);
                int number2 = random.nextInt(8);
                if(buttonValues[number][number2].equals("")){
                    buttons[number][number2].setText("O");
                    buttonValues[number][number2] = "computer";
                    highlightButtons(number, number2);
                    check = true;
                    box = number2;
                }

            }

        }else{
            Random random = new Random(System.currentTimeMillis());
            int number = random.nextInt(possibleChoices.size());
            int value = possibleChoices.get(number);
            buttons[box][value].setText("O");
            buttonValues[box][value] = "computer";
            highlightButtons(box, value);
            check = true;
            box = value;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void makeGoodChoice(){
        boolean check = false;

        ArrayList<Integer> possibleChoices = new ArrayList<Integer>();
        for(int i = 0; i<9; i++){
            if(buttonValues[box][i] == ""){
                possibleChoices.add(i);
            }
        }
        if(possibleChoices.size()==0) {
            Toast toast = Toast.makeText(getApplicationContext(), "No Choices Available, Computer can select any location", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();

            for(int i = 0; i<9;i++){
                int value = checkForPairs(i);
                if(value != -1 && check == false){
                    buttons[i][value].setText("O");
                    buttonValues[i][value] = "computer";
                    highlightButtons(i, value);
                    check = true;
                    box = value;
                }
            }
        }else{
            int value = checkForPairs(box);
            if(value != -1 && check == false){
                buttons[box][value].setText("O");
                buttonValues[box][value] = "computer";
                highlightButtons(box, value);
                check = true;
                box = value;
            }else{
                makeBadChoice();
            }
        }

    }

    public int checkForPairs(int number){

        if(buttonValues[number][0].equals(buttonValues[number][1]) && !buttonValues[number][0].equals("") && buttonValues[number][2].equals("")){
            return 2;
        }else if(buttonValues[number][0].equals(buttonValues[number][3]) && !buttonValues[number][0].equals("") && buttonValues[number][6].equals("")){
            return 6;
        }else if(buttonValues[number][0].equals(buttonValues[number][4]) && !buttonValues[number][0].equals("") && buttonValues[number][8].equals("")){
            return 8;
        }else if(buttonValues[number][1].equals(buttonValues[number][2]) && !buttonValues[number][1].equals("") && buttonValues[number][0].equals("")){
            return 0;
        }else if(buttonValues[number][1].equals(buttonValues[number][4]) && !buttonValues[number][1].equals("") && buttonValues[number][7].equals("")){
            return 7;
        }else if(buttonValues[number][2].equals(buttonValues[number][5]) && !buttonValues[number][2].equals("") && buttonValues[number][8].equals("")){
            return 8;
        }else if(buttonValues[number][2].equals(buttonValues[number][4]) && !buttonValues[number][2].equals("") && buttonValues[number][6].equals("")){
            return 6;
        }else if(buttonValues[number][3].equals(buttonValues[number][4]) && !buttonValues[number][3].equals("") && buttonValues[number][5].equals("")){
            return 5;
        }else if(buttonValues[number][3].equals(buttonValues[number][6]) && !buttonValues[number][3].equals("") && buttonValues[number][0].equals("")){
            return 0;
        }else if(buttonValues[number][4].equals(buttonValues[number][5]) && !buttonValues[number][4].equals("") && buttonValues[number][3].equals("")){
            return 3;
        }else if(buttonValues[number][4].equals(buttonValues[number][6]) && !buttonValues[number][4].equals("") && buttonValues[number][2].equals("")){
            return 2;
        }else if(buttonValues[number][4].equals(buttonValues[number][7]) && !buttonValues[number][4].equals("") && buttonValues[number][1].equals("")){
            return 1;
        }else if(buttonValues[number][4].equals(buttonValues[number][8]) && !buttonValues[number][4].equals("") && buttonValues[number][0].equals("")){
            return 0;
        }else if(buttonValues[number][5].equals(buttonValues[number][8]) && !buttonValues[number][5].equals("") && buttonValues[number][2].equals("")){
            return 2;
        }else if(buttonValues[number][6].equals(buttonValues[number][7]) && !buttonValues[number][6].equals("") && buttonValues[number][8].equals("")){
            return 8;
        }else if(buttonValues[number][7].equals(buttonValues[number][8]) && !buttonValues[number][7].equals("") && buttonValues[number][6].equals("")){
            return 6;
        }

        return -1;
    }

}

