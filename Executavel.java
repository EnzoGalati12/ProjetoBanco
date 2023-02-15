package br.com.banco;

public class Executavel {
	
	public static void main(String[] args) {
		
		Cliente clienteEnzo = new Cliente("Enzo", "Av Paula Ferreira","02/12/2002");
		
		Conta contaEnzo = new Conta(clienteEnzo, 1,0.0);
		
		contaEnzo.depositar(10.000);
		contaEnzo.sacar(5.000);
		contaEnzo.depositar(50.000);
		
	}

}
