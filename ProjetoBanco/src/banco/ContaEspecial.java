package banco;

public class ContaEspecial extends Conta {
	private double bonus;
	
	public ContaEspecial(String numero) {
		super(numero);
		bonus = 0;
	}
	
	public void creditar(double valor) {
		super.creditar(valor);
		bonus += 0.01*valor;
	}
	
	public void renderBonus() {
		super.creditar(this.bonus);
		this.bonus = 0;
	}
	
	public double getBonus() {
		return this.bonus;
	}
}
