package lista02;
import java.util.Scanner;

public class TheLongNight {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String linha, resposta;
		int tamanho, valorCarac;
		char carac;
		
		resposta = "";
		
		while(in.hasNext()) {
			linha = in.nextLine();
			tamanho = linha.length();
			
			for(int cont = 0; cont < tamanho; cont++) {
				carac = linha.charAt(cont);
				if(carac == ' ') {
				} else if(carac >= 'A' && carac <= 'T') {
					valorCarac = carac + 6;
					carac = (char) valorCarac;
				} else if(carac > 'T' && carac <= 'Z') {
					valorCarac = carac - 20;
					carac = (char) valorCarac;
				} else if(carac >= 'a' && carac <= 't') {
					valorCarac = carac + 6;
					carac = (char) valorCarac;
				} else if(carac > 't' && carac <= 'z') {
					valorCarac = carac - 20;
					carac = (char) valorCarac;
				} 
				
				resposta = resposta + carac;
			}
				System.out.println(resposta);
				resposta = "";
			
		}

	}

}
