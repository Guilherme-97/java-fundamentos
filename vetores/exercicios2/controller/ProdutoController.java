package controller;

import java.util.ArrayList;
import java.util.List;

import model.ProdutoModel;

public class ProdutoController {

	public static void listaProdutos() {

		List<ProdutoModel> model = new ArrayList<>();
		ProdutoModel m1 = new ProdutoModel("Tv", 900.00);
		ProdutoModel m2 = new ProdutoModel("Sofá", 400.00);
		ProdutoModel m3 = new ProdutoModel("Fogão", 800.00);
		model.add(m1);
		model.add(m2);
		model.add(m3);
		Double res = 0.0;
		Double total = 0.0;
		for (ProdutoModel produtos : model) {
			print("Produto: ", produtos.getNome());
			print("Preço: ", produtos.getPreco());
			total += produtos.getPreco();
			Integer media = model.size();
			res = total / media;
		}
		System.out.printf("Média de valor em estoque: %.2f", res);

		// print("Média de valor em estoque: %.2f", res);

	}

	public static void print(String s, Object o) {
		System.out.print(s);
		System.out.println(o.toString());
	}
}
