package banco;

public class ListaContas {
	private Conta conta;
	private ListaContas proximo;
	
	public ListaContas() {
		this.conta = null;
		this.proximo = null;
	}
	
	public void inserir(Conta conta) {
		if(this.proximo == null) {
			this.conta = conta;
			this.proximo = new ListaContas();
		} else {
			this.proximo.inserir(conta);
		}
	}
	
	public void remover(Conta conta) {
		if(this.conta != null) {
			if(conta.equals(this.conta)) {
				this.conta = this.proximo.conta;
				this.proximo = this.proximo.proximo;
			} else {
				this.proximo.remover(conta);
			}
		} else {
			throw new RuntimeException("Essa conta não existe");
		}
	}
	
	public Conta encontrar(String numero) {
		if(this.conta != null) {
			if(numero.equals(this.conta.getNumero())) {
				return this.conta;
			} else {
				return this.proximo.encontrar(numero);
			}
		} else {
			throw new RuntimeException("Essa conta não existe");
		}
	}
}
