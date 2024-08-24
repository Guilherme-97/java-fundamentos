package estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		System.out.println("Média\nDigite as 3 notas referente:" + ""
				+ "\n1° Nota(trabalho)\n2° Nota(prova)\n3° Nota(atividades)");
		double mediaFinal = 0.0;
		int x = 3;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < x; i++) {

			Locale.setDefault(Locale.US);
			double media = sc.nextDouble();
			mediaFinal += media;

		}
		double res = mediaFinal / x;
		System.out.printf("Media final: %.2f ", res);
		sc.close();
	}
}
