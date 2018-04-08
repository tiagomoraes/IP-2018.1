package lista03;
import java.util.Scanner;

public class TeoriaBrancaNeve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		n = in.nextInt();
		in.nextLine();
		
		boolean teste;
		String termo1, termo2;
		
		String[] comandos, op, anoes;
		int[] comida;
		
		comandos = new String[n];
		anoes = new String[n];
		op = new String[n];
		comida = new int[n];
		
		for(int i = 0; i < n; i++) {
			termo1 = "";
			termo2 = "";
			comandos[i] = in.nextLine();
			if(comandos[i].charAt(0) == 'E') {				
				comida[i] = in.nextInt();
				in.nextLine();
			}
			
			teste = false;
			for(int j = 0; j < comandos[i].length(); j++) {
				if(comandos[i].charAt(j) != ':' && teste == false) {
					termo1 = termo1 + comandos[i].charAt(j);
				} else if(comandos[i].charAt(j) != ':' && teste == true) {
					termo2 = termo2 + comandos[i].charAt(j);
				} else if(comandos[i].charAt(j) == ':') {
					teste = true;
				}
			}
			op[i] = termo1;
			anoes[i] = termo2;
		}		
		
		//Algorítimo para criar os arrays

	}

}
