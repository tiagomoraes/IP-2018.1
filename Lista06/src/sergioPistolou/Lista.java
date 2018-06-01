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
}
