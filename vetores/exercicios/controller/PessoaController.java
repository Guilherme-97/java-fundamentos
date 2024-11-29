package controller;

import model.PessoaModel;

public class PessoaController {

	PessoaModel pessoaModel;

	public void mediaAltura(PessoaModel pessoa) {

		Double pessoas[] = pessoa.getAltura();
		Double media = 0.0;
		for (int i = 0; i < pessoas.length; i++) {

			System.out.println(pessoas[i]);
			media += pessoas[i] / pessoas.length;
		}
		System.out.printf("Média das alturas: %.2f",media);
	}
}
