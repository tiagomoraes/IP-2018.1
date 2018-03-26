package lista02;
import java.util.Scanner;

public class TheKeeperOfGates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String line, invert, letra, resultado;
		int tamanho, contador;
		char carac;
		
		invert = in.nextLine();
		resultado = "";
		letra = "";
		
		contador = 0;
		
		while(in.hasNext()) {
			line = in.nextLine();
			invert = line + "\n" + invert;
		}
		
		for(tamanho = 0; tamanho < invert.length(); tamanho++) {
			carac = invert.charAt(tamanho);
			if(carac == '*' || carac == ')' || carac == '$' || carac =='!' || carac =='+' || carac == '@' || carac == '-' || carac == '/' || carac == '(' || carac == '%') {
				letra = "";
				contador++;
			} else if(carac == ' ') {
				letra = "";
			} else if(carac == '0') {
				letra = "*";
			} else if(carac == '1') {
				letra = ")";
			} else if(carac == '2') {
				letra = "$";
			} else if(carac == '3') {
				letra = "!";
			} else if(carac == '4') {
				letra = "+";
			} else if(carac == '5') {
				letra = "@";
			} else if(carac == '6') {
				letra = "-";
			} else if(carac == '7') {
				letra = "/";
			} else if(carac == '8') {
				letra = "(";
			} else if(carac == '9') {
				letra = "%";
			} else if(carac >= 'A' && carac <= 'Z') {
				letra = "" + ((int)carac - 64);
			} else if(carac == '\n') {
				letra = "\n";
			} else if(carac >= 'a' && carac <= 'z') {
				if(contador % 2 == 0) {
					letra = String.valueOf((char) (carac - 32));
				} else {
					letra = "" + carac;
				}
			}
			
			resultado = resultado + letra;
		}
		
		System.out.print(resultado);

	}

}
