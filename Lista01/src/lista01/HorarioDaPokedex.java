package lista01;
import java.util.Scanner;

public class HorarioDaPokedex {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int horas24 = in.nextInt();
		int minutos = in.nextInt();
		int horas12;
		String periodo;
		if (horas24 == 0) {
			horas12 = 12;
		} else if (horas24 > 12) {
			horas12 = horas24 - 12;
		} else {
			horas12 = horas24;
		}
		if (horas24 < 12) {
			periodo = "am";
		} else {
			periodo = "pm";
		}
		System.out.printf("%02d\n%02d\n%s", horas12, minutos, periodo);
		
	}

}
