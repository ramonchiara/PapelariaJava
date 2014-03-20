package br.pro.ramon.papelaria.ex3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		Produto produto = new Produto();

		// entradas:
		// descri��o
		System.out.print("Descri��o: ");
		produto.descricao = console.nextLine();

		// pre�o
		System.out.print("Pre�o: ");
		produto.preco = Double.parseDouble(console.nextLine());

		// opera��o
		System.out.print("Opera��o - (I)nclus�o, (A)ltera��o, (R)emo��o: ");
		String operacao = console.nextLine();

		// processamento:
		// mensagem
		String mensagem;
		switch (operacao) {
			case "I":
			case "i":
				mensagem = inserirProduto(produto);
				break;

			case "A":
			case "a":
				mensagem = alterarProduto(produto);
				break;

			case "R":
			case "r":
				mensagem = removerProduto(produto);
				break;

			default:
				mensagem = "Opera��o inv�lida!";
				break;
		}

		// sa�da:
		// mensagem
		System.out.println(mensagem);
	}

	public static String inserirProduto(Produto p) {
		return String.format("O produto %s de pre�o R$ %.2f foi inclu�do com sucesso", p.descricao, p.preco);
	}

	public static String alterarProduto(Produto p) {
		return String.format("O produto %s de pre�o R$ %.2f foi alterado com sucesso", p.descricao, p.preco);
	}
	
	public static String removerProduto(Produto p) {
		return String.format("O produto %s de pre�o R$ %.2f foi removido com sucesso", p.descricao, p.preco);
	}

}

class Produto {
	
	public String descricao;
	public double preco;
	
}
