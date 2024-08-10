package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOperadores {

	public static void main(String[] args) {

//Uma operadore de telefone cobra 50$ por um plano básico que dá direito a 100 minutos de telefone. 
//cada minuto que exceder a franquia de 100 minutos custa 2$. Fazer um programa para ler a quantidade 
//de minutos que uma pessoa consumiu, mostrar o valor a ser pago.

		Scanner scr = new Scanner(System.in);
		Double plano = 50.00;
		Double minutos = 100.00;
		Double custo = 2.00;
		Double valor;
		System.out.println("Quantidade de minutos utilizados durante o mês: ");
		Locale.setDefault(Locale.US);
		Double usado = scr.nextDouble();
		if (usado <= minutos) {
			valor = plano;
		} else {
			Double diferenca = (usado - minutos);
			valor = (diferenca * custo) + plano;
		}
		System.out.println("Valor a pagar: " + valor);
		scr.close();
	}

}
