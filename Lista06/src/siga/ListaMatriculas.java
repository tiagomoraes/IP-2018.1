package siga;

public class ListaMatriculas {
	private Matricula matricula;
	private ListaMatriculas proximo;

	public ListaMatriculas() {
		matricula = null;
		proximo = null;
	}

	public void inserir(Matricula matricula) {
		if (this.matricula == null) {
			this.matricula = matricula;
			this.proximo = new ListaMatriculas();
		} else {
			this.proximo.inserir(matricula);
		}
	}

	public void remover(Matricula matricula) {
		if (this.matricula != null) {
			if (this.matricula.equals(matricula)) {
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(matricula);
			}
		}
	}

	public int contador(String disciplina, int soma) {
		soma = 0;

		if (disciplina.equals(matricula.getDisciplina())) {
			soma++;
		} if (this.proximo != null) {
			this.proximo.contador(disciplina, soma);
		}

		return soma;
	}
	
	public boolean hasElement(String disciplina) {
		
	}
}
