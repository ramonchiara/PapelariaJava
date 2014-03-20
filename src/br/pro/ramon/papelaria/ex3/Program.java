package br.pro.ramon.papelaria.ex3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		Produto produto = new Produto();

		// entradas:
		// descrição
		System.out.print("Descrição: ");
		produto.descricao = console.nextLine();

		// preço
		System.out.print("Preço: ");
		produto.preco = Double.parseDouble(console.nextLine());

		// operação
		System.out.print("Operação - (I)nclusão, (A)lteração, (R)emoção: ");
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
				mensagem = "Operação inválida!";
				break;
		}

		// saída:
		// mensagem
		System.out.println(mensagem);
	}

	public static String inserirProduto(Produto p) {
		return String.format("O produto %s de preço R$ %.2f foi incluído com sucesso", p.descricao, p.preco);
	}

	public static String alterarProduto(Produto p) {
		return String.format("O produto %s de preço R$ %.2f foi alterado com sucesso", p.descricao, p.preco);
	}
	
	public static String removerProduto(Produto p) {
		return String.format("O produto %s de preço R$ %.2f foi removido com sucesso", p.descricao, p.preco);
	}

}

class Produto {
	
	public String descricao;
	public double preco;
	
}
