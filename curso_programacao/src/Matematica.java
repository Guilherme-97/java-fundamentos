import java.util.Locale;
import java.util.Scanner;

public class Matematica {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número que deseja cálcular a potencia: ");
		double x = sc.nextDouble();
		System.out.print("Agora digite qual o número ele vai ser elevado: ");
		double y = sc.nextDouble();
		double raiz = Math.pow(x, y);
		System.out.print("Resultado da potenciação do número " + x + " elevado a " + y + ": " + raiz);
		sc.close();

		Locale.setDefault(Locale.US);
		System.out.println("Digite um número para obter sua raiz quadrada: ");
		double num = sc.nextDouble();
		double res = Math.sqrt(num);
		System.out.printf("Raiz quadrada de %.2f é igual a %.2f", num, res);

	}

}
