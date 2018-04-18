package lista04;
import java.util.Scanner;

public class HanSolo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int l, someBase, some;
		l = in.nextInt();
		someBase = 0;
		some = 0;
		
		boolean check;
		check = true;
		
		int[][] square;
		square = new int[l][l];
		
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < l; j++) {
				square[i][j] = in.nextInt();
			}
		}
		for(int i = 0; i < l; i++) {
			someBase+=square[0][i];
		}
		
		//Checking lines
		for(int i = 0; i < l; i++) {			
			for(int j = 0; j < l; j++) {
				some+=square[i][j]; 
			}
			if(some != someBase) {
				check = false;
			}
			some = 0;
		}
		
		//Checking columns
		for(int i = 0; i < l; i++) {			
			for(int j = 0; j < l; j++) {
				some+=square[j][i]; 
			}
			if(some != someBase) {
				check = false;
			}
			some = 0;
		}
		
		//Checking 1st diagonal
		for(int i = 0; i < l; i++) {
			some+=square[i][i];
		}
		if(some != someBase) {
			check = false;
		}
		some = 0;
		
		//Checking 2nd diagonal
		for(int i = l-1, j = 0; i >= 0 && j < l; i--, j++) {
			some+=square[i][j];
		}
		if(some != someBase) {
			check = false;
		}
		some = 0;
				
		if(check == true) {
			System.out.println("A matriz e magica");
		} else {
			System.out.println("A matriz nao e magica");
		}

	}

}
