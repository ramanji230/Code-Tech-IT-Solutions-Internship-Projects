package codeTech_IT_Solutions.com;

import java.util.Scanner;


public class HumanPlayer extends TicTacToe {
	

	String name;
	char mark;
	public HumanPlayer(String name, char mark) {
		
		this.name = name;
		this.mark = mark;
	}
	
	void makeMove() {
	    
		Scanner ip = new Scanner(System.in);
		int row;
		int col;
		System.out.println("Enter row and col with 0 to 2");
		do {
			row=ip.nextInt();
			col=ip.nextInt();
			
		}while( ! isValidMove(row, col));
		TicTacToe.placeMark(row, col, mark);
	}
	
	boolean isValidMove(int row, int col) {
            if(row >=0 && row <=2 &&
            		col >=0 && col <=2) 
            {
            	if(TicTacToe.board[row][col] == ' ') {
            		return true;
            	}
            }
            return false;
	}
	
	

}





