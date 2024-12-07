package listas2;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		ArrayList<Funcionario> f = new ArrayList<>();
		f.add(new Funcionario("Guilherme", 1, 3.333));
		f.add(new Funcionario("Heloisa", 2, 4.333));
		f.add(new Funcionario("Sandra", 3, 5.333));

		Predicate<Funcionario> condicao = s -> s.getId() == 2;

		ArrayList<Funcionario> result = (ArrayList<Funcionario>) f.stream().filter(condicao)
				.collect(Collectors.toList());

		for (Funcionario funcionario : result) {
			System.out.println(funcionario.getNome());
		}

	}
}
