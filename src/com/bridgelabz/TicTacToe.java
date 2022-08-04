package com.bridgelabz;

import java.util.Scanner;

public class TicTacToe {
	
	private static char[] board = new char[10];
	
	private static char player1;
	
	static Scanner sc = new Scanner(System.in);
	
	/***
	 * UC-1 - This method is Assigning method to Board Array
	 */
	
	static void startGame( ) {
		for(int i = 1; i <=9; i++) {
			board[i] = ' ';
		}
			
	}
	
	/**
	 * UC-2 - Taking playing symbol from user as X or O only.
	 */
	
	static void playerInput() {
		System.out.println("Player 1 Please Select the Symbol (X/O) : ");
		player1 = sc.next().charAt(0);
		if(player1 == 'X' || player1 == 'O') {
			System.out.println("Player 1 Symbol : " +player1);
		} else {
			System.out.println("Invalid Symbol. Please Enter X or O ony.");
			playerInput();			// recursion
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Welcome to Tic Tac Toe Simulation");
		
		startGame();
		
		playerInput();

	}

}
