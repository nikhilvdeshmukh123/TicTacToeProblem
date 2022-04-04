package com.examples.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
    char[] board = new char[10];
    static char player, computer;
    static Scanner sc = new Scanner(System.in);

    public char[] createBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
        return board;
    }

    public void getPlayerChoice() {
        System.out.println("Choose between X or O : ");
        String input = sc.nextLine();
        player = Character.toUpperCase(input.charAt(0));

        if (player == 'X') {
            computer = 'O';
        }
        else if (player == 'O') {
            computer = 'X';
        }
        else {
            System.out.println("Invalid Choice");
        }
        System.out.println("Your choice : " + player);
        System.out.println("Computer's choice : " + computer);
    }
}
