package bercarioEntidades;

import java.sql.Date;

public class Mae extends Pessoa{
	
	private String celular;

	public Mae() {
		super();
	}

	public Mae(String nomeCompleto, Date dataNascimento, String endereco, String celular) {
		super(nomeCompleto, dataNascimento, endereco);
		this.celular = celular;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
}
