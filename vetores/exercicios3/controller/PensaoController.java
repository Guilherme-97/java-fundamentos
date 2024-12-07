package controller;

import java.util.List;

import exception.MyException;
import model.Pessoa;
import model.Quartos;

public class PensaoController {
	

	private static final String MSG = "Esse quarto já possui reserva";
	private static final String MSG2 = "Possuimos quartos de 0 a 8";

	public static void reserva(List<Pessoa> pessoas) throws MyException {

		int x = 1;
	
		Quartos quartos = new Quartos();
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getQuarto() > quartos.getNumQuarto().length || pessoas.get(i).getQuarto() < 0) {

				throw new MyException(MSG2);
			}
		}
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.print("Nome: ");
			System.out.println(pessoas.get(i).getNome());
			System.out.print("Email: ");
			System.out.println(pessoas.get(i).getEmail());
			System.out.print("Quarto: ");
			System.out.println(pessoas.get(i).getQuarto() + "\n");
			for (int j = x; j < pessoas.size(); j++) {
				if (pessoas.get(i).getQuarto() == pessoas.get(j).getQuarto()) {
					throw new MyException(MSG);
				}
			}
			x++;

		}

	}
}
