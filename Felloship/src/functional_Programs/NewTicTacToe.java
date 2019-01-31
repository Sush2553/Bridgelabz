package functional_Programs;

import java.util.Scanner;

public class NewTicTacToe {
	
	//display board
	void show(int board[][])
	{
		System.out.println("-------------");
		for(int i=0;i<3;i++)
		{
			System.out.print("|");
			
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+board[i][j]+" ");
				System.out.print("|");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewTicTacToe t=new NewTicTacToe();
		int board[][]=new int[3][3];
		int n=-1,move;
		Scanner sc=new Scanner(System.in);
		//logic to assign numbers for board
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				n++;
				board[i][j]=n;
				
			}
		}
	
		//to print board Structure and numbers 
		t.show(board);
	
	//run loop for 9 times as board is having 9 grids
	for(int i=0;i<9;)
	{ 
		if(i%2==0)	//if i is even then user move
		{
			System.out.println("\nyour turn");
			System.out.println("Please enter your move(0-8): ");
			move = sc.nextInt();
			if (move>=0 && move<9) 
			{
				if(board[move/3][move%3] ==11 || board[move/3][move%3] ==22) //if invalid move then skip and don't increment i
				{															//if we don't increment i,then it will be again user move(as previous was invalid)
				System.out.println("invalid move");
					continue;
				}
			
			else
				
				{
				i++;		//if valid move increment i,as next move should be computer move
				board[move/3][move%3]=11;
				t.show(board);	//print board
				}
			}
		}
		
		else
		{
			//System.out.println("\ncomputer turn");  //if i is odd then computer move
			 move = (int)(Math.random()*9);
			 if(move>=0 && move<9) 
			{
				if( board[move/3][move%3] ==11 || board[move/3][move%3] ==22)  //if invalid move then skip and don't increment i
				{
					continue;
				}
				
			 else
			 	{
				 i++;    //if valid move increment i,as next move should be user move
				 board[move/3][move%3]=22;
				 System.out.println("\ncomputer move:"+move);  //display which move computer played
					t.show(board);  //display board
				 
			 	}
			}
		}
		int result=t.checkWinner(board); //check for win
		
		switch(result) 
		{
		case 11:
		    System.out.println("You won!");
		    break;
		case 22: 
		    System.out.println("Computer won!");
		    break;
		}
		if(result==11 || result==22 ) //if anyone wins,break
			break;
		
		if(i==8 &&(result==11 || result==22)) //if no one wins and board is full,print tie..
			System.out.println("tie..");
		}
	}
	
	//logic to check winner
	 int checkWinner(int board[][]) 
		   {
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
				return 0;

	}
}

