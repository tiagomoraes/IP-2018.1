package lista02;
import java.util.Scanner;

public class WatchersWall {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, capac, s, e, total;
		boolean test;
		
		n = in.nextInt();
		capac = in.nextInt();
		total = 0;
		test = true;
		
		for(int cont = n; cont > 0; cont--) {
			s = in.nextInt();
			e = in.nextInt();
			
			total = total + e - s;
			
			if(total > capac) {
				System.out.println("Selvagens sao dificeis de ensinar.");
				test = false;
				break;
			}
			
		}
		
		if(test == true) {
			System.out.println("Viva a conscientizacao.");
		}

	}

}
