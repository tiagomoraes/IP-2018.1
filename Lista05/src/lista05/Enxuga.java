package lista05;
import java.util.Scanner;

public class Enxuga {

	public static double blood = 12;
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double c, t, p, sangue;
		c = in.nextDouble();
		t = in.nextDouble();
		if(in.hasNextDouble()) {			
			p = in.nextDouble();
		} else {
			p = t;
			t = 0;
		}
		
		sangue = pell(c, t, p);
		
		if(sangue > 300) {
			System.out.println("Eleven ficou fraca demais e acabou desmaiando");
		} else {
			System.out.printf("Eleven perdeu %.0fml de sangue.", sangue);
		}

	}
	
	public static double pell(double c, double t, double p) {
		if(p <= c || blood > 300) {
			return blood;
		} else if(p <= t || blood > 300) {
			blood+=12;
			return blood;
		} else {
			blood += 12;
			return pell(t, 2*t + c, p);
		}
	}

}
