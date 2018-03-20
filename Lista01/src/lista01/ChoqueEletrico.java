package lista01;
import java.util.Scanner;

public class ChoqueEletrico {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int level = in.nextInt();
		double potencia = 0;
		if (level >=1 && level <=20) {
			potencia = 20 + Math.pow(level, 3);
		} else if (level > 20 && level <= 40) {
			potencia = 8000 + Math.pow((level-10), 2);
		} else if (level > 40 && level <= 60) {
			potencia = 9000 + 5*level;
		} else if (level > 60 && level <= 80) {
			potencia = 9300 + 2*level;
		} else if (level > 80 && level <= 100) {
			potencia = 9500 + level;
		}
		int potenciaInt = (int) potencia;
		System.out.printf("Potencia de : %d W", potenciaInt);

	}

}
