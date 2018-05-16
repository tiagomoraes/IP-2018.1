package siga;

import java.util.Scanner;

public class HuxleyCode {

	public static void main(String[] args) {
		/*
		 * Temos que modificar o HuxleyCode para usar lista de alunos e não de matriculas.
		 */
		Scanner in = new Scanner(System.in);
		
		String entrada, nome, disciplina;
		ListaAlunos listAlg, listSd, listFis, listLog, listEst;
		int a, s, f, l, e;
		
		listAlg = new ListaAlunos();
		listSd = new ListaAlunos();
		listFis = new ListaAlunos();
		listLog = new ListaAlunos();
		listEst = new ListaAlunos();
		
		entrada = in.nextLine();
		
		while(!entrada.equals("")) {
			nome = separarNome(entrada);
			disciplina = separarDisciplia(entrada);
			if(disciplina.equals("Algoritmo")) {				
				listAlg.inserir(nome);
			} else if(disciplina.equals("SD")) {
				listSd.inserir(nome);
			} else if(disciplina.equals("Fisica")) {
				listFis.inserir(nome);
			} else if(disciplina.equals("Logica")) {
				listLog.inserir(nome);
			} else if (disciplina.equals("Estatistica")) {
				listEst.inserir(nome);
			}
			entrada = in.nextLine();
		}
		
		while(in.hasNextLine()) {
			entrada = in.nextLine();
			nome = separarNome(entrada);
			disciplina = separarDisciplia(entrada);
			if(disciplina.equals("Algoritmo")) {				
				listAlg.remover(nome);
			} else if(disciplina.equals("SD")) {
				listSd.remover(nome);
			} else if(disciplina.equals("Fisica")) {
				listFis.remover(nome);
			} else if(disciplina.equals("Logica")) {
				listLog.remover(nome);
			} else if (disciplina.equals("Estatistica")) {
				listEst.remover(nome);
			}
		}
		
		a = listAlg.contador(0);
		s = listSd.contador(0);
		f = listFis.contador(0);
		l = listLog.contador(0);
		e = listEst.contador(0);
		
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

		for (int i = 0; i < entrada.length(); i++) {
			if (entrada.charAt(i) == ' ') {
				divide = true;
			}

			if (divide && entrada.charAt(i) != ' ') {
				nome += entrada.charAt(i);
			}
		}

		return nome;
	}

	public static String separarDisciplia(String entrada) {
		boolean divide = false;
		String disciplina;

		disciplina = "";

		for (int i = 0; i < entrada.length(); i++) {
			if (entrada.charAt(i) == ' ') {
				divide = true;
			}

			if (!divide) {
				disciplina += entrada.charAt(i);
			}
		}

		return disciplina;
	}

}
