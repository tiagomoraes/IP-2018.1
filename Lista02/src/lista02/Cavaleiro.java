package lista02;
import java.util.Scanner;

public class Cavaleiro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int poder, escolhido;
		
		poder = in.nextInt();
		escolhido = 0;
		
		while(poder != 0) {
			if(poder > escolhido) {				
				escolhido = poder;
			}
			poder = in.nextInt();
		}
		
		System.out.println(escolhido);

	}

}
