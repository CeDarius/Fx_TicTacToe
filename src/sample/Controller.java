package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Random;

public class Controller {

    @FXML
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, reset;
    @FXML
    Label labelPlayer, l0, l1, l2, l3, l4, l5, l6, l7, l8, labelWinner;

    char[] table = new char[9];

    boolean pressed0, pressed1, pressed2, pressed3, pressed4, pressed5, pressed6, pressed7, pressed8, isSetLabelsButtons;

    String playerOne = "Ready Player One";

    Button[][] buttons;
    Label[][] labels;
    boolean[][] isPressed;
    char[][] xo = new char[8][3];
    Random random = new Random();

    @FXML
    public void zeroClick(ActionEvent e) {
        if(!pressed0){
            l0.setText("X");
            xo[0][0] = 'X';
            xo[3][0] = 'X';
            xo[6][0] = 'X';
            oAutoMove();
        }
        pressed0 = true;
    }
    @FXML
    public void oneClick(ActionEvent e) {
        if(!pressed1){
            l1.setText("X");
            xo[0][1] = 'X';
            xo[4][0] = 'X';
            oAutoMove();
        }
        pressed1 = true;
    }
    @FXML
    public void twoClick(ActionEvent e) {
        if(!pressed2){
            l2.setText("X");
            xo[0][2] = 'X';
            xo[5][0] = 'X';
            xo[7][0] = 'X';
            oAutoMove();
        }
        pressed2 = true;
    }
    @FXML
    public void threeClick(ActionEvent e) {
        if (!pressed3) {
            l3.setText("X");
            xo[1][0] = 'X';
            xo[3][1] = 'X';
            oAutoMove();
        }
        pressed3 = true;
    }
    @FXML
    public void fourClick(ActionEvent e) {
        if(!pressed4){
            l4.setText("X");
            xo[1][1] = 'X';
            xo[4][1] = 'X';
            xo[6][1] = 'X';
            xo[7][1] = 'X';
            oAutoMove();
        }
        pressed4 = true;
    }
    @FXML
    public void fiveClick(ActionEvent e) {
        if(!pressed5){
            l5.setText("X");
            xo[1][2] = 'X';
            xo[5][1] = 'X';
            oAutoMove();
        }
        pressed5 = true;
    }
    @FXML
    public void sixClick(ActionEvent e) {
        if(!pressed6){
            l6.setText("X");
            xo[2][0] = 'X';
            xo[3][2] = 'X';
            xo[7][2] = 'X';
            oAutoMove();
        }
        pressed6 = true;
    }
    @FXML
    public void sevenClick(ActionEvent e) {
        if(!pressed7){
            l7.setText("X");
            xo[2][1] = 'X';
            xo[4][2] = 'X';
            oAutoMove();
        }
        pressed7 = true;
    }
    @FXML
    public void eightClick(ActionEvent e) {
        if(!pressed8){
            l8.setText("X");
            xo[2][2] = 'X';
            xo[5][2] = 'X';
            xo[6][2] = 'X';
            oAutoMove();
        }
        pressed8 = true;
    }



    public void oAutoMove() {
        System.out.println("Auto");
        /*if(xo[1][1] != 'X') {
            l4.setText("O");
            pressed4 = true;
        } else {
            l8.setText("O");
            pressed8 = true;
        }*/

        for(int i=0; i<8; i++) {
            setLabelsButtons();
            if(xo[i][0] == 'X' && xo[i][1] == 'X'){
                System.out.println("1");
                xo[i][2] = 'O';
                labels[i][2].setText("O");
                isPressed[i][2] = true;
                break;
            } else if(xo[i][0] == 'X' && xo[i][2] == 'X'){
                System.out.println(2);
                xo[i][1] = 'O';
                labels[i][1].setText("O");
                isPressed[i][1] = true;
                break;
            } else if(xo[i][1] == 'X' && xo[i][2] == 'X'){
                System.out.println(3);
                xo[i][0] = 'O';
                labels[i][0].setText("O");
                isPressed[i][0] = true;
                break;
            } else {
                randomMove();
                break;
            }
        }
    }

    public void randomMove() {
        System.out.println("Random");
        int r8 = random.nextInt(8);
        int r3 = random.nextInt(3);
        System.out.println(r8 + " + " + r3);
        if ((xo[r8][r3] != 'X') && (xo[r8][r3] != 'O')) {
            System.out.println(xo[r8][r3]);
            System.out.println("in if");
            xo[r8][r3] = 'O';
            labels[r8][r3].setText("O");
            isPressed[r8][r3] = true;
            System.out.println(isPressed[r8][r3]);

        } else {

        }
    }

    public void setLabelsButtons() {
        if(!isSetLabelsButtons) {
            labels = new Label[8][3];
            labels[0][0] = l0; labels[3][0] = l0; labels[6][0] = l0;
            labels[0][1] = l1; labels[4][0] = l1;
            labels[0][2] = l2; labels[5][0] = l2; labels[7][0] = l2;
            labels[1][0] = l3; labels[3][1] = l3;
            labels[1][1] = l4; labels[4][1] = l4; labels[6][1] = l4; labels[7][1] = l4;
            labels[1][2] = l5; labels[5][1] = l5;
            labels[2][0] = l6; labels[3][2] = l6; labels[7][2] = l6;
            labels[2][1] = l7; labels[4][2] = l7;
            labels[2][2] = l8; labels[5][2] = l8; labels[6][2] = l8;
            isPressed = new boolean[8][3];
            isPressed[0][0] = pressed0; isPressed[3][0] = pressed0; isPressed[6][0] = pressed0;
            isPressed[0][1] = pressed1; isPressed[4][0] = pressed1;
            isPressed[0][2] = pressed2; isPressed[5][0] = pressed2; isPressed[7][0] = pressed2;
            isPressed[1][0] = pressed3; isPressed[3][1] = pressed3;
            isPressed[1][1] = pressed4; isPressed[4][1] = pressed4; isPressed[6][1] = pressed4; isPressed[7][1] = pressed4;
            isPressed[1][2] = pressed5; isPressed[5][1] = pressed5;
            isPressed[2][0] = pressed6; isPressed[3][2] = pressed6; isPressed[7][2] = pressed6;
            isPressed[2][1] = pressed7; isPressed[4][2] = pressed7;
            isPressed[2][2] = pressed8; isPressed[5][2] = pressed8; isPressed[6][2] = pressed8;
        }
        isSetLabelsButtons = true;
    }



    public void checkWinner() {
        if((table[0]=='x' && table[1]=='x' && table[2]=='x') ||
                (table[3]=='x' && table[4]=='x' && table[5]=='x') ||
                (table[6]=='x' && table[7]=='x' && table[8]=='x') ||
                (table[0]=='x' && table[3]=='x' && table[6]=='x') ||
                (table[1]=='x' && table[4]=='x' && table[7]=='x') ||
                (table[2]=='x' && table[5]=='x' && table[8]=='x') ||
                        (table[0]=='x' && table[4]=='x' && table[8]=='x') ||
                        (table[2]=='x' && table[4]=='x' && table[6]=='x')) {
            labelPlayer.setText("");
            labelWinner.setText("Winner Player One");
            pressed0 = true;
            pressed1 = true;
            pressed2 = true;
            pressed3 = true;
            pressed4 = true;
            pressed5 = true;
            pressed6 = true;
            pressed7 = true;
            pressed8 = true;
        } else if ((table[0]=='o' && table[1]=='o' && table[2]=='o') ||
                (table[3]=='o' && table[4]=='o' && table[5]=='o') ||
                (table[6]=='o' && table[7]=='o' && table[8]=='o') ||
                (table[0]=='o' && table[3]=='o' && table[6]=='o') ||
                (table[1]=='o' && table[4]=='o' && table[7]=='o') ||
                (table[2]=='o' && table[5]=='o' && table[8]=='o') ||
                (table[0]=='o' && table[4]=='o' && table[8]=='o') ||
                (table[2]=='o' && table[4]=='o' && table[6]=='o')) {
            labelPlayer.setText("");
            labelWinner.setText("Winner Player Two");
            pressed0 = true;
            pressed1 = true;
            pressed2 = true;
            pressed3 = true;
            pressed4 = true;
            pressed5 = true;
            pressed6 = true;
            pressed7 = true;
            pressed8 = true;
        }
        System.out.println("check over");
    }

    @FXML
    public void doReset(ActionEvent e) {
        pressed0 = false;
        pressed1 = false;
        pressed2 = false;
        pressed3 = false;
        pressed4 = false;
        pressed5 = false;
        pressed6 = false;
        pressed7 = false;
        pressed8 = false;
        table = new char[]{'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
        l0.setText("");
        l1.setText("");
        l2.setText("");
        l3.setText("");
        l4.setText("");
        l5.setText("");
        l6.setText("");
        l7.setText("");
        l8.setText("");
        labelWinner.setText("");
        labelPlayer.setText(playerOne);
    }





}
