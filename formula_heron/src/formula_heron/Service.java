package formula_heron;

public class Service {

	public double maior(Triangulo a, Triangulo b) {
		double maior;

		if (a.area() > b.area()) {

			maior = a.area();
		} else {
			maior = b.area();
		}
		return maior;

	}

}
