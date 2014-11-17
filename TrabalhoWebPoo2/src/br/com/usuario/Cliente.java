package br.com.usuario;

public class Cliente {
	
	String nome;
	String cpf;
	String placaDoVeiculo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}
	public void setPlacaDoVeiculo(String placaDoVeiculo) {
		this.placaDoVeiculo = placaDoVeiculo;
	}
	public Cliente(String nome, String cpf, String placaDoVeiculo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.placaDoVeiculo = placaDoVeiculo;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", placaDoVeiculo="
				+ placaDoVeiculo + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((placaDoVeiculo == null) ? 0 : placaDoVeiculo.hashCode());
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
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (placaDoVeiculo == null) {
			if (other.placaDoVeiculo != null)
				return false;
		} else if (!placaDoVeiculo.equals(other.placaDoVeiculo))
			return false;
		return true;
	}
	
	
	
	
}
