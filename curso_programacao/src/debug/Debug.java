package debug;

import java.util.Locale;
import java.util.Scanner;

public class Debug {
	public static void main(String[] args) {

		/*
		 * Para adicionar um Breakpoint, botão direito, Toggle Breakpoint Para remover
		 * faça o mesmo. Clique na classe a esquerda e rode o programa pelo Debug As,
		 * use a perspectiva(window>perspective>OpenPerspective) Debug As Ela passa detalhadamente cada entrada de dados.
		 * Voce pode avançar as linhas apertando F6, ou ir clicando Step Over(F6 flecha amarela encima a esquerda) que da
		 * no mesmo. Útil em programas extensos , para o desenvolvedor saber o que está
		 * ocorrendo
		 *  Para interromper, clique no quadrado vermelho.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		sc.close();

	}
}
