package br.pro.ramon.papelaria.ex4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		Produto produto = new Produto();

		// entradas:
		// c�digo
		System.out.print("C�digo: ");
		produto.codigo = Integer.parseInt(console.nextLine());
		
		// descri��o
		System.out.print("Descri��o: ");
		produto.descricao = console.nextLine();

		// pre�o
		System.out.print("Pre�o: ");
		produto.preco = Double.parseDouble(console.nextLine());

		// promo��o
		System.out.print("Promo��o: ");
		produto.promocao = Boolean.parseBoolean(console.nextLine());

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
		return String.format("O produto %s foi inclu�do com sucesso", p.descricao);
	}

	public static String alterarProduto(Produto p) {
		return String.format("O produto %s foi alterado com sucesso", p.descricao);
	}
	
	public static String removerProduto(Produto p) {
		return String.format("O produto %s foi removido com sucesso", p.descricao);
	}

}

class Produto {
	
	public int codigo;
	public String descricao;
	public double preco;
	public boolean promocao;
	
}
