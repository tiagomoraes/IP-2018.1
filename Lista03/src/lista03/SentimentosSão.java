package lista03;
import java.util.Scanner;

public class SentimentosSão {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		n = in.nextInt();
		in.nextLine();
		
		String[] comandos, produtos;
		int[] quant;
		
		comandos = new String[n];
		produtos = new String[n];
		quant = new int[n];
		
		for(int i = 0; i < n; i++) {
			comandos[i] = in.nextLine();
			produtos[i] = in.nextLine();
			if(comandos[i].equals("Venda") || comandos[i].equals("Recarga")) {
				// tem que criar um if para a condição de venda + produto n cadastrado (sem int)
				//if()
				quant[i] = in.nextInt();
			}
		}
		
		//cria os arrays
		

	}

}
