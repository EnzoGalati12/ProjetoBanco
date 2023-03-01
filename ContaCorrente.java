package br.com.banco;

public class ContaCorrente extends Conta {// subclass

	private double saldoInvestimento;

	public ContaCorrente(Cliente clinte, int numConta) {
		super(clinte, numConta);

	}
	
	

	public void investir(double valor, int tipo) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			switch (tipo) {
			case 1:
				saldoInvestimento += valor * 1.01;
				break;
			case 2:
				saldoInvestimento += valor * 1.05;
				break;
			default:
				saldoInvestimento += valor * 1.1;
				break;
			}// endswitch
		} // endif
	}



	@Override
	public void consultaSaldo() {
		System.out.println("Cliente :"+ this.cliente.getNome());
		System.out.println("Saldo :"+ this.saldo);
		System.out.println("Saldo Investimento :"+ saldoInvestimento);
		
		
		
	}

}
