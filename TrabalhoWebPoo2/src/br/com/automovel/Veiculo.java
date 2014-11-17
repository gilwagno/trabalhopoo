package br.com.automovel;

public class Veiculo {

	String tipoVeiculo;
	String placa;
	
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public Veiculo(String tipoVeiculo, String placa) {
		super();
		this.tipoVeiculo = tipoVeiculo;
		this.placa = placa;
	}
	
	@Override
	public String toString() {
		return "Veiculo [tipoVeiculo=" + tipoVeiculo + ", placa=" + placa
				+ ", getTipoVeiculo()=" + getTipoVeiculo() + ", getPlaca()="
				+ getPlaca() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result
				+ ((tipoVeiculo == null) ? 0 : tipoVeiculo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Veiculo other = (Veiculo) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (tipoVeiculo == null) {
			if (other.tipoVeiculo != null)
				return false;
		} else if (!tipoVeiculo.equals(other.tipoVeiculo))
			return false;
		return true;
	}

	
	
}
