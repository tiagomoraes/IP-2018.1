package lista01;
import java.util.Scanner;

public class DesafioPokemon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String ataque = in.nextLine();
		String defesa = in.nextLine();
		
		if (ataque.equals("Planta") && (defesa.equals("Planta"))) {
			System.out.print("Empate");
		}
		else if (ataque.equals("Planta") && (defesa.equals("Fogo"))) {
			System.out.print("Desvantagem");
		}
		else if (ataque.equals("Planta") && (defesa.equals("Agua"))) {
			System.out.print("Vantagem");
		}
		else if (ataque.equals("Fogo") && (defesa.equals("Planta"))) {
			System.out.print("Vantagem");
		}
		else if (ataque.equals("Fogo") && (defesa.equals("Fogo"))) {
			System.out.print("Empate");
		}
		else if (ataque.equals("Fogo") && (defesa.equals("Agua"))) {
			System.out.print("Desvantagem");
		}
		else if (ataque.equals("Agua") && (defesa.equals("Planta"))) {
			System.out.print("Desvantagem");
		}
		else if (ataque.equals("Agua") && (defesa.equals("Fogo"))) {
			System.out.print("Vantagem");
		}
		else if (ataque.equals("Agua") && (defesa.equals("Agua"))) {
			System.out.print("Empate");
		}

	}

}
