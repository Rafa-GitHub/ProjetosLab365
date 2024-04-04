package bercarioEntidades;

import java.sql.Date;

public class Medico extends Pessoa{

	private String celular;
	private String crm;
	
	public Medico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medico(String nomeCompleto, Date dataNascimento, String endereco, String celular, String crm) {
		super(nomeCompleto, dataNascimento, endereco);
		this.celular = celular;
		this.crm = crm;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
	}
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
}
