package bercarioEntidades;

public class Medicamento {

	private String descricao;
	private String unidadeMedida;
	private Integer quantidadeEstoque;
	
	public Medicamento() {}
	
	public Medicamento(String descricao, String unidadeMedida, Integer quantidadeEstoque) {
		super();
		this.descricao = descricao;
		this.unidadeMedida = unidadeMedida;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	
	
}
