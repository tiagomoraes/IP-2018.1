package lista02;
import java.util.Scanner;

public class InnCrossroads {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int exp, cont, numT, digit2;
		double x, termo, soma, resultado, i, fat;
		
		x = in.nextDouble();
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
			resultado = Math.abs(x - soma);
			
			if(digit2 == 0) {
				resultado = 0;
			} 
			System.out.printf("%.10f\n", resultado);
			
			x = in.nextInt();
			numT = in.nextInt() - 1;
			digit2 = numT + 1;
			cont = 1;
			soma = 0;
			exp = 2;
			fat = 3;
		}
		
	}
}
