package view;

import java.util.ArrayList;
import java.util.List;

import controller.PensaoController;
import exception.MyException;
import model.Pessoa;

public class PensaoView {

	public static void main(String[] args) throws MyException {

		Pessoa p = new Pessoa("Gui", "g@", 6);
		Pessoa p1 = new Pessoa("Sandra", "s@", 2);
		Pessoa p2 = new Pessoa("Pedro", "p@", 1);
		Pessoa p3 = new Pessoa("Heloisa", "h@", 5);
		Pessoa p4 = new Pessoa("Divonsir", "d@", 3);
		Pessoa p5 = new Pessoa("Danielle", "da@", 4);
		Pessoa p6 = new Pessoa("Amanda", "a@", 8);
		Pessoa p7 = new Pessoa("Abel", "ab@", 7);
		Pessoa p8 = new Pessoa("Felix", "f@", 0);

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p);
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		pessoas.add(p5);
		pessoas.add(p6);
		pessoas.add(p7);
		pessoas.add(p8);
		

		PensaoController.reserva(pessoas);

	}

}
