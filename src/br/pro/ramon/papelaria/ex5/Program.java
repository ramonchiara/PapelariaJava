package br.pro.ramon.papelaria.ex5;

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
				mensagem = produto.inserirProduto();
				break;

			case "A":
			case "a":
				mensagem = produto.alterarProduto();
				break;

			case "R":
			case "r":
				mensagem = produto.removerProduto();
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

class Produto {
	
	public int codigo;
	public String descricao;
	public double preco;
	public boolean promocao;

	public String inserirProduto() {
		return String.format("O produto %s foi inclu�do com sucesso", descricao);
	}

	public String alterarProduto() {
		return String.format("O produto %s foi alterado com sucesso", descricao);
	}
	
	public String removerProduto() {
		return String.format("O produto %s foi removido com sucesso", descricao);
	}

}
