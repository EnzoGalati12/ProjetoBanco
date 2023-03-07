package br.com.banco;

public class Executavel {

	public static void main(String[] args) {
		Cliente clienteEnzo = new Cliente("Enzo", "Av Paula Ferreira" , "02/12/02" );
		Cliente borba = new Cliente("Borba", "Rua da Aviação", "02/11/2003");
		ContaCorrente contaEnzo = new ContaCorrente(clienteEnzo, 1);
		ContaCorrente conta2 = new ContaCorrente(borba, 2);

		// simulações

		contaEnzo.depositar(10000);
		conta2.depositar(5000);
		
		contaEnzo.transferir(conta2, 1000);
		contaEnzo.investir(1000, 2);

		conta2.consultaSaldo();
		contaEnzo.consultaSaldo();

		Conta.exibirContador();
	}

}
