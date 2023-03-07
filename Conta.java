package br.com.banco;

import java.util.Calendar;

//abstract : não pode ser instanciada
public abstract class Conta {
	
	//final no atributo trsnfma em constante
	protected final Cliente cliente;
	protected final int numConta;
	protected double saldo;
	//protected Date dataAbertura = Calendar.getInstance().getTime();
	protected Calendar c = Calendar.getInstance();
	private static long contador;
	//static a variavel é da classe e n do objeto
	
	public static void exibirContador(){
		System.out.println("Contas : " + contador);
	}
	

	public Conta(Cliente clinte, int numConta) {
		this.cliente = clinte;
		this.numConta = numConta;
		contador++;
		c.getTime();
		//this.dataAbertura = dataAbertura;
		
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

	///abstract no método força sua rescrita
	public abstract void consultaSaldo();
		
	

}