package br.com.dio.banco;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança");
		super.imprimirExtrato();
	}

	public void rendimento(Double redimentoPorcentagem, Double tr) {
		double valorRedimento = redimentoPorcentagem / 100;
		depositar((this.saldo * valorRedimento) + tr);
	}

}
