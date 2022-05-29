package com.bridgelabz;

import java.util.Scanner;


public class TicTacToe {

    void createBoard(char[] ch) {
        for (int i = 1; i < 10; i++) {
            ch[i] = ' ';
        }
    }

    char playerChoice() {

        System.out.println("Enter your choice X or O.....");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }

    void showBoard(char choice, char ch[]) {

        System.out.println("Enter desired position......");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();
        if (ch[position] != ' ') {
            System.out.println("The selected position is already occupied...");
        } else {
            ch[position] = choice;
            System.out.println(" " + ch[1] + " | " + ch[2] + " | " + ch[3] + " \n----------\n " + ch[4] + " | " + ch[5] + " | " + ch[6] + " \n----------\n " + ch[7] + " | " + ch[8] + " | " + ch[9] + " ");
        }
    }

        public static void main (String[]args){

            System.out.println("Welcome to Tic Tac Toe game.....");

            char[] ch = new char[10];
            TicTacToe t1 = new TicTacToe();
            t1.createBoard(ch);

            char choice = t1.playerChoice();
            char choice1;
            char choice2;

            if (choice == 'X') {
                System.out.println("Player choose X & computer got O....");
                choice1 = choice;
                choice2 = 'O';
            } else {
                System.out.println("Player choose O & computer got X....");
                choice1 = choice;
                choice2 = 'X';
            }

            t1.showBoard(choice, ch);
        }

    }

