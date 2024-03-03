package entidades;

public class Candidato {
	
	public String name;
	public int voto;
	
	public Candidato() {};
	
	public Candidato(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name + " " + this.voto + " votos";
	}
	
	
}
