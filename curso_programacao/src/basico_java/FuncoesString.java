package basico_java;

public class FuncoesString {

	public static void main(String[] args) {

		// FORMATAR

		// Maiúscula
		String nome1 = "guilherme";
		System.out.println(nome1.toUpperCase());

		// Minúscula
		String nome2 = "GUILHERME";
		System.out.println(nome2.toLowerCase());

		// Remover espaços
		String nome3 = "Guilherme Rodrigues de Freitas";
		System.out.println(nome3.trim());

		// RECORTAR

		String nome4 = "       Remove os espaços antes e depois da string   ";
		System.out.println(nome4.trim());

		// SUBSTITUIR
		String nome5 = "exibe somente o que foi definido depois da posição.";
		System.out.println(nome5.substring(6));

		// BUSCAR
		String nome6 = "exibe somente o que foi definido entre as posições.";
		System.out.println(nome6.substring(6, 13));

		String nome7 = "Exibe a posição em que se encontra a primeira ocorrência de uma string";
		System.out.println(nome7.indexOf("pri"));

		String nome8 = "Exibe a posição da última ocorrência de uma string Exibe";
		System.out.println(nome8.lastIndexOf("Exi"));

		// Um vetor separando cada nome de string separado por espaço
		// Caso tire o espaço o vetor vai separar por letra ao invés da palavra
		// Um vetor com 4 elementos
		String nome9 = "Watermelon Apple Lemon Orange";
		String[] vetor = nome9.split(" ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

	}

}
