package lista05;
import java.util.Scanner;

public class CuidadoDemogorgon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int h, h24, s;
		double chance;
		String period;
		
		h = in.nextInt();
		period = in.next();
		s = in.nextInt();
		h24 = convertHr(h, period);
		chance = func(h24, s);
		
		if(s < 0 || h <=0) {
			System.out.println("Dados Invalidos.");
		} else if(chance >= 100) {
			System.out.printf("A chance de aparecimento de Demogorgon e de %.1f", chance);
			System.out.println("%.");
			System.out.println("Ou seja, nao olhe para tras.");
		} else {
			System.out.printf("A chance de aparecimento de Demogorgon e de %.1f", chance);
			System.out.println("%.");
		}

	}
	
	public static double func(int h24, double s) {
		double resposta;
		resposta = 0;
		
		if(h24 % 24 == 5) {
			resposta = 5;
		} else if(h24 >= 6 && h24 <= 15) {
			if(h24 % 2 == 0) {
				resposta = func(h24 - 1, s) + s/2.0;
			} else {
				resposta = func(h24 - 1, s) + func(h24 - 1, s) % 7;
			}
		} else {
			if(h24 % 2 == 0) {
				resposta = func(h24 - 1, s) + s;
			} else {
				resposta = func(h24 - 1, s) + func(h24 - 1, s) % 10;
			}
		}
		return resposta;
	}
	
	public static int convertHr(int h, String period) {
		int resposta;
		
		if(period.equals("pm") && h == 12) {
			resposta = 12;
		} else if(period.equals("am") && h == 12) {
			resposta = 0;
		} else if(period.equals("pm")) {
			resposta = h + 12;
		} else {
			resposta = h;
		}
		
		if(resposta < 5) {
			resposta+=24;
		}
		return resposta;
	}

}
