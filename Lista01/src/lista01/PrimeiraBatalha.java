package lista01;
import java.util.Scanner;

public class PrimeiraBatalha {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if (a==0||b==0||c==0) {
			System.out.print("Nao");
		} else {
			if ((a>10||b>10||c>10) && (a%2==0||b%2==0||c%2==0)){
				System.out.print("Sim");
			} else {
				System.out.print("Nao");
			}
		}

	}

}
