package lista02;
import java.util.Scanner;

public class InnCrossroads {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x, exp, fat, cont, numT, i, digit2;
		double termo, soma, resultado;
		
		x = in.nextInt();
		numT = in.nextInt() - 1;
		digit2 = numT + 1;
		cont = 1;
		soma = 0;
		exp = 2;
		fat = 3;
		resultado = 0;
		
		while(x != 0 || digit2 != 0) {
			while(numT > 0) {
				i = fat-1;
				while(i > 0) {
					fat = fat*i;
					i--;
				}
				
				termo = Math.pow(x, exp)/fat;
				
				if(cont % 2 == 0) {
					soma = soma - termo;
				} else if(cont == 2) {
					soma = soma + termo;
				} else {
					soma = soma + termo;				
				}
				
				cont++;
				numT--;
				exp+=2;
				fat = exp + 1;
			}
			resultado += Math.abs(x - soma);
			x = in.nextInt();
			numT = in.nextInt() - 1;
			digit2 = numT + 1;
			cont = 1;
			soma = 0;
			exp = 2;
			fat = 3;
		}
		System.out.printf("%.10f", resultado);

	}

}
