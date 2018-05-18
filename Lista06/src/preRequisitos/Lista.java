package preRequisitos;

public class Lista {
	private String disciplina;
	private Lista proximo;
	
	public Lista() {
		this.disciplina = null;
		this.proximo = null;
	}
	
	public void inserir(String disciplina) {
		if(this.disciplina == null) {			
			this.disciplina = disciplina;
			this.proximo = new Lista();
		} else {
			this.proximo.inserir(disciplina);
		}
	}
	
	public String requisitos(String disciplina) {
		String resposta;
		if(this.disciplina != null) {
			if(!this.disciplina.equals(disciplina)) {
				if(this.proximo.proximo.disciplina != null && this.proximo.proximo.disciplina.equals(disciplina)) {
					resposta = this.disciplina + " e " + this.proximo.requisitos(disciplina);
				} else if(!this.proximo.disciplina.equals(disciplina)) {					
					resposta = this.disciplina + ", " + this.proximo.requisitos(disciplina);
				} else {
					resposta = this.disciplina + "." + this.proximo.requisitos(disciplina);					
				}
			} else {
				resposta = "";
			}
		} else {
			resposta = "";
		}
		
		return resposta;
	}
	
	public boolean hasElement(String disciplina) {
		boolean resposta = false;
		if(this.disciplina != null) {			
			if(this.disciplina.equals(disciplina)) {
				resposta = true;
			} else if(this.proximo != null) {
				resposta = this.proximo.hasElement(disciplina);
			} else {
				resposta = false;
			}
		}
		return resposta;
	}
	
	public int count(String querCursar) {
		int resposta;
		if(this.disciplina == null || this.disciplina.equals(querCursar)) {
			resposta = 0;
		} else {
			resposta = this.proximo.count(querCursar) + 1;
		}
		return resposta;
	}
}
