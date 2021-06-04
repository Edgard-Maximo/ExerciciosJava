package ExerciciosJavaDia2;
//Autor:Edgard

//Data: 03/06
//Faça um programa que entre com três números e coloque em ordem crescente.

import java.util.Scanner;

public class exercicioJava02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n1, n2, n3;

		System.out.println("Digite os 3 números:");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();
		n3 = entrada.nextInt();

		if (n1 <= n2 && n2 <= n3) {
			System.out.println("A ordem crescente é: " + n1 + n2 + n3);
		} else if (n1 <= n3 && n2 <= n3) {
			System.out.println("A ordem crescente é: " + n1 + n3 + n2);
		} else if (n2 <= n1 && n1 <= n3) {
			System.out.println("A ordem crescente é: " + n2 + n1 + n3);
		} else if (n2 <= n3 && n2 <= n1) {
			System.out.println("A ordem crescente é: " + n2 + n3 + n1);
		} else if (n3 <= n1 && n1 <= n2) {
			System.out.println("A ordem crescente é: " + n3 + n1 + n2);
		} else {
			System.out.println("A ordem crescente é: " + n3 + n2 + n1);
		}

	}

}
