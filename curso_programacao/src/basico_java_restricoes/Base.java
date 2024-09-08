package basico_java_restricoes;

import java.util.Scanner;

public class Base {

	public static void main(String[] args) {
		// Para verificar números binarios
		// Abra a calculadora e deixe no modo programador

		// Convenções:
		// Camel case: lastName
		// Tudo menos classe, começa com maiúscula
		// Pascal case: ProductService
		// Classe

		// Operadores bitwise(tabela verdade):
		// &: Somentes quando as duas condições forem verdadeiras
		// |: Quando qualquer uma das condições forem verdadeiras
		// ^(OU-exclusivo): Quando apenas uma condição for verdadeira
		// O bitwise é usado para testar bit a bit uma condição;
		// Usado para testar mascaras de rede;
		// onde o número 32 tem a 6th casa como verdadeira(0100 0000)

		// Exemplo de como testar bit a bit:
		// (89) 0101 1001
		// (60) 0011 1100

		// O bit a bit testa da direita para esquerda os dois numeros(89 e 60)
		// 0 Falso
		// 1 Verdadeiro

		// Testando o número 89 e 60
		// &(os dois tem que ser verdadeiros): 0001 1000 (24 em binario)
		// |(Um ou outro tem que ser verdadeiro): 0111 1101 (125 em binario)
		// ^(Apenas um pode ser verdadeiro ) 1010 1010 (101 em bninario)

		// Exemplo bit a bit:
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);

		// exemplo para testar se o 6th número é verdadeiro(1)
		// é usado o número 32 por possuir apenas a 6th casa com 1,
		// sendo o restante com 0(32 = 0010 0000)
		// quando ele é comparado com outros números usando o & o resultado
		// para negativo: 0000 0000
		// para positivo: 0010 0000(32)
		Scanner sc = new Scanner(System.in);
		// numero 32(6th true)
		int mask = 0b00100000;
		int num = sc.nextInt();
		if ((num & mask) != 0)
			System.out.println("The 6th number is True!");
		else {
			System.out.println("The 6th number is False!");
		}

		sc.close();

	}

}
