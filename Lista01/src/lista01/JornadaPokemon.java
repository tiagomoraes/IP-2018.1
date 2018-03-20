package lista01;
import java.util.Scanner;

public class JornadaPokemon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int escolha = in.nextInt();
		if (escolha == 1) {
			System.out.print("Bulbassauro");
		}
		else if (escolha == 2) {
			System.out.print("Charmander");
		}
		else if (escolha == 3) {
			System.out.print("Squirtle");
		}

	}

}
