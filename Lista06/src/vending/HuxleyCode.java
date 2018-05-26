package vending;
import java.util.Scanner;

public class HuxleyCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Lista[] machine = new Lista[10];
		//definir listas no array
		for(int i = 0; i < 10; i++) {
			machine[i] = new Lista();
		}
		double[] precos = new double[10];
		String entrada;
		String[] slot;
		double total = 0;
		boolean jaAchou, free;
		jaAchou = free = false;
		
		for(int i = 0; i < 10; i++) {
			entrada = in.nextLine();
			slot = entrada.split(" ");
			for(int j = 0; j < slot.length; j++) {
				machine[i].inserir(slot[j]);
			}
		}
		
		for(int i = 0; i < 10; i++) {
			precos[i] = in.nextDouble();
		}
		
		while(in.hasNext()) {
			entrada = in.next();
			for(int i = 0; i < 10; i++) {
				if(machine[i].ehUltimo(entrada) && !jaAchou) {
					jaAchou = true;
					machine[i].removerUltimo();
					if(i != 5) {						
						total+=precos[i];
					} else {
						free = true;
					}
				}
			}
			if(jaAchou && free) {
				System.out.println("Opa, um item 0800!");
			} else if(jaAchou) {
				//nada
			} else {
				System.out.println("Nao temos " + entrada + " disponivel no momento.");
			}
			
			//reset variables
			jaAchou = free = false;
		}
		
		System.out.printf("Compras realizadas com sucesso. Voce gastou R$%.2f.", total);
	}

}
