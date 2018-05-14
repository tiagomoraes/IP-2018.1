package siga;

public class ListaMatriculas {
	private Matricula matricula;
	private ListaMatriculas proximo;
	
	public ListaMatriculas() {
		matricula = null;
		proximo = null;
	}
	
	public void inserir(Matricula matricula) {
		if(this.matricula == null) {
			this.matricula = matricula;
			this.proximo = new ListaMatriculas();
		} else {
			this.proximo.inserir(matricula);
		}
	}
	
	public void remover(Matricula matricula) {
		if(this.matricula != null) {
			if(this.matricula.equals(matricula)) {
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(matricula);
			}
		}
	}
	
	public int contador(String disciplina) {
		int resposta = 0;
		
		if(this.matricula != null) {			
			if(disciplina.equals(matricula.getDisciplina())) {
				resposta++;
			} else {
				this.proximo.contador(disciplina);
			}
		} 
		
		return resposta;
	}
}
