package sergioPistolou;
import java.util.Scanner;

public class HuxleyCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, tamanhoLinha;
		Integer elemento;
		String entrada;
		n = in.nextInt();
		Lista[] arrayListas = new Lista[n];
		
		for(int i = 0; i < n; i++) {
			tamanhoLinha = in.nextInt();
			for(int j = 0; j < tamanhoLinha; j++) {
				elemento = in.nextInt();
				arrayListas[i].inserir(elemento);
			}
		}
		
		entrada = in.nextLine();
	}

}
