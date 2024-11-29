package view;

import controller.PessoaController;
import model.PessoaModel;

public class Main {

	public static void main(String[] args) {
		PessoaModel pessoa = new PessoaModel(1.69,1.85,2.06);
	
		
		PessoaController controller = new PessoaController();
		controller.mediaAltura(pessoa);


	}

}
