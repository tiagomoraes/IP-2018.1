package banco;

public class Banco {
	private ListaContas lista;

	public Banco() {
		lista = new ListaContas();
	}
	
	public void cadastrar(Conta conta) {
		this.lista.inserir(conta);
	}
	
	public void creditar(String numero, double valor) {
		this.lista.encontrar(numero).creditar(valor);
	}
	
	public void debitar(String numero, double valor) {
		this.lista.encontrar(numero).debitar(valor);		
	}
	
	public double getSlado(String numero) {
		return this.lista.encontrar(numero).getSaldo();
	}
	
	public void renderJuros(String numero, double taxa) {
		if(this.lista.encontrar(numero) instanceof Poupanca) {			
			((Poupanca)this.lista.encontrar(numero)).renderJuros(taxa);
		}
	}
	
	public double getBonus(String numero) {
		if(this.lista.encontrar(numero) instanceof ContaEspecial) {
			return ((ContaEspecial)this.lista.encontrar(numero)).getBonus();
		} else {
			throw new RuntimeException ("Essa conta nao eh Especial");
		}
	}
	
	public void renderBonus(String numero) {
		if(this.lista.encontrar(numero) instanceof ContaEspecial) {
			((ContaEspecial)this.lista.encontrar(numero)).renderBonus();
		} else {
			throw new RuntimeException ("Essa conta nao eh Especial");
		}
	}
}
