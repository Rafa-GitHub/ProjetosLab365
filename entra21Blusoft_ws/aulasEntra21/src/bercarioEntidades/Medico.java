package bercarioEntidades;

public class Medico extends Pessoa{

	private String celular;
	private String crm;
	
	public Medico() {}
	
	public Medico(String crm, String celular) {
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
