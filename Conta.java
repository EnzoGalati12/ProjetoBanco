package br.com.banco;

//proibe a instancia da class
public abstract class Conta {
	
	protected Cliente cliente;
	protected int numConta;
	protected double saldo;

	public Conta(Cliente clinte, int numConta) {
		this.cliente = clinte;
		this.numConta = numConta;
		
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

	public abstract void consultaSaldo();
		
	

}