package lista03;
import java.util.Scanner;

public class HomemSer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, aux;
		String aux2, letra1, letra2;
		char carac1, carac2;
		n = in.nextInt();
		
		String[] soldados;
		int[] alturas;
		
		soldados = new String[n];
		alturas = new int[n];
		
		for(int i = 0; i < n; i++) {
			soldados[i] = in.next();
			alturas[i] = in.nextInt();
		}
			
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n-1); j++) {
				if(alturas[j] > alturas[j+1]){
					aux = alturas[j];
					aux2 = soldados[j];
					alturas[j] = alturas[j+1];
					soldados[j] = soldados[j+1];
					alturas[j+1] = aux;
					soldados[j+1] = aux2;
				} else if(alturas[j] == alturas[j+1]) {
					letra1 = ""+soldados[j].charAt(0);
					letra2 = ""+soldados[j+1].charAt(0);
					letra1 = letra1.toLowerCase();
					letra2 = letra2.toLowerCase();
					carac1 = letra1.charAt(0);
					carac2 = letra2.charAt(0);
					
					if(carac1 > carac2) {
						aux = alturas[j];
						aux2 = soldados[j];
						alturas[j] = alturas[j+1];
						soldados[j] = soldados[j+1];
						alturas[j+1] = aux;
						soldados[j+1] = aux2;
					}
				}
			}
		}
		
		for(int i = 0; i < n-1; i++) {
			System.out.print(soldados[i]+" ");
		}
		System.out.print(soldados[n-1]);

	}

}
