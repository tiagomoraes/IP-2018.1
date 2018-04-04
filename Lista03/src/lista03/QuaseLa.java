package lista03;
import java.util.Scanner;

public class QuaseLa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int pedras, pulo, moedas, pos;
		int[] listPedras;
		
		pedras = in.nextInt();
		moedas = 0;
		pos = 0;
		listPedras = new int[pedras];
		
		for(int cont = 0; cont < pedras; cont++) {
			listPedras[cont] = in.nextInt();
		}
		
		if(pedras != 0) {
			moedas += listPedras[0];
			listPedras[0] = 0;
			
			while(in.hasNext()) {
				pulo = in.nextInt();
				pos += pulo;
				
				if(pos > pedras - 1) {
					pos = 0;
				}
				if(pos < 0) {
					pos = pedras - 1;
				}
				
				
				moedas += listPedras[pos];
				listPedras[pos] = 0;
			}
		}
		
		System.out.print(moedas);
	}

}
