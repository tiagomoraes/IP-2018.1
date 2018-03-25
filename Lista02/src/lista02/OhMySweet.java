package lista02;
import java.util.Scanner;

public class OhMySweet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int d1, m1, a1, d2, m2, a2, diasMes, total;
		boolean bissexto;
		
		d1 = in.nextInt();
		m1 = in.nextInt();
		a1 = in.nextInt();
		d2 = in.nextInt();
		m2 = in.nextInt();
		a2 = in.nextInt();
		
		diasMes = 0;
		total = 0;
		
		bissexto = false;
		
		while(a1 != a2 || m1 != m2 || d1 != d2) {
			d1++;
			total++;
			
			if(a1 % 4 == 0 && a1 % 100 != 0) {
				bissexto = true;
			} else if(a1 % 400 == 0) {
				bissexto = true;
			} else {
				bissexto = false;
			}
			
			if(m1 == 1) {
				diasMes = 31;
			} else if(m1 == 2) {
				if(bissexto == true) {
					diasMes = 29;
				} else {
					diasMes = 28;
				}
			} else if(m1 == 3) {
				diasMes = 31;
			} else if(m1 == 4) {
				diasMes = 30;
			} else if(m1 == 5) {
				diasMes = 31;
			} else if(m1 == 6) {
				diasMes = 30;
			} else if(m1 == 7) {
				diasMes = 31;
			} else if(m1 == 8) {
				diasMes = 31;
			} else if(m1 == 9) {
				diasMes = 30;
			} else if(m1 == 10) {
				diasMes = 31;
			} else if(m1 == 11) {
				diasMes = 30;
			} else if(m1 == 12) {
				diasMes = 31;
			} 
			
			if(d1 > diasMes) {
				d1 = 1;
				m1++;
			}
			if(m1 > 12) {
				m1 = 1;
				a1++;
			}
		}
		
		System.out.println(total);

	}

}
