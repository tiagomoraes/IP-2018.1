package lista04;
import java.util.Scanner;

public class GladiadorGalaxias {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, line, column, pointsA, pointsB;
		n = in.nextInt();
		pointsA = 0;
		pointsB = 0;
		
		String commandA, commandB;
		
		int[][] boardA, boardB;
		boardA = new int[9][9];
		boardB = new int[9][9];
		
		//Fill the board arrays
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				boardA[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				boardB[i][j] = in.nextInt();
			}
		}
		
		while(n > 0) {			
			//Get the following 2 commands
			commandA = in.next();
			commandB = in.next();
			
			//Transform commands into int ad check if we have "1"
			line = commandA.charAt(0) - 65;
			column = commandA.charAt(1) - 49;
			
			if(boardB[line][column] == 1) {
				boardB[line][column] = 0;
				pointsA++;
			}
			
			line = commandB.charAt(0) - 65;
			column = commandB.charAt(1) - 49;
			
			if(boardA[line][column] == 1) {
				boardA[line][column] = 0;
				pointsB++;
			}
			
			n-=2;
		}
		
		//Compare who has more points
		if(pointsA > pointsB) {
			System.out.println("O jogador A venceu");
		} else if(pointsB > pointsA) {
			System.out.println("O jogador B venceu");
		} else {
			System.out.println("Empate");
		}

	}

}
