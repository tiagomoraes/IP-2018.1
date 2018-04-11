package lista03;
import java.util.Scanner;

public class SentimentosSão {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, aux;
		n = in.nextInt();
		if(in.hasNextLine()) {			
			in.nextLine();
		}
		
		boolean jaCad;
		jaCad = false;
		
		String[] comandos, produtos, produtosFinal;
		int[] quant, quantFinal;
		
		comandos = new String[n];
		produtos = new String[n];
		produtosFinal = new String[n];
		produtosFinal = new String[n];
		
		quant = new int[n];
		quantFinal = new int[n];
		
		for(int i = 0; i < n; i++) {
			produtosFinal[i] = "nulo";
		}
		
		for(int i = 0; i < n; i++) {
			comandos[i] = in.nextLine();
			produtos[i] = "nulo";
			if(comandos[i].equals("Registro")||comandos[i].equals("Venda")||comandos[i].equals("Recarga")) {				
				produtos[i] = in.nextLine();
			} else {
				System.out.println("Comando invalido");				
			}
			
			if(comandos[i].equals("Registro")) {
				for(int j = 0; j < i; j++) {
					if(produtos[j].equals(produtos[i])) {
						jaCad = true;
					}
				}
				if(jaCad == true) {					
					System.out.println("Produto ja registrado");
					produtos[i] = "nulo";
					jaCad = false;
				} else {
					System.out.println("Produto registrado com sucesso");
					produtosFinal[i] = produtos[i];
				}
			}
			
			if(comandos[i].equals("Venda")) {
				for(int j = 0; j < i; j++) {
					if(produtos[j].equals(produtos[i])) {
						jaCad = true;
						quant[i] += quant[j];
						produtos[j] = "nulo";
					}
				}
				if(jaCad == true) {	
					aux = in.nextInt();
					if(in.hasNextLine()) {			
						in.nextLine();
					}
					if(quant[i] >= aux && aux >= 0) {						
						quant[i] -= aux;
						System.out.println("Venda realizada com sucesso");
						aux = 0;
					} else if (aux < 0) {
						System.out.println("Comando invalido");
						aux = 0;
					} else {
						System.out.println("Sem estoque para a Venda");
					}
					jaCad = false;
				} else {
					System.out.println("Produto nao registrado");
					produtos[i] = "nulo";
				}
			}
			
			if(comandos[i].equals("Recarga")) {
				for(int j = 0; j < i; j++) {
					if(produtos[j].equals(produtos[i])) {
						jaCad = true;
						quant[i] += quant[j];
						produtos[j] = "nulo";
					}
				}
				if(jaCad == true) {					
					quant[i] += in.nextInt();
					if(in.hasNextLine()) {			
						in.nextLine();
					}
					jaCad = false;
					System.out.println("Recarga realizada com sucesso");
				} else {
					System.out.println("Produto nao registrado");
					produtos[i] = "nulo";
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(produtos[j].equals(produtosFinal[i]) && !produtos[j].equals("nulo")) {
					quantFinal[i] += quant[j];
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(!produtosFinal[i].equals("nulo")) {
				System.out.printf("%s: %d\n", produtosFinal[i], quantFinal[i]);
			}
		}
		
	}

}
