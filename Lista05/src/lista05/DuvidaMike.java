package lista05;
import java.util.Scanner;

public class DuvidaMike {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int c, m, p;
		while(in.hasNextInt()) {			
			c = in.nextInt();
			m = in.nextInt();
			p = in.nextInt();
			if(m >= mult(c, p)) {
				System.out.println("Sim");
			} else {
				System.out.println("Nao");
			}
		}
		
		
	}
	
	public static int mult(int a, int b) {
		int resp;
		resp = 0;
		if(a > 0) {
			resp = b + mult(a-1, b);
		}
		return resp;
	}
	
	

}
