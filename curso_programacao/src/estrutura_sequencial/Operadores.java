package estrutura_sequencial;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * // * && = E as duas condições devem ser verdadeiras. || = OU uma das
		 * condições devem ser verdadeiras ! = NÃO inverte a condição. ex f = v v = f
		 */
		int x = 5;

		// &&
		int a = 2;
		int b = 6;
		// como as duas condições não satisfazem o && o resultado será false
		System.out.println((x > a && x > b));

		// ||
		int c = 2;
		int d = 6;
		// Uma condição satisfaz, resultado igual a true.
		System.out.println((x > c || x > d));

		// !
		int e = 2;
		int f = 6;
		// inverte o resultado
		System.out.println(!(x > e));
		System.out.println(!(x > f));

		// v && f = f como ! na frente = v
		System.out.println(!(x >= 3 && x <= 2));

	}

}
