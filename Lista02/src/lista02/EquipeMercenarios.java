package lista02;
import java.util.Scanner;

public class EquipeMercenarios {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		int n, nA, nB, nC, nVenc;
		double poder, somaA, somaB, somaC, maior, resultado;
		String equipe, vencedor;
		
		n = in.nextInt();
		somaA = 0;
		somaB = 0;
		somaC = 0;
		nA = 0;
		nB = 0;
		nC = 0;
		maior = 0;
		nVenc = 1;
		
		for(int x = 1; x <= n; x++) {
			equipe = in.next();
			poder = in.nextDouble();
			if(equipe.equals("A")) {
				somaA += poder;
				nA++;
			} else if(equipe.equals("B")) {
				somaB += poder;
				nB++;
			} else if(equipe.equals("C")) {
				somaC += poder;
				nC++;
			}
		}
		
		if(somaA < somaB && nB != 0) {
			maior = somaB;
			vencedor = "B";
			nVenc = nB;
		} else {
			maior = somaA;
			vencedor = "A";
			nVenc = nA;
			if(nA == 0 && nB != 0) {
				maior = somaB;
				vencedor = "B";
			}
		}
		if(maior < somaC && nC != 0) {
			maior = somaC;
			vencedor = "C";
			nVenc = nC;
		}
		
		resultado = maior/nVenc;
		System.out.printf("A equipe escolhida foi a %s, com media de: %.2f", vencedor, resultado);

	}

}
