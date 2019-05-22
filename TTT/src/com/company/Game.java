package com.company;

import javafx.scene.control.Cell;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;


/**
 * Created by Ferris on 11/27/2016.
 */
public class Game extends JFrame {
    private char pX = 'X';
    private char pO = 'O';

    private Cell[][] gameBoard = new Cell[3][3]; //grid
    JLabel jlblStatus = new JLabel("Player X's turn");

    public Game(){
        int num = 3;
        JPanel myPanel = new JPanel(new GridLayout(3,3,0,0));
        for(int r = 0;r < num ; r++) {
            for (int c = 0; c < num; c++) {
                myPanel.add(gameBoard[r][c] = new Cell());
            }
        }
        myPanel.setBorder(new LineBorder(Color.red, 1));
        jlblStatus.setBorder(new LineBorder(Color.yellow,1));
        add(myPanel, BorderLayout.CENTER);
        add(jlblStatus,BorderLayout.SOUTH);

    }

    public boolean isFull(){
        for(int r = 0;r < 3 ; r++){
            for(int c = 0;c < 3 ; c++){
                if(gameBoard[r][c].getToken() == ' '){return false;}
            }
        }
        return true;
    }
    public boolean victory(char player){
        for(int i = 0; i < 3 ; i++ ){
            if((gameBoard[i][0].getToken()))
        }


    }
}
