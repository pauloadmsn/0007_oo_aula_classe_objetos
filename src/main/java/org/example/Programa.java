package org.example;

public class Programa {

	public static void main(String[] args) {
		Conta contaPaulo = new Conta("1234", 100.0);
		Conta contaMaria = new Conta();
		
		contaPaulo.creditar(100);
		System.out.println(contaPaulo.getSaldo());
		contaPaulo.debitar(50);
		System.out.println(contaPaulo.getSaldo());
		contaPaulo.transferir(contaMaria, 150);
		System.out.println(contaMaria.getSaldo());
		System.out.println(contaPaulo.getSaldo());	
	}
}

 