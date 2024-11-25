package formula_heron;

public class Main {

	public static void main(String[] args) {

		Triangulo x = new Triangulo(10, 4, 5);
		Triangulo y = new Triangulo(4, 5, 6);
		Service s = new Service();
		System.out.println(x.retorno());
		System.out.println(y.retorno());
		System.out.println("\nMaior Triângulo: " + s.maior(x, y));

	}

}
