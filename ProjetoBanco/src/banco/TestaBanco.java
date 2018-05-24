package banco;

public class TestaBanco {

	public static void main(String[] args) {
		Banco b1;
		b1 = new Banco();
		
		Conta c1, c2, c3;
		c1 = new Conta("1111");
		c2 = new Poupanca("2222");
		c3 = new ContaEspecial("3333");

		b1.cadastrar(c1);
		b1.cadastrar(c2);
		b1.creditar("1111", 24);
		b1.debitar("1111", 4.2);
		b1.creditar("2222", 12);
		b1.renderJuros("2222", 0.1);
		b1.cadastrar(c3);
		b1.creditar("3333", 10);
		b1.renderBonus("3333");

		System.out.println(b1.getSlado("3333"));
		System.out.println(b1.getBonus("3333"));
	}

}
