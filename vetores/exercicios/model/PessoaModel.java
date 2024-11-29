package model;

public class PessoaModel {

	protected String nome;
	protected Double altura[];
	protected Integer qtdPessoas;
	
	
	public PessoaModel( Double... altura) {

		this.altura = altura;
	}
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double[] getAltura() {
		return altura;
	}
	public void setAltura(Double... altura) {
		this.altura = altura;
	}
	public Integer getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(Integer qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	
	
	
	
}
