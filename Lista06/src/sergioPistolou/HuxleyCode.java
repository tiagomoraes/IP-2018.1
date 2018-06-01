package sergioPistolou;
import java.util.Scanner;

public class HuxleyCode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, tamanhoLinha, contador, expulsos;
		Integer elemento;
		n = in.nextInt();
		Lista[] arrayListas = new Lista[n];
		for(int i = 0; i < n; i++) {
			arrayListas[i] = new Lista();
		}
		contador = 1;
		expulsos = 0;
		
		for(int i = 0; i < n; i++) {
			tamanhoLinha = in.nextInt();
			for(int j = 0; j < tamanhoLinha; j++) {
				elemento = in.nextInt();
				arrayListas[i].inserir(elemento);
			}
		}
		
		System.out.println("Pessoal, vai ter aula de IP aqui agora");
		
		for(int i = 0; i < n; i++) {
			if(arrayListas[i].maiorZero() > 0) {
				System.out.println("Desliga o monitor...");
				for(int j = 0; j < n; j++) {
					arrayListas[j].subtrair(contador);
				}
				contador++;
			}
		}
		
		for(int i = 0; i < n; i++) {
			expulsos += arrayListas[i].maiorZero();
		}
		if(expulsos > 0) {			
			System.out.printf("Sergio pistolou e expulsou %d aluno(s) do laboratorio.", expulsos);
		}
	}

}
