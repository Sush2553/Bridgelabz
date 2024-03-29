package com.bridgelabz.SearchingAndSorting;

import java.util.Scanner;



class TicTacToe {
    static final int EMPTY = 0;
    static final int NONE = 0;
    static final int USER = 1;
    static final int COMPUTER = 2;
    static final int boardFull = 3;

    @SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	// 1 = user, 2 = computer
	int turn = USER;
	int[][] board = new int[3][3];
	int move;
	int winner;
//	System.out.println("Enter 1-9 to move");
	print_board(board);

	// While (game not over)
	while(true) 
	{
	    if(turn == USER)
	    {
		System.out.println("Your move");
		move=-1 ;
		while (move<0 || move>9 || board[move/3][move%3] != EMPTY) 
		{
		System.out.println("Please enter your move(0-8): ");
		move = sc.nextInt();
		    
		}
	    } 
	    
	else 
		{
		move = computer_move(board);
		System.out.println("Computer move: " + move);
	    }

	    // Update the board
	    board[(int)(move/3)][move%3] = turn;

	    // if game is over
	    winner = checkWinner(board);
	    
	    print_board(board);

	    if(winner != NONE)
		break;

	    // switch turn
	    if(turn == USER)
	    {
		turn = COMPUTER;
	    } 
	    else {
		turn = USER;
	    }

	}

	// Print out the outcome
	switch(winner) {
	case USER:
	    System.out.println("You won!");
	    break;
	case COMPUTER: 
	    System.out.println("Computer won!");
	    break;
	default:
	    System.out.println("Tie!");
	    break;
	}
    }

    // Print the board
    public static void print_board(int[][] board) 
    {
    	
	System.out.print(printChar(board[0][0]));
	System.out.print("|");
	System.out.print(printChar(board[0][1]));
	System.out.print("|");
	System.out.println(printChar(board[0][2]));
	System.out.println("-----");
	System.out.print(printChar(board[1][0]));
	System.out.print("|");
	System.out.print(printChar(board[1][1]));
	System.out.print("|");
	System.out.println(printChar(board[1][2]));
	System.out.println("-----");
	System.out.print(printChar(board[2][0]));
	System.out.print("|");
	System.out.print(printChar(board[2][1]));
	System.out.print("|");
	System.out.println(printChar(board[2][2]));
    }

    // Return an X or O, depending upon whose move it was
    public static char printChar(int b) {
	switch(b) {
	case EMPTY:
	    return ' ';
	case USER:
	    return 'X';
	case COMPUTER:
	    return 'O';
	}
	return ' ';
    }

    // See if the game is over
    public static int checkWinner(int[][] board) {
	if((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
	    return board[0][0];

	if((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
	    return board[1][0];

	if((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
	    return board[2][0];

	if((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
	    return board[0][0];

	if((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
	    return board[0][1];

	if((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
	    return board[0][2];

	if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
	    return board[0][0];

	if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
	    return board[0][2];

	// Check if the board is full
	if(board[0][0] == EMPTY || 
           board[0][1] == EMPTY || 
           board[0][2] == EMPTY || 
	   board[1][0] == EMPTY ||
	   board[1][1] == EMPTY ||
	   board[1][2] == EMPTY ||
	   board[2][0] == EMPTY ||
	   board[2][1] == EMPTY ||
	   board[2][2] == EMPTY)
	    return NONE;

	return boardFull;
    }

    // Generate a random computer move
    public static int computer_move(int[][] board) {
	int move = (int)(Math.random()*9);

	while(board[move/3][move%3] != EMPTY) 
	    move = (int)(Math.random()*9);

	return move;
    }
}
