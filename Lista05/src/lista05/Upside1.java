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
		
		if(move(labirinto, posX, posY, 'a')) {
			System.out.println("RUN!");
		} else {
			System.out.println("Welcome to the Upside Down.");
		}
	}
	
	public static boolean move(int[][]labirinto, int x, int y, char ult) {
		boolean resposta;
		if(x == 9 && y == 9) {
			resposta = true;
		} else if(x < 9 && labirinto[x+1][y] == 1 && ult != 's') {
			resposta = move(labirinto, x+1, y, 'n');
		} else if(y < 9 && labirinto[x][y+1] == 1 && ult != 'l') {
			resposta = move(labirinto, x, y+1, 'o');
		} else if(x > 0 && labirinto[x-1][y] == 1 && ult != 'n') {
			resposta = move(labirinto, x-1, y, 's');
		} else if(y > 0 && labirinto[x][y-1] == 1 && ult != 'o') {
			resposta = move(labirinto, x, y-1, 'l');
		} else {
			resposta = false;
		}
		return resposta;
	}

}
