package lista02;
import java.util.Scanner;

public class RedWedding {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String casa;
		int s = 0, t = 0, b = 0, k = 0, f = 0, u = 0, m = 0, o = 0;
		
		casa = in.next();
		
		while(!casa.equals("FIM")) {
			if(casa.equals("Stark")) {
				s++;
			} else if(casa.equals("Tully")) {
				t++;
			} else if(casa.equals("Bolton")) {
				b++;
			} else if(casa.equals("Karstark")) {
				k++;
			} else if(casa.equals("Frey")) {
				f++;
			} else if(casa.equals("Umber")) {
				u++;
			} else if(casa.equals("Manderly")) {
				m++;
			} else {
				o++;
			}
			casa = in.next();
		}
		
		System.out.println("Stark: "+s);
		System.out.println("Tully: "+t);
		System.out.println("Bolton: "+b);
		System.out.println("Karstark: "+k);
		System.out.println("Frey: "+f);
		System.out.println("Umber: "+u);
		System.out.println("Manderly: "+m);
		System.out.println("Outros: "+o);

	}

}
