package lista04;
import java.util.Scanner;

public class ReconstruindoComunicacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int lines, columns, k, a, b, aux, posI, posJ;
		lines = in.nextInt();
		columns = in.nextInt();
		k = in.nextInt();
		
		String command;
		
		int[][] frequencies;
		frequencies = new int[lines][columns];
		
		//Create array of possible frequencies
		for(int i = 0; i < lines; i++) {
			for(int j = 0; j < columns; j++) {
				frequencies[i][j] = in.nextInt();
			}
		}
		
		//While has next command
		while(k > 0) {
			command = in.next();
			a = in.nextInt();
			b = in.nextInt();
			
			//Change lines or columns based on command
			if(command.equals("defesa")) {
				for(int i = 0; i < lines; i++) {					
					aux = frequencies[i][a];
					frequencies[i][a] = frequencies[i][b];
					frequencies[i][b]= aux;
				}
			} else if(command.equals("ataque")) {
				for(int i = 0; i < columns; i++) {
					aux = frequencies[a][i];
					frequencies[a][i] = frequencies[b][i];
					frequencies[b][i]= aux;
				}
			}
			k--;
		}
		
		//Get and print the final position
		posI = in.nextInt();
		posJ = in.nextInt();
		
		System.out.println(frequencies[posI][posJ]);
		
	}

}
