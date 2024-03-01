package codeTech_IT_Solutions.com;



public class MainClass {

	
   public static void main(String[] args) {

 
	   
	   TicTacToe t = new TicTacToe();
		
		HumanPlayer p1 = new HumanPlayer("Thor", 'x');
		HumanPlayer p2 = new HumanPlayer("Jeean", 'o');
	
		HumanPlayer cp = p1;
		while(true) {
		System.out.println(cp.name + " : now Your chance make a move ");
		cp.makeMove();
		TicTacToe.dispBoard();
		if(TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDigWin()) {
			System.out.println(cp.name + " :has won");
			
			break;
		}
		
		else if(TicTacToe.checkDraw()) {
			System.out.println("Game is Draw");
			break;
		}
		
		else {
			if(cp == p1) {
				cp = p2;
			}else {
				cp = p1;
			}
		}
	}
	
	

   }	   
}

