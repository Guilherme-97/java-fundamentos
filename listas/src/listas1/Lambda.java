package listas1;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Guilherme");
		nomes.add("Heloisa");
		nomes.add("Gustavo");
		nomes.add("Sandra");
		nomes.add("Pedro Teixeira");
		nomes.add("Sara");

		// expressão lambda
		// se na posição 6 tiver um a
		Predicate<String> condicao = s -> s.charAt(0) == 'H';
		// se na posiçãp 0 tiver um g
		Predicate<String> condicao2 = s -> s.charAt(0) == 'G';
		// uso as duas expressões para remover
		nomes.removeIf(condicao.or(condicao2));

		Predicate<String> condicao3 = s -> s.charAt(0) == 'G';

		for (String x : nomes) {
			System.out.println(x);
		}

		System.out.println("-----------------------------------");

		System.out.println(nomes.indexOf("Pedro Teixeira"));

		System.out.println("-----------------------------------");

		ArrayList<String> result = new ArrayList<>();
		result =  (ArrayList<String>) nomes.stream().filter(condicao3).collect(Collectors.toList());

		for (String s : result) {
			System.out.println(s);
		}

		// System.out.println(nomes.stream().filter(condicao3).collect(Collectors.toList()));

	}

}
