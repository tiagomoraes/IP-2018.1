package lista01;
import java.util.Scanner;

public class EcncontroLendario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String pokemon = in.nextLine();
		String ataque = in.nextLine();
		int levelMoltres = in.nextInt();
		int power = 0;
		double modificador = 0;
		double damage = 0;
		boolean ataqueValido = true;
		boolean pokemonValido = true;
		double hp = ((238*levelMoltres)/100)+levelMoltres+10;
			// define o HP do moltres (equação simplificada no papel)
		
		double defense = ((238*levelMoltres)/100)+5;
			// define a defesa do moltres (equação simplicifada no papel)
		
		if (!(pokemon.equals("Slowbro") || pokemon.equals("Dragonite"))) {
			System.out.println("Pokemon invalido");
			pokemonValido = false;
		} else if (!(ataque.equals("Surf") || ataque.equals("Flamethrower") || ataque.equals("Grass Knot"))) {
			System.out.println("Ataque invalido");
			ataqueValido = false;
		}
			// testa se pokemon e ataque são válidos
		
		if (ataque.equals("Surf")) {
			modificador = 2;
			power = 90;
		} else if (ataque.equals("Flamethrower")) {
			modificador = 1;
			power = 90;
		} else if (ataque.equals("Grass Knot")) {
			modificador = 0.5;
			power = 120;
		} 
			// analisa os ataques escolhidos e define o poder e o modificador
		
		double danoSlowbro = ((((14*power)/defense)+2)*modificador);
		double danoDragonite = ((((2304*power)/(50*defense))+2)*modificador);
			// define o dano causado por determinado pokemon
		
		if (pokemon.equals("Slowbro")) {
			damage = danoSlowbro*4;
		} else if (pokemon.equals("Dragonite")) {
			damage = danoDragonite*4;
		} 
			// define o dano final
		
		if (ataqueValido == true && pokemonValido == true) {
			if ((hp - damage) < 10 && (hp - damage) > 0) {
				System.out.println("Moltres capturado");
			} else if (hp - damage >= 10) {
				System.out.println("Moltres fugiu");
			} else if (hp - damage <= 0){
				System.out.println("Moltres morto");
			}
		}
			// define o que aconteceu com o moltres em função do hp e do dano final
		
	}

}
