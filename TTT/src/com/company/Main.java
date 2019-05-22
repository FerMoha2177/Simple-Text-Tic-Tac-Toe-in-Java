package com.company;

import javax.swing.*;

public class Main {
    public Main(){
        //main constructor
        JFrame win = new JFrame("TTT");

        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);

    }
    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
