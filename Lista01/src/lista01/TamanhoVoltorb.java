package lista01;
import java.util.Scanner;

public class TamanhoVoltorb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int voltorbs = in.nextInt();
		int pokebolas = in.nextInt();
		double alturaSobe = (voltorbs*65416.6666667 + pokebolas*179.5033333) / 200000;
		// volume do voltorb = 65416.6666667 cm3, volume da pokebola = 179.5033333 cm3 e área da base da piscina = 200000 cm2
		System.out.printf("Altura da piscina aumentou: %.1f cm", alturaSobe);

	}

}
