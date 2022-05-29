package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {

    void uc1 (char [] ch) {
        for(int i=1;i<10;i++) {
            ch[i] = ' ';
        }
    }

    char uc2() {

        System.out.println("Enter your choice X or O.....");
        Scanner scanner = new Scanner(System.in);
        return scanner.next(). charAt(0);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe game.....");

        char [] ch = new char[10];
        TicTacToe t1 = new TicTacToe();
        t1.uc1(ch);

        char choice = t1.uc2();
        char choice1;
        char choice2;

        if (choice == 'X'){
            System.out.println("Player choose X & computer got O....");
            choice1 = choice;
            choice2 = 'O';
        }else {
            System.out.println("Player choose O & computer got X....");
            choice1 = choice;
            choice2 = 'X';
        }
    }

}
