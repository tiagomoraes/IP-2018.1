package lista03;
import java.util.Scanner;

public class DreamsComeTrue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		n = in.nextInt();
		
		boolean verifA, verifC, verifP, verifJ;
		
		verifA = false;
		verifC = false;
		verifP = false;
		verifJ = false;
		
		
		String[] pessoas, gostos, ariel, cinderela, pocahontas, jasmine;
		
		pessoas = new String[n];
		gostos = new String[n];
		ariel = new String[n];
		cinderela = new String[n];
		pocahontas = new String[n];
		jasmine = new String[n];
		
		for(int pos = 0; in.hasNext(); pos++) {
			pessoas[pos] = in.next();
			gostos[pos] = in.next();
		}
		
		for(int pos = 0; pos < n; pos++) {
			if(gostos[pos].equals("mar") || gostos[pos].equals("mergulho")) {
				ariel[pos] = pessoas[pos];
				verifA = true;
			} else if(gostos[pos].equals("bailes") || gostos[pos].equals("sapatos")) {
				cinderela[pos] = pessoas[pos];
				verifC = true;
			} else if(gostos[pos].equals("florestas") || gostos[pos].equals("pacifismo")) {
				pocahontas[pos] = pessoas[pos];
				verifP = true;
			} else if(gostos[pos].equals("desertos") || gostos[pos].equals("tapetes")) {
				jasmine[pos] = pessoas[pos];
				verifJ = true;
			}
		}
		
		if(verifA == true) {
			System.out.println("Ariel:");
		}
		if(verifB == true) {
			System.out.println("Cinderela:");
		}
		if(verifC == true) {
			System.out.println("Pocahontas");
		}
		if(verifD == true) {
			System.out.println("jasmine");
		}
		
		

	}

}
