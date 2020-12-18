package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    Button zero, one, two, three, four, five, six, seven, eight, reset;
    @FXML
    Label labelPlayer, lzero, lone, ltwo, lthree, lfour, lfive, lsix, lseven, leight, labelWinner;

    char[] table = new char[9];
    int sequence;
    boolean zeroIsFinished = false;
    boolean oneIsFinished = false;
    boolean twoIsFinished = false;
    boolean threeIsFinished = false;
    boolean fourIsFinished = false;
    boolean fiveIsFinished = false;
    boolean sixIsFinished = false;
    boolean sevenIsFinished = false;
    boolean eightIsFinished = false;
    String playerOne = "Ready Player One";
    String playerTwo = "Ready Player Two";



    @FXML
    public void zeroClick(ActionEvent e) {
        if(!zeroIsFinished){
            if(sequence % 2 == 0) {
                lzero.setText("X");
                table[0] = 'x';
            }else {
                lzero.setText("O");
                table[0] = 'o';
            }
        }
        sequence++;
        zeroIsFinished = true;
        playerSequence();
        checkWinner();
    }
    @FXML
    public void oneClick(ActionEvent e) {
        if(!oneIsFinished){
            if(sequence % 2 == 0) {
                lone.setText("X");
                table[1] = 'x';
            }else {
                lone.setText("O");
                table[1] = 'o';
            }
        }
        sequence++;
        oneIsFinished = true;
        playerSequence();
        checkWinner();
    }
    @FXML
    public void twoClick(ActionEvent e) {
        if(!twoIsFinished){
            if(sequence % 2 == 0) {
                ltwo.setText("X");
                table[2] = 'x';
            }else {
                ltwo.setText("O");
                table[2] = 'o';
            }
        }
        sequence++;
        twoIsFinished = true;
        playerSequence();
        checkWinner();
    }
    @FXML
    public void threeClick(ActionEvent e) {
        if(!threeIsFinished){
            if(sequence % 2 == 0) {
                lthree.setText("X");
                table[3] = 'x';
            }else {
                lthree.setText("O");
                table[3] = 'o';
            }
        }
        sequence++;
        threeIsFinished = true;
        playerSequence();
        checkWinner();
    }
    @FXML
    public void fourClick(ActionEvent e) {
        if(!fourIsFinished){
            if(sequence % 2 == 0) {
                lfour.setText("X");
                table[4] = 'x';
            }else {
                lfour.setText("O");
                table[4] = 'o';
            }
        }
        sequence++;
        fourIsFinished = true;
        playerSequence();
        checkWinner();
    }
    @FXML
    public void fiveClick(ActionEvent e) {
        if(!fiveIsFinished){
            if(sequence % 2 == 0) {
                lfive.setText("X");
                table[5] = 'x';
            }else {
                lfive.setText("O");
                table[5] = 'o';
            }
        }
        sequence++;
        fiveIsFinished = true;
        playerSequence();
        checkWinner();
    }
    @FXML
    public void sixClick(ActionEvent e) {
        if(!sixIsFinished){
            if(sequence % 2 == 0) {
                lsix.setText("X");
                table[6] = 'x';
            }else {
                lsix.setText("O");
                table[6] = 'o';
            }
        }
        sequence++;
        sixIsFinished = true;
        playerSequence();
        checkWinner();
    }
    @FXML
    public void sevenClick(ActionEvent e) {
        if(!sevenIsFinished){
            if(sequence % 2 == 0) {
                lseven.setText("X");
                table[7] = 'x';
            }else {
                lseven.setText("O");
                table[7] = 'o';
            }
        }
        sequence++;
        sevenIsFinished = true;
        playerSequence();
        checkWinner();
    }
    @FXML
    public void eightClick(ActionEvent e) {
        if(!eightIsFinished){
            if(sequence % 2 == 0) {
                leight.setText("X");
                table[8] = 'x';
            }else {
                leight.setText("O");
                table[8] = 'o';
            }
        }
        sequence++;
        eightIsFinished = true;
        playerSequence();
        checkWinner();
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
            zeroIsFinished = true;
            oneIsFinished = true;
            twoIsFinished = true;
            threeIsFinished = true;
            fourIsFinished = true;
            fiveIsFinished = true;
            sixIsFinished = true;
            sevenIsFinished = true;
            eightIsFinished = true;
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
            zeroIsFinished = true;
            oneIsFinished = true;
            twoIsFinished = true;
            threeIsFinished = true;
            fourIsFinished = true;
            fiveIsFinished = true;
            sixIsFinished = true;
            sevenIsFinished = true;
            eightIsFinished = true;
        }
        System.out.println("check over");
    }

    @FXML
    public void doReset(ActionEvent e) {
        zeroIsFinished = false;
        oneIsFinished = false;
        twoIsFinished = false;
        threeIsFinished = false;
        fourIsFinished = false;
        fiveIsFinished = false;
        sixIsFinished = false;
        sevenIsFinished = false;
        eightIsFinished = false;
        table = new char[]{'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a', 'a'};
        sequence = 0;
        lzero.setText("");
        lone.setText("");
        ltwo.setText("");
        lthree.setText("");
        lfour.setText("");
        lfive.setText("");
        lsix.setText("");
        lseven.setText("");
        leight.setText("");
        labelWinner.setText("");
        labelPlayer.setText(playerOne);
    }

    public void playerSequence() {
        if(sequence % 2 == 0) {
            labelPlayer.setText(playerOne);
        }else {
            labelPlayer.setText(playerTwo);
        }
    }



}
