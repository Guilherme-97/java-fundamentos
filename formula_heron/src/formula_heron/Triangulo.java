package formula_heron;

public class Triangulo {

	private double num1;
	private double num2;
	private double num3;

	// para gerar getter e setter ctrl+3 ggas(Generate getters and setters)

	public Triangulo(double a, double b, double c) {
		this.num1 = a;
		this.num2 = b;
		this.num3 = c;
	}

	public double area() {
		double p = (num1 + num2 + num3) / 2;
		double a = p * (p - num1) * (p - num2) * (p - num3);
		double area = Math.sqrt(a);
		return area;
	}

	public String retorno() {
		double a = Triangulo.this.area();
		String mensagem = "Área do triângulo: " + a;
		return mensagem;

	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}

}
