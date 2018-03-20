package lista02;
import java.util.Scanner;

public class ValarMorghulis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String nome, familia;
		
		for(int mortos = in.nextInt(); mortos > 0; mortos--) {
			nome = in.next();
			familia = in.next();
			
			if(familia.equals("Stark")) {
				System.out.printf("Cara familia Stark, sentimos muito pela tragica morte de %s.\nO inverno chega para todos.\n", nome);
			} else if(familia.equals("Lannister")) {
				System.out.printf("Cara familia Lannister, sentimos muito pela tragica morte de %s.\nOs campos agora o ouvirao rugir.\n", nome);
			} else if(familia.equals("Targaryen")) {
				System.out.printf("Cara familia Targaryen, sentimos muito pela tragica morte de %s.\nVoces sao superestimados mesmo.\n", nome);
			} else {
				System.out.printf("Cara familia %s, sentimos muito pela tragica morte de %s.\n", familia, nome);
			}
			
		}

	}

}
