package vending;

public class Lista {
	private String produto;
	private Lista proximo;
	
	public Lista() {
		this.produto = null;
		this.proximo = null;
	}
	
	public void inserir(String produto) {
		if(this.produto == null) {
			this.produto = produto;
			this.proximo = new Lista();
		} else {
			this.proximo.inserir(produto);
		}
	}
	
	public void removerUltimo() {
		if(this.proximo.produto == null) {
			this.produto = null;
			this.proximo = null;
		} else {
			this.proximo.removerUltimo();
		}
	}
	
	public boolean ehUltimo(String produto) {
		if(this.produto != null) {			
			if(this.proximo.produto == null) {
				return this.produto.equals(produto);
			} else {
				return this.proximo.ehUltimo(produto);
			}
		} else {
			return false;
		}
	}
}
