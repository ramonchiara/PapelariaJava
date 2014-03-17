package br.pro.ramon.papelaria.ex1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		// entradas:
		// descrição
		System.out.print("Descrição: ");
		String descricao = console.nextLine();

		// preço
		System.out.print("Preço: ");
		double preco = Double.parseDouble(console.nextLine());

		// operação
		System.out.print("Operação - (I)nclusão, (A)lteração, (R)emoção: ");
		String operacao = console.nextLine();

		// processamento:
		// mensagem
		String mensagem;
		switch (operacao) {
			case "I":
			case "i":
				mensagem = String.format("O produto %s de preço R$ %.2f foi incluído com sucesso", descricao, preco);
				break;

			case "A":
			case "a":
				mensagem = String.format("O produto %s de preço R$ %.2f foi alterado com sucesso", descricao, preco);
				break;

			case "R":
			case "r":
				mensagem = String.format("O produto %s de preço R$ %.2f foi removido com sucesso", descricao, preco);
				break;

			default:
				mensagem = "Operação inválida!";
				break;
		}

		// saída:
		// mensagem
		System.out.println(mensagem);
	}

}
