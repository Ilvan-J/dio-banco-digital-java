package br.com.dio.utils;

import java.util.Scanner;

public class Menu {
	public Integer criaMenu(String[] items) {

		var opcao = 0;
		
		while (true) {

			System.out.println("Escolha uma opção");
			for (var i = 0; i < items.length; i++) {
				System.out.println((i + 1) + " - " + items[i]);
			}

			var entrada = new Scanner(System.in);

			try {
				opcao = entrada.nextInt();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Informe um valor inteiro!");
				continue;
			}
			
			break;
		}
		

		return opcao;

	}
}
