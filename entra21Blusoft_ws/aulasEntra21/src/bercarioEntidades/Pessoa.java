package bercarioEntidades;

import java.sql.Date;

public abstract class Pessoa {

	private String nomeCompleto;
	private Date dataNascimento;
	private String endereco;
	
	public Pessoa() {}
	
	public Pessoa(String nomeCompleto, Date dataNascimento, String endereco) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return String.format("Nome completo: %s\nEndereco: %s\nData de nascimento: %s ",
				nomeCompleto, endereco, dataNascimento);
	}
	
	
	
}
