package lista02;
import java.util.Scanner;

public class TheLongNight {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String linha;
		int tamanho, valorCarac;
		char carac;
		
		while(in.hasNextLine()) {
			linha = in.nextLine();
			tamanho = linha.length();
			
			for(int cont = 0; cont < tamanho; cont++) {
				carac = linha.charAt(cont);
				if(carac == ' ') {
					System.out.print(carac);
				} else if(carac >= 'A' && carac <= 'T') {
					valorCarac = carac + 6;
					carac = (char) valorCarac;
					System.out.print(carac);
				} else if(carac > 'T' && carac <= 'Z') {
					valorCarac = carac - 20;
					carac = (char) valorCarac;
					System.out.print(carac);
				} else if(carac >= 'a' && carac <= 't') {
					valorCarac = carac + 6;
					carac = (char) valorCarac;
					System.out.print(carac);
				} else if(carac > 't' && carac <= 'z') {
					valorCarac = carac - 20;
					carac = (char) valorCarac;
					System.out.print(carac);
				} 
			}
		}

	}

}
