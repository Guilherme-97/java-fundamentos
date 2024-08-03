
public class Casting {

	public static void main(String[] args) {

		/*
		 * Casting: converte uma variável Sem o Casting a variável res tem o valor de
		 * 2.0, para o compilador são dois número inteiros, por isso ele corta o
		 * número após a virgula
		 */
		int a = 5;
		int b = 2;
		double res = (double) a / b;
		System.out.println(res);

	}

}
