package lista01;
import java.util.Scanner;

public class Batalha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String cp = in.nextLine();
		
		char primeiroChar = cp.charAt(0);
		char segundoChar = cp.charAt(1);
		char terceiroChar = cp.charAt(2);
		char quartoChar = cp.charAt(3);
		
		int a = primeiroChar - 48;
		int b = segundoChar - 48;
		int c = terceiroChar - 48;
		int d = quartoChar - 48;
		
		int ab = (a*10) + b;
		int cd = (c*10) + d;
		int abcd = (ab*100) + cd;
		int ef = ab + cd;
		int ef2 = (int) Math.pow(ef, 2);
		
		if (ef2 == abcd) {
			System.out.println("Charmander vitorioso");
		} else {
			System.out.println("Charmander derrotado");
		}

	}

}
