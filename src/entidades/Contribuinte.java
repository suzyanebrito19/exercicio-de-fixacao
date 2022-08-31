package entidades;

public abstract class Contribuinte {
	private String nome;
	private Double rendaAnual;
	
	public Contribuinte(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getrendaAnual() {
		return rendaAnual;
	}

	public void setrendaAnual(Double rendaAnual) {
		this.rendaAnual= rendaAnual;
	}

	public abstract Double tax();
}
