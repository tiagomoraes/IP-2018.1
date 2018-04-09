package lista03;
import java.util.Scanner;

public class BibbidiBobbidiBoo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int numCasas;
		double tamSapato;
		numCasas = in.nextInt();
		tamSapato = in.nextDouble();
		
		boolean achou;
		achou = false;
		
		int[] casas; 
		double[] tamanhos;
		casas = new int[numCasas];
		tamanhos = new double[numCasas];
		
		for(int i = 0; i < numCasas; i++) {
			casas[i] = in.nextInt();
		}
		
		for(int i = 0; i < numCasas; i++) {
			tamanhos[i] = in.nextDouble();
		}
		
		for(int i = 0; i < numCasas; i++) {
			if(tamanhos[i] == tamSapato) {
				System.out.println("Cinderela mora na casa " + casas[i] + "!");
				achou = true;
			}
		}
		
		if(achou == false) {
			System.out.println("Nenhuma das jovens e a moca do baile.");
		}
		
	}

}
