package br.pro.ramon.papelaria.ex5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		Produto produto = new Produto();

		// entradas:
		// código
		System.out.print("Código: ");
		produto.codigo = Integer.parseInt(console.nextLine());
		
		// descrição
		System.out.print("Descrição: ");
		produto.descricao = console.nextLine();

		// preço
		System.out.print("Preço: ");
		produto.preco = Double.parseDouble(console.nextLine());

		// promoção
		System.out.print("Promoção: ");
		produto.promocao = Boolean.parseBoolean(console.nextLine());

		// operação
		System.out.print("Operação - (I)nclusão, (A)lteração, (R)emoção: ");
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
				mensagem = "Operação inválida!";
				break;
		}

		// saída:
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
		return String.format("O produto %s foi incluído com sucesso", descricao);
	}

	public String alterarProduto() {
		return String.format("O produto %s foi alterado com sucesso", descricao);
	}
	
	public String removerProduto() {
		return String.format("O produto %s foi removido com sucesso", descricao);
	}

}
