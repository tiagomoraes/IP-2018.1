package lista05;
import java.util.Scanner;

public class Upside1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] labirinto;
		labirinto = new int[10][10];
		
		int posX, posY;
		posX = posY = 0;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				labirinto[i][j] = in.nextInt();
			}
		}
	}
	
	public static int move(int[]labirinto, int posX, int posY) {
		
		if()
	}

}
