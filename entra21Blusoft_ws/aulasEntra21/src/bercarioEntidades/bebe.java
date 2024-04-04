package bercarioEntidades;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

public class Bebe extends Pessoa{
	
	Medico medico;
	Mae mae;
	public ArrayList<ControleMedicamentos> controleMedicamento = new ArrayList<>();
	
	public Bebe() {}

	public Bebe(String nomeCompleto, Date dataNascimento,String endereco,  Medico medico, Mae mae) {
		super(nomeCompleto, dataNascimento, endereco);
		this.medico = medico;
		this.mae = mae;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Mae getMae() {
		return mae;
	}

	public void setMae(Mae mae) {
		this.mae = mae;
	}

	public ArrayList<ControleMedicamentos> getControleMedicamento() {
		return controleMedicamento;
	}

	public void setControleMedicamento(ControleMedicamentos controleMedicamento) {
		this.controleMedicamento.add(controleMedicamento);
	}
	
	public String exibirInfo() {
		return String.format("%s \nMãe: %sContato da Mãe: %s\nMédico: %s", super.toString(), mae.getNomeCompleto(), mae.getCelular(), medico.getNomeCompleto());
	}
	
	public String relatorioMedicamentos() {
		String text = "";
		for(ControleMedicamentos controle : controleMedicamento) {
			text += controle.toString();
		}
		return text;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mae, medico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bebe other = (Bebe) obj;
		return Objects.equals(mae, other.mae) && Objects.equals(medico, other.medico);
	}
	
	
	
}
