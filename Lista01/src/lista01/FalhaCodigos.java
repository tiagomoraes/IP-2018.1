package lista01;
import java.util.Scanner;

public class FalhaCodigos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String codigo = in.nextLine();
		char pokemon = codigo.charAt(6);
		if (pokemon == 'b') {
			System.out.print("Bulbassauro");
		}
		else if (pokemon == 'c') {
			System.out.print("Charmander");
		}
		else if (pokemon == 's') {
			System.out.print("Squirtle");
		}
		else {
			System.out.print("Codigo Invalido");
		}

	}

}
