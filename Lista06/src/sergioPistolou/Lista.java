package sergioPistolou;

public class Lista {
	private Integer audacia;
	private Lista proximo;
	
	Lista() {
		this.audacia = null;
		this.proximo = null;
	}
	
	public void inserir(Integer elemento) {
		if(this.audacia == null) {
			this.audacia = elemento;
			this.proximo = new Lista();
		} else {
			this.proximo.inserir(elemento);
		}
	}
	
	public void subtrair(int valor) {
		this.audacia -= valor;
		if(this.proximo.audacia != null) {				
			this.proximo.subtrair(valor);
		}
	}
	
	public int maiorZero() {
		if(this.audacia == null) {
			return 0;
		} else if(audacia > 0){
			return this.proximo.maiorZero() + 1;
		} else {
			return this.proximo.maiorZero();
		}
	}
}
