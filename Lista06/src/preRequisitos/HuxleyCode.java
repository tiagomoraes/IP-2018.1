package preRequisitos;

import java.util.Scanner;

public class HuxleyCode {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n, periodosAntes;
		String disciplina, querCursar, preRequisitos;
		Lista lista;
		
		n = in.nextInt();
		lista = new Lista();
		
		in.nextLine();
		
		for(int i = 0; i < n; i++) {
			disciplina = in.nextLine();
			lista.inserir(disciplina);
		}
		
		while(in.hasNextLine()) {
			querCursar = in.nextLine();
			if(lista.hasElement(querCursar)) {				
				preRequisitos = lista.requisitos(querCursar);
				if(preRequisitos.equals("")) {
					System.out.println(querCursar + " podera ser cursada esse periodo.");
				} else {
					periodosAntes = lista.count(querCursar);
					System.out.printf("%s podera ser cursada depois de %d periodos, depois de ter passado por: %s\n", querCursar, periodosAntes, preRequisitos);
				}
			} else {
				System.out.println(querCursar + " nao pode ser cursada nessa cadeia de pre-requisitos.");
			}
			
		}

	}
}
