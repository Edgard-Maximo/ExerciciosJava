package exerciciosLacoRepeticao;
//Autor:edgard 
//Data:04/06
//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero 
//igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)

import java.util.Scanner;

public class exercicioJava05 {

	public static void main(String[] args) {
		

		int numero = 0, soma = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe os n�meros (E aperte 0 para finalizar a soma)");

		do {
			numero = entrada.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("A soma dos valores inseridos � de: " + soma);

		entrada.close();
	}

}
