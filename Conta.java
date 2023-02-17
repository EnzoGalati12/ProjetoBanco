package br.com.banco;

public class Conta {

	Cliente cliente;
	int numConta;
	double saldo;

	public Conta(Cliente clinte, int numConta, double saldo) {
		this.cliente = clinte;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
		System.out.println("Depósito efetuado com sucesso");
	}

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso");
			return true;
		} else {
			System.out.println("Não foi possivel realizar a operação");
			return false;
		}

	}//

	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}
	}//

	public void consultaSaldo() {
		System.out.println("Nome : " + this.cliente.nome);
		System.out.println("Saldo : " + this.saldo);
	}

}
