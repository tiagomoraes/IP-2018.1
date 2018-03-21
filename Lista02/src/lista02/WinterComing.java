package lista02;
import java.util.Scanner;

public class WinterComing {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i, n, f;
		boolean teste;
		String o;
		
		i = in.nextInt();
		f = i;
		teste = true;
		
		while(in.hasNext() && teste == true) {
			o = in.next();
			n = in.nextInt();
			
			if(o.equals("GUARDAR")) {
				f = f + n;
			} else if(o.equals("RETIRAR")) {
				f = f - n;
			}
			
			if(f < 0) {
				System.out.println("Winter is here");
				teste = false;
			} 

		}
		
		if(f >= 0) {			
			System.out.println(f);
		}

	}

}
