package entidades;

public class Individual extends Contribuinte {

	private Double despesasSaúde;

	public Individual(String nome, Double rendaAnual, Double despesasSaúde) {
		super(nome, rendaAnual);
		this.despesasSaúde = despesasSaúde;
	}

	public Double getdespesasSaúde() {
		return despesasSaúde;
	}

	public void setdespesasSaúde(Double despesasSaúde) {
		this.despesasSaúde = despesasSaúde;
	}

	@Override
	public Double tax() {
		if (getrendaAnual() < 20000.0) {
			return getrendaAnual() * 0.15 - despesasSaúde * 0.5;
		}
		else {
				return getrendaAnual() * 0.25 - despesasSaúde * 0.5;
			}
		}
}
