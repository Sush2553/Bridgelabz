package functional_Programs;

import java.util.Scanner;

public class NewTicTac {

	//print board
		void show(char board[][])
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

	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
			NewTicTac t=new NewTicTac();
			char board[][]=new char[3][3];
			int move;
			Scanner sc=new Scanner(System.in);
			//logic to assign numbers for board
			board[0][0]='0';board[0][1]='1';board[0][2]='2';
			board[1][0]='3';board[1][1]='4';board[1][2]='5';
			board[2][0]='6';board[2][1]='7';board[2][2]='8';
			//to print board Structure and numbers 
			t.show(board);
			System.out.println("\n NOTE:Grid with numbers are empty grid.");
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
					if(board[move/3][move%3] =='X' || board[move/3][move%3] =='#') //if invalid move then skip and don't increment i
					{															//if we don't increment i,then it will be again user move(as previous was invalid)
					System.out.println("invalid move");
						continue;
					}
				
				else
					
					{
					i++;		//if valid move increment i,as next move should be computer move
					board[move/3][move%3]='X'; //assign 'X' to grid value
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
					if( board[move/3][move%3] =='X' || board[move/3][move%3] =='#')  //if invalid move then skip and don't increment i
					{
						continue;
					}
					
				 else
				 	{
					 i++;    //if valid move increment i,as next move should be user move
					 board[move/3][move%3]='#';
					 System.out.println("\ncomputer move:"+move);  //display which move computer played
						t.show(board);  //display board
					 
				 	}
				}
			}
			char result=t.checkWinner(board); //check for win
			
			switch(result) 
			{
			case 'X':
			    System.out.println("congrats!!!!You won!");
			    break;
			case '#': 
			    System.out.println("ohhh no...Computer won!");
			    break;
			}
			if(result=='X' || result=='#' ) //if anyone wins,break
				break;
			
			if(i>8 &&(result!='X' || result!='#')) //if no one wins and board is full,print tie..
				System.out.println("tie..");
			}
		}
		
		//logic to check winner
	 char checkWinner(char board[][]) 
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
