package exerciciosLacoRepeticao;
//Autor:edgard 
//Data:04/06
//Crie um programa que leia um número do teclado até que encontre um número 
//igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)

import java.util.Scanner;

public class exercicioJava05 {

	public static void main(String[] args) {
		

		int numero = 0, soma = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe os números (E aperte 0 para finalizar a soma)");

		do {
			numero = entrada.nextInt();
			soma += numero;
		} while (numero != 0);

		System.out.println("A soma dos valores inseridos é de: " + soma);

		entrada.close();
	}

}
