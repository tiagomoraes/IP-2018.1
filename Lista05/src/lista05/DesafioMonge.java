package lista05;
import java.util.Scanner;

public class DesafioMonge {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, resp;
		while(in.hasNextInt()) {			
			x = in.nextInt();
			resp = func(x);
			System.out.println(resp);
		}
		
	}
	
	public static int func(int x) {
		if(x == 0) {
			return 10;
		} else if(x == 1) {
			return 11;
		} else if(x == 2) {
			return 27;
		} else {
			return func(x-2) - func(x-3);
		}
	}

}
