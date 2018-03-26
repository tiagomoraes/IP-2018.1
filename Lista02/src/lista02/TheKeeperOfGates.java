package lista02;
import java.util.Scanner;

public class TheKeeperOfGates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String line, invert;
		int tamanho;
		char carac, caracF;
		
		invert = in.nextLine();
		
		while(in.hasNextLine()) {
			line = in.nextLine();
			invert = line + "\n" + invert;
		}
		
		for(tamanho = invert.length(); tamanho > 0; tamanho--) {
			carac = invert.charAt(tamanho - 1);
			if(carac == 0) {
				caracF = '*';
			} else if(carac == 1) {
				caracF = ')';
			} else if(carac == 2) {
				caracF = '$';
			} else if(carac == 3) {
				caracF = '!';
			} else if(carac == 4) {
				caracF = '+';
			} else if(carac == 5) {
				caracF = '@';
			} else if(carac == 6) {
				caracF = '-';
			} else if(carac == 7) {
				caracF = '/';
			} else if(carac == 8) {
				caracF = '(';
			} else if(carac == 9) {
				caracF = '%';
			}
		}

	}

}
