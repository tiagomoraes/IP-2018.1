package siga;

public class ListaAlunos {
	private String aluno;
	private ListaAlunos proximo;

	public ListaAlunos() {
		this.aluno = null;
		this.proximo = null;
	}

	public void inserir(String aluno) {
		if (this.aluno == null) {
			this.aluno = aluno;
			this.proximo = new ListaAlunos();
		} else {
			this.proximo.inserir(aluno);
		}
	}

	public void remover(String aluno) {
		if (this.aluno.equals(aluno)) {
			this.aluno = this.proximo.aluno;
			this.proximo = this.proximo.proximo;
		} else if(proximo.hasElement(aluno)) {
				this.proximo.remover(aluno);				
		}
	}

	public boolean hasElement(String aluno) {
		if (this.aluno.equals(aluno)) {
			return true;
		} else if (this.proximo != null) {
			return this.proximo.hasElement(aluno);
		} else {
			return false;
		}
	}
	
	public int contador(String aluno, int soma) {
		if(this.aluno.equals(aluno)) {
			soma++;
		} else if(this.aluno != null) {
			this.proximo.contador(aluno, soma);
		}
		return soma;
	}
}
