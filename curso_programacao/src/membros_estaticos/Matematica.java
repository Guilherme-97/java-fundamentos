package membros_estaticos;

// classe estatica
public final class Matematica {

	private Matematica() {
	}

	// declaração de variável constante e estática
	// constantes devem ser escritas com maiuscula
	public static final Double PI = 3.14159;
	public static final Integer N = 3;

	// metodos estaticos não precisam de classe sendo instanciada
	// podem ser chamados direto no programa principal
	// são usados em classes utilitárias Math.sqrt();
	// ou em declaração de cosntantes;

	public static final Double volume(Double r) {
		double calculo = (4 * PI * Math.pow(r, N)) / N;
		return calculo;
	}
	public static final Double circumference(Double r) {
		double calculo = 2.0 * PI * r;
		return calculo;
	}
}
