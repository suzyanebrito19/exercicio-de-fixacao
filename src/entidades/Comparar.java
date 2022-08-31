package entidades;

public class Comparar extends Contribuinte {

	private Integer numeroDeEmpregados;

	public Comparar(String nome, Double rendaAnual, Integer numeroDeEmpregados) {
		super(nome, rendaAnual);
		this.numeroDeEmpregados = numeroDeEmpregados;
	}

	public Integer getnumeroDeEmpregados() {
		return numeroDeEmpregados;
	}

	public void setnumeroDeEmpregados(Integer numeroDeEmpregados) {
		this.numeroDeEmpregados = numeroDeEmpregados;
	}

	@Override
	public Double tax() {
		if (numeroDeEmpregados > 10) {
			return getrendaAnual() * 0.14;
		}
		else {
			return getrendaAnual() * 0.16;
		}
	}
}



