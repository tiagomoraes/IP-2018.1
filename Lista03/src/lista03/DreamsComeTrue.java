package lista03;
import java.util.Scanner;

public class DreamsComeTrue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, contA, contC, contP, contJ;
		n = in.nextInt();
		
		contA = 0;
		contC = 0;
		contP = 0;
		contJ = 0;
		
		
		String[] pessoas, gostos, ariel, cinderela, pocahontas, jasmine;
		
		pessoas = new String[n];
		gostos = new String[n];
		ariel = new String[n];
		cinderela = new String[n];
		pocahontas = new String[n];
		jasmine = new String[n];
		
		if(n != 0) {
			for(int pos = 0; in.hasNext(); pos++) {
				pessoas[pos] = in.next();
				if(in.hasNext()) {
					gostos[pos] = in.next();
				}
			}
			
			for(int pos = 0; pos < n; pos++) {
				if(gostos[pos] == null) {
					pessoas[pos] = "errado";
					gostos[pos] = "errado";
				} else if(gostos[pos].equals("mar") || gostos[pos].equals("mergulho")) {
					ariel[contA] = pessoas[pos];
					contA++;
				} else if(gostos[pos].equals("bailes") || gostos[pos].equals("sapatos")) {
					cinderela[contC] = pessoas[pos];
					contC++;
				} else if(gostos[pos].equals("florestas") || gostos[pos].equals("pacifismo")) {
					pocahontas[contP] = pessoas[pos];
					contP++;
				} else if(gostos[pos].equals("desertos") || gostos[pos].equals("tapetes")) {
					jasmine[contJ] = pessoas[pos];
					contJ++;
				}
			}
			
			if(contA > 0) {
				System.out.println("Ariel:");
				for(int i = 0; i < contA; i++) {
					System.out.println("- "+ariel[i]);
				}
			}
			if(contC > 0) {
				System.out.println("Cinderela:");
				for(int i = 0; i < contC; i++) {
					System.out.println("- "+cinderela[i]);
				}
			}
			if(contP > 0) {
				System.out.println("Pocahontas:");
				for(int i = 0; i < contP; i++) {
					System.out.println("- "+pocahontas[i]);
				}
			}
			if(contJ > 0) {
				System.out.println("Jasmine:");
				for(int i = 0; i < contJ; i++) {
					System.out.println("- "+jasmine[i]);
				}
			}
			
			if(contA == 0 && contC == 0 && contP == 0 && contJ == 0) {
				System.out.println("Infelizmente nao teremos passeios nessa temporada.");
			}
			
		} else {
			System.out.println("Infelizmente nao teremos passeios nessa temporada.");
		}
		
	}

}
