package br.com.lorrane.dividas.Modelo;

import java.util.Date;

public class Renda {
	//declarando os atributos da renda
	double valorRenda;
	Date dataRenda;
	
	//sets and getters do cadastro de renda
	public double getValorRenda() {
		return valorRenda;
	}
	public void setValorRenda(double valorRenda) {
		this.valorRenda = valorRenda;
	}
	public Date getDataRenda() {
		return dataRenda;
	}
	public void setDataRenda(Date dataRenda) {
		this.dataRenda = dataRenda;
	}
	
	
}
