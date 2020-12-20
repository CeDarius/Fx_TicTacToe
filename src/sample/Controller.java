package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    Button zero, one, two, three, four, five, six, seven, eight, reset;
    Button[] buttons;
    @FXML
    Label labelPlayer, lzero, lone, ltwo, lthree, lfour, lfive, lsix, lseven, leight, labelWinner;
    Label[] labels;
    char[] table = new char[9];
    int sequence = 0;
    boolean zeroIsFinished, oneIsFinished, twoIsFinished, threeIsFinished, fourIsFinished, fiveIsFinished,
            sixIsFinished, sevenIsFinished, eightIsFinished;
    boolean[] isFinished;
    boolean isSetButtonsLabels = false;
    String playerOne = "Ready Player One";
    String playerTwo = "Ready Player Two";

    @FXML
    public void buttonClick(ActionEvent e) {
        if(!isSetButtonsLabels) setButtonsLabels();
        for(int i = 0; i < 9; i++){
            if((buttons[i] == e.getSource()) && !isFinished[i]){
                if(sequence % 2 == 0) {
                    labels[i].setText("X");
                    table[i] = 'x';
                    labelPlayer.setText(playerOne);
                }else {
                    labels[i].setText("O");
                    table[i] = 'o';
                    labelPlayer.setText(playerTwo);
                }
                sequence++;
                checkWinner();
                isFinished[i] = true;
            }
        }
    }

    public void setButtonsLabels() {
        buttons = new Button[] {zero, one, two, three, four, five, six, seven, eight};
        labels = new Label[] {lzero, lone, ltwo, lthree, lfour, lfive, lsix, lseven, leight};
        isFinished = new boolean[]{zeroIsFinished, oneIsFinished, twoIsFinished, threeIsFinished, fourIsFinished,
                fiveIsFinished, sixIsFinished, sevenIsFinished, eightIsFinished};
        isSetButtonsLabels = true;
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
            lockButtons();
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
            lockButtons();
        }
    }

    @FXML
    public void doReset(ActionEvent e) {
        for(int i = 0; i < 9; i++){
            isFinished[i] = false;
            table[i] = 'a';
            sequence = 0;
            labels[i].setText("");
            labelWinner.setText("");
            labelPlayer.setText(playerOne);
            isSetButtonsLabels = false;
        }
    }

    public void lockButtons() {
        for(int i = 0; i < 9; i++){
            isFinished[i] = true;
        }
    }



}
