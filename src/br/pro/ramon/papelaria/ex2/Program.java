package br.pro.ramon.papelaria.ex2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		// entradas:
		// descri��o
		System.out.print("Descri��o: ");
		String descricao = console.nextLine();

		// pre�o
		System.out.print("Pre�o: ");
		double preco = Double.parseDouble(console.nextLine());

		// opera��o
		System.out.print("Opera��o - (I)nclus�o, (A)ltera��o, (R)emo��o: ");
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
				mensagem = "Opera��o inv�lida!";
				break;
		}

		// sa�da:
		// mensagem
		System.out.println(mensagem);
	}

	public static String inserirProduto(String descricao, double preco) {
		return String.format("O produto %s de pre�o R$ %.2f foi inclu�do com sucesso", descricao, preco);
	}

	public static String alterarProduto(String descricao, double preco) {
		return String.format("O produto %s de pre�o R$ %.2f foi alterado com sucesso", descricao, preco);
	}
	
	public static String removerProduto(String descricao, double preco) {
		return String.format("O produto %s de pre�o R$ %.2f foi removido com sucesso", descricao, preco);
	}

}
