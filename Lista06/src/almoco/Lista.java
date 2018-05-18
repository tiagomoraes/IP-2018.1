package almoco;

public class Lista {
	private String nome;
	private Lista proximo;
	
	public Lista() {
		this.nome = null;
		this.proximo = null;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void inserir(String nome) {
		if(this.nome == null) {
			this.nome = nome;
			this.proximo = new Lista();
		} else {
			this.proximo.inserir(nome);
		}
	}
	
	public void removerUltimo() {
		this.nome = this.proximo.nome;
		this.proximo = this.proximo.proximo;
	}
	
	public int count() {
		int resposta;
		if(this.nome == null) {
			resposta = 0;
		} else {
			resposta = this.proximo.count() + 1;
		}
		return resposta;
	}
	
	public boolean isEmpty() {
		if(this.nome == null) {
			return true;
		} else {
			return false;
		}
	}
	
}
