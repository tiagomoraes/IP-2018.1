package lista05;
import java.util.Scanner;

public class Enxuga {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int c, t, p, sangue;
		c = in.nextInt();
		t = in.nextInt();
		p = in.nextInt();
		
		sangue = pell(c, t, p);
		
		if(sangue > 300) {
			System.out.println("Eleven ficou fraca demais e acabou desmaiando");
		} else {
			System.out.println("Eleven perdeu " + sangue +"ml de sangue.");
		}

	}
	
	public static int pell(int c, int t, int p) {
		int sangue;
		sangue = 0;		
		if(p <= 2*t + c) {
			sangue += 12;
			return sangue;
		} else {
			sangue += 12;
			return pell(2*t + c, t, p);
		}
	}

}
