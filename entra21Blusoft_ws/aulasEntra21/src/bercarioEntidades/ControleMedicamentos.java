package bercarioEntidades;

import java.sql.Date;

public class ControleMedicamentos {

	private Date dataHora;
	private Medicamento medicamento;
	private Bebe bebe;
	
	
	public ControleMedicamentos(Date dataHora, Medicamento medicamento, Bebe bebe) {
		this.dataHora = dataHora;
		this.medicamento = medicamento;
		this.bebe = bebe;
	}


	@Override
	public String toString() {
		return String.format("Data Hora: %s\n"
				+ "Medicamento: %s\n"
				+ "UnidadeMedida: %s\n", dataHora, medicamento.getDescricao(), medicamento.getUnidadeMedida());
	}
	
	
}
