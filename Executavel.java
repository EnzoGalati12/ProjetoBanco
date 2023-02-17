package br.com.banco;

public class Executavel {
	
	public static void main(String[] args) {
		Cliente clienteEnzo = new Cliente("Enzo", "Av Paula Ferreira","02/12/2002");
		Cliente borba = new Cliente("Borba" , "Rua da Aviação","02/11/2003");
		Conta contaEnzo = new Conta(clienteEnzo, 1,0.0);
		Conta conta2 = new Conta(borba,2,0.0);
		
		
		
		contaEnzo.depositar(10000);
		conta2.depositar(5000);
		
		
		contaEnzo.transferir(conta2, 1000);
		
		conta2.consultaSaldo();
		
		contaEnzo.consultaSaldo();
		
	}

}
