package almoco;
import java.util.Scanner;

public class HuxleyCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String diaArea2, diaRU, termo1, termo2;
		String[] divide = new String[2];
		Lista listaRU, listaArea2;
		
		listaRU = new Lista();
		listaArea2 = new Lista();
		
		divide = separar(in.nextLine());
		diaRU = divide[1];
		
		divide = separar(in.nextLine());
		diaArea2 = divide[1];
		
		while(in.hasNextLine()) {
			divide = separar(in.nextLine());
			termo1 = divide[0];
			termo2 = divide[1];
			
			if(termo1.equals("SAIU")) {
				if(termo2.equals("RU")) {
					if(!listaRU.isEmpty()) {						
						System.out.println(listaRU.getNome() + " almocou no RU e esta voltando pra aula");
						listaRU.removerUltimo();
					} else {
						System.out.println("Nao ha mais ninguem para comer aqui");
					}
				} else {
					if(!listaArea2.isEmpty()) {
						System.out.println(listaArea2.getNome() + " almocou na Area 2 e esta voltando pra aula");
						listaArea2.removerUltimo();
					} else {						
						System.out.println("Nao ha mais ninguem para comer aqui");
					}
				}
			} else {
				if(termo2.equals(diaArea2)) {
					listaArea2.inserir(termo1);
					System.out.println(termo1 + " foi para a fila da Area 2");
				} else if(termo2.equals(diaRU)) {
					listaRU.inserir(termo1);
					System.out.println(termo1 + " foi para a fila do RU");
				} else {
					if(listaRU.count() < listaArea2.count()) {
						listaRU.inserir(termo1);
						System.out.println(termo1 + " foi para a fila do RU");
					} else {
						listaArea2.inserir(termo1);
						System.out.println(termo1 + " foi para a fila da Area 2");
					}
				}
			}
		}
	}
	
	public static String[] separar(String entrada) {
		String[] resposta = new String[2];
		String termo1, termo2;
		termo1 = termo2 = "";
		boolean jaAchou = false;
		
		for(int i = 0; i < entrada.length(); i++) {
			if(entrada.charAt(i) == ':') {
				jaAchou = true;
			} else if(!jaAchou) {				
				termo1 += entrada.charAt(i);
			} else {
				termo2 += entrada.charAt(i);
			}
		}
		resposta[0] = termo1;
		resposta[1] = termo2;
		return resposta;
	}

}
