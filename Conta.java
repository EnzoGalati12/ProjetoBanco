package br.com.banco;

public class Conta {

	Cliente clinte;
	int numConta;
	double saldo;

	public Conta(Cliente clinte, int numConta, double saldo) {
		this.clinte = clinte;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo+valor;
		System.out.println("Depósito efetuado com sucesso");
	}
	
	public void sacar(double valor) {
		this.saldo = this.saldo-valor;
		System.out.println("Saque efetuado com sucesso");
	}

}
