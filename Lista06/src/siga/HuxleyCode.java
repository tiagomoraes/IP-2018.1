package siga;
import java.util.Scanner;

public class HuxleyCode {
	
	public static void main(String[] args) {
		/*
		 * Temos que modificar o HuxleyCode para usar lista de alunos e não de matriculas.
		 */
		Scanner in = new Scanner(System.in);
		
		String entrada, nome, disciplina;
		Matricula matricula;
		ListaMatriculas lista;
		int a, s, f, l, e;
		
		lista = new ListaMatriculas();
		entrada = in.nextLine();
		
		while(!entrada.equals("")) {
			nome = separarNome(entrada);
			disciplina = separarDisciplia(entrada);
			matricula = new Matricula(nome, disciplina);
			lista.inserir(matricula);
			entrada = in.nextLine();
		}
		
		entrada = in.nextLine();
		
		while(in.hasNextLine()) {
			nome = separarNome(entrada);
			disciplina = separarDisciplia(entrada);
			matricula = new Matricula(nome, disciplina);
			lista.remover(matricula);
			entrada = in.nextLine();
		}
		
		a = lista.contador("Algoritmo", 0);
		s = lista.contador("SD", 0);
		f = lista.contador("Fisica", 0);
		l = lista.contador("Logica", 0);
		e = lista.contador("Estatistica", 0);
		
		System.out.printf("Estao matriculados na turma de Algoritmo %d aluno(os)\n", a);
		System.out.printf("Estao matriculados na turma de SD %d aluno(os)\n", s);
		System.out.printf("Estao matriculados na turma de Fisica %d aluno(os)\n", f);
		System.out.printf("Estao matriculados na turma de Logica %d aluno(os)\n", l);
		System.out.printf("Estao matriculados na turma de Estatistica %d aluno(os)\n", e);

	}
	
	public static String separarNome(String entrada) {
		boolean divide = false;
		String nome;
		
		nome = "";
		
		for(int i = 0; i < entrada.length(); i++) {
			if(entrada.charAt(i) == ' ') {
				divide = true;
			}
			
			if(divide) {				
				nome += entrada.charAt(i);
			}
		}
		
		return nome;
	}
	
	public static String separarDisciplia(String entrada) {
		boolean divide = false;
		String disciplina;
		
		disciplina = "";
		
		for(int i = 0; i < entrada.length(); i++) {
			if(entrada.charAt(i) == ' ') {
				divide = true;
			}
			
			if(!divide) {				
				disciplina += entrada.charAt(i);
			}
		}
		
		return disciplina;
	}
	
}
