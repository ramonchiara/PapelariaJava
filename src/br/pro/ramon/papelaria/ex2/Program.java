package br.pro.ramon.papelaria.ex2;

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
				mensagem = inserirProduto(descricao, preco);
				break;

			case "A":
			case "a":
				mensagem = alterarProduto(descricao, preco);
				break;

			case "R":
			case "r":
				mensagem = removerProduto(descricao, preco);
				break;

			default:
				mensagem = "Operação inválida!";
				break;
		}

		// saída:
		// mensagem
		System.out.println(mensagem);
	}

	public static String inserirProduto(String descricao, double preco) {
		return String.format("O produto %s de preço R$ %.2f foi incluído com sucesso", descricao, preco);
	}

	public static String alterarProduto(String descricao, double preco) {
		return String.format("O produto %s de preço R$ %.2f foi alterado com sucesso", descricao, preco);
	}
	
	public static String removerProduto(String descricao, double preco) {
		return String.format("O produto %s de preço R$ %.2f foi removido com sucesso", descricao, preco);
	}

}
