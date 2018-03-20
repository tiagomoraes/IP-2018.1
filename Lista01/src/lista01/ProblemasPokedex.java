package lista01;
import java.util.Scanner;

public class ProblemasPokedex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int codigo = in.nextInt();
		if (codigo == 1) {
			System.out.print("Bulbassauro");
		}
		else if (codigo == 2) {
			System.out.print("Ivyssauro");
		}
		else if (codigo == 3) {
			System.out.print("Venossauro");
		}
		else if (codigo == 4) {
			System.out.print("Charmander");
		}
		else if (codigo == 5) {
			System.out.print("Charmeleon");
		}
		else if (codigo == 6) {
			System.out.print("Charizard");
		}
		else if (codigo == 7) {
			System.out.print("Squirtle");
		}
		else if (codigo == 8) {
			System.out.print("Wartortle");
		}
		else if (codigo == 9) {
			System.out.print("Blastoise");
		}
		else if (codigo == 10) {
			System.out.print("Caterpie" );
		}
		else if (codigo == 11) {
			System.out.print("Metapod");
		}
		else if (codigo == 12) {
			System.out.print("Butterfree");
		}
		else {
			System.out.print("Pokemon invalido no momento");
		}

	}

}
