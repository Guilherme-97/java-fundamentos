package estrutura_sequencial;

public class OperadoresCumulativos {

	public static void main(String[] args) {
		// Operadores cumulativos

		// a += b == a = a + b
		// a -= b == a = a - b
		// a /= b == a = a / b
		// a *= b == a = a * b

		Double a = 2.0;
		Double b = 3.0;

		str(a += b);
		str(a -= b);
		str(a /= b);
		str(a *= b);
	}

	public static void str(Object str) {
		System.out.println(str);
	}

}
