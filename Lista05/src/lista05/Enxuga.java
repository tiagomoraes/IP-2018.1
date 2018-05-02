package lista05;
import java.util.Scanner;

public class Enxuga {

public static int blood = 12;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int c, t, p, sangue;
		c = in.nextInt();
		t = in.nextInt();
		if(in.hasNextInt()) {			
			p = in.nextInt();
			blood+=12;
		} else {
			p = t;
			t = 0;
		}
		
		sangue = pell(c, t, p);
		
		if(sangue > 300) {
			System.out.println("Eleven ficou fraca demais e acabou desmaiando");
		} else {
			System.out.println("Eleven perdeu " + sangue +"ml de sangue.");
		}

	}
	
	public static int pell(int c, int t, int p) {
		if(p < t || blood > 300) {
			return blood;
		} else {
			blood += 12;
			return pell(t, 2*t + c, p);
		}
	}

}
