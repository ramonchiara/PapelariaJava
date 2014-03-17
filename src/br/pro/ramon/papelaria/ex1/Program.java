package br.pro.ramon.papelaria.ex1;

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
				mensagem = String.format("O produto %s de pre�o R$ %.2f foi inclu�do com sucesso", descricao, preco);
				break;

			case "A":
			case "a":
				mensagem = String.format("O produto %s de pre�o R$ %.2f foi alterado com sucesso", descricao, preco);
				break;

			case "R":
			case "r":
				mensagem = String.format("O produto %s de pre�o R$ %.2f foi removido com sucesso", descricao, preco);
				break;

			default:
				mensagem = "Opera��o inv�lida!";
				break;
		}

		// sa�da:
		// mensagem
		System.out.println(mensagem);
	}

}
