package lista03;
import java.util.Scanner;

public class TeoriaBrancaNeve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, numAnoes, comidaFinal;
		n = in.nextInt();
		if(in.hasNextLine()){
		in.nextLine();
		}
		numAnoes = 0;
		comidaFinal = 0;
		
		boolean teste, jaEntrou;
		String termo1, termo2;
		
		String[] comandos, op, anoes;
		int[] comida;
		
		comandos = new String[n];
		op = new String[n];
		anoes = new String[n];
		comida = new int[n];
		
		jaEntrou = false;
		
		for(int i = 0; i < n; i++) {
			termo1 = "";
			termo2 = "";
			comandos[i] = in.nextLine();
			if(comandos[i].charAt(0) == 'E') {				
				comida[i] = in.nextInt();
				if(in.hasNextLine()){
				    in.nextLine();
				}
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
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(anoes[i].equals(anoes[j])){
					jaEntrou = true;
				}
			}
			
			if(op[i].charAt(0) == 'E' && jaEntrou == false) {
				System.out.printf("%s entrou e gostaria de %dg de comida.\n", anoes[i], comida[i]);
			} else if(op[i].charAt(0) == 'E' && jaEntrou == true) {
				System.out.println("Anao ja estava em casa.");
				anoes[i] = "vazio";
				comida[i] = 0;
			}
			
			if(op[i].charAt(0) == 'S' && jaEntrou == true) {
				System.out.println(anoes[i] + " saiu de casa.");
				for(int j = 0; j < i; j++) {
					if(anoes[i].equals(anoes[j])){
						anoes[i] = "vazio";
						anoes[j] = "vazio";	
						comida[i] = 0;
						comida[j] = 0;
					}
				}
			} else if(op[i].charAt(0) == 'S' && jaEntrou == false) {
				System.out.println(anoes[i] + " nao estava na casa.");
				anoes[i] = "vazio";
			}
			
			jaEntrou = false;
		}
		
		System.out.println("");
		
		for(int i = 0; i < n; i++) {
			if(!anoes[i].equals("vazio")) {
				numAnoes++;
				comidaFinal += comida[i];
			}
		}
		if(numAnoes == 7) {
			System.out.println("teoria da branca de neve: porque so ter um se eu posso ter sete?");
		} else {
			System.out.printf("Estao na casa %d anoes:\n", numAnoes);
		}
		
		for(int i = 0; i < n; i++) {
			if(!anoes[i].equals("vazio")) {
				System.out.println(anoes[i]);
			}
		}
		
		System.out.print(comidaFinal);

	}

}
