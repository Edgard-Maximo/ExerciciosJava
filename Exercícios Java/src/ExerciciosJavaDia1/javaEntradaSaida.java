package ExerciciosJavaDia1;

import java.util.Scanner;

public class javaEntradaSaida {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int a, b, soma;

		System.out.println("Escreva o valor de A:");
		a = entrada.nextInt();

		System.out.println("Escreva o valor de B:");
		b = entrada.nextInt();

		soma = a + b;
		System.out.println("A soma dos dois números é: " + soma);
		
	}

}
