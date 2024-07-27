import java.util.Locale;

public class Formatacao {

	public static void main(String[] args) {

		System.out.println("Resultado soma: " + soma(2, 3));
		System.out.println("Resultado subtração: " + subtracao(5, 22));
		System.out.println("Resultado multiplicação: " + multiplicacao(5, 3));
		System.out.println("Resultado divisão: " + Divisao(15.00, 30.00));
		Double x = 10.566985;
		// printf para formatar numero com casa decimal
		// Locale, biblioteca de formatação de local = Estados Unidos
		Locale.setDefault(Locale.US);
		System.out.printf("Resultado = %.4f", x);
		System.out.println();
		Locale.setDefault(Locale.ITALIAN);
		System.out.printf("Resultado = %.2f", x);
		/*
		 * marcadores: %f = ponto flutuante %d = numero inteiro %s = texto %n quebre de
		 * linha ex:
		 */
		System.out.println();
		int idade = 26;
		String nome = "Guilherme";
		Double salario = 3.0000000;
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e ganha %.3f", nome, idade, salario);

	}

	public static Integer soma(int num1, int num2) {
		int soma = num1 + num2;
		return soma;
	}

	public static Integer subtracao(int num1, int num2) {
		int subtracao;
		if (num1 < num2) {
			subtracao = num2 - num1;

		} else {
			subtracao = num1 - num2;
		}
		return subtracao;
	}

	public static Integer multiplicacao(Integer num1, Integer num2) {
		Integer res = num1 * num2;
		return res;
	}

	public static Double Divisao(Double num1, Double num2) {
		Double res;
		if (num2 > num1) {
			res = num2 / num1;
		} else {
			res = num1 / num2;
		}

		return res;

	}

}
