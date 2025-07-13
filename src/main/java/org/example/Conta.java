package org.example;

public class Conta {
	private String numero;
	private double saldo;
	
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta() {
		this.numero = "0";
		this.saldo = 0.0;
	}
	
	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	
	public void debitar(double valor) {
		this.saldo = this.saldo - valor;
	}
	
	public void transferir(Conta contaDestino, double valor) {
		contaDestino.creditar(valor);
		this.debitar(valor);
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
}

 
