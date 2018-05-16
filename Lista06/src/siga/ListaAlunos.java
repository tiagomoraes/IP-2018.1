package siga;

public class ListaAlunos {
	private String aluno;
	private ListaAlunos proximo;

	public ListaAlunos() {
		this.aluno = null;
		this.proximo = null;
	}

	public void inserir(String aluno) {
		if (aluno.equals(this.aluno)) {
			return;
		}
		if (this.aluno == null) {
			this.aluno = aluno;
			this.proximo = new ListaAlunos();
		} else if (!this.proximo.hasElement(aluno)){
			this.proximo.inserir(aluno);
		}
	}

	public void remover(String aluno) {
		if(this.aluno != null) {			
			if (this.aluno.equals(aluno)) {
				this.aluno = this.proximo.aluno;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(aluno);
			}
		}
	}

	public boolean hasElement(String aluno) {
		if (aluno.equals(this.aluno)) {
			return true;
		} else if (this.proximo != null) {
			return this.proximo.hasElement(aluno);
		} else {
			return false;
		}
	}

	public int contador(int soma) {
		if (this.aluno != null) {
			soma++;
			return this.proximo.contador(soma);
		}
		return soma;
	}
}
