import java.util.Locale;
import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Para saída de dados do tipo inteiro,
		sc.nextInt();
		int x, y;
		System.out.print("1° número: ");
		x = sc.nextInt(); //
		// ao digitar uma palavra, será armazenado em x(memória ram)
		System.out.print("2° número: ");
		y = sc.nextInt();
		int res = x + y;
		System.out.println("Resultado: " + res);

		// Para saída de dados do tipo String, sc.next() String nome;
		String nome = sc.next();
		System.out.print("Digite seu nome: ");
		nome = sc.next();
		System.out.println("Olá, " + nome + "!!");

		// Associando o Locale com a entrada de dados, para aceitar ponto:
		// antes do Scanner
		Locale.setDefault(Locale.US);
		System.out.println("How much? ");
		double price = sc.nextDouble();
		System.out.println("Price: " + price + " dollars.");

		// Exibindo textos diferentes apartir da quebra de linha:

		String s1, s2, s3;
		int num = sc.nextInt();
		sc.nextInt(); // Para não armazenar espaço em branco quando apertar enter
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println(num);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close(); // finaliza
	}

}
