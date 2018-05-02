package lista05;
import java.util.Scanner;

public class Livro1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String text;
		int quantLinhas, total;
		
		text = "";
		quantLinhas = 0;
		
		while(in.hasNextLine()) {
			text += in.nextLine() + "\n";
			quantLinhas++;
		}
		
		String[] livro, livroCerto;
		livro = new String[quantLinhas];
		livroCerto = new String[quantLinhas];
		
		livro = text.split("\n");
		
		total = quantLinhas - 1;
		
		livroCerto = inverter(livro, quantLinhas - 1, total).split("\n");
		for(int i = 0; i < quantLinhas; i++) {
			System.out.println(livroCerto[i]);
		}
		

	}
	
	
	
	public static String inverter(String[] livro, int quantElem, int total) {
		String resposta;
		resposta = "";
		if(quantElem == 0) {
			resposta = livro[total] + "\n";
		} else {
			resposta = inverter(livro, quantElem - 1, total) + livro[total - quantElem] + "\n";
		}
		return resposta;
	}

}
