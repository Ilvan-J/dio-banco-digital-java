package br.com.dio.banco;

public class Main {

	public static void main(String[] args) {

		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Conta cc = new ContaCorrente(venilton);
		ContaPoupanca poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		poupanca.rendimento(0.5, 0d);
		poupanca.imprimirExtrato();
		
	}

}
