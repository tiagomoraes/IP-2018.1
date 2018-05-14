package siga;

public class Matricula {
	private String nome, disciplina;

	public Matricula(String nome, String disciplina) {
		this.nome = nome;
		this. disciplina = disciplina;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDisciplina() {
		return this.disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public boolean equals(Matricula matricula) {
		return this.nome.equals(matricula.getNome()) && this.disciplina.equals(matricula.getDisciplina());
	}
}