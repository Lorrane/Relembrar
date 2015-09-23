package br.com.lorrane.dividas.Modelo;

import java.util.Date;

public class Despesas {
	String nomeDespesa;
	double valorDespesa;
	Date DataDespesa;
	int qtdParcelas;
	int totalParcelas;
	
	public String getNomeDespesa() {
		return nomeDespesa;
	}
	public void setNomeDespesa(String nomeDespesa) {
		this.nomeDespesa = nomeDespesa;
	}
	public double getValorDespesa() {
		return valorDespesa;
	}
	public void setValorDespesa(double valorDespesa) {
		this.valorDespesa = valorDespesa;
	}
	public Date getDataDespesa() {
		return DataDespesa;
	}
	public void setDataDespesa(Date dataDespesa) {
		DataDespesa = dataDespesa;
	}
	public int getQtdParcelas() {
		return qtdParcelas;
	}
	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	public int getTotalParcelas() {
		return totalParcelas;
	}
	public void setTotalParcelas(int totalParcelas) {
		this.totalParcelas = totalParcelas;
	}
	
	
}
