package exerciciosLacoRepeticao;

import java.util.Scanner;

//Autor:edgard 
//Data:04/06
//Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3.
//Para sair digitar 0(zero).(DO...WHILE)

public class exercicioJava06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int x, soma = 0, cont = 0;
		double media;
		System.out.println("Programa: média dos múltiplos de 3. O programa encerra quando você digita 0.");
		do {
			System.out.println("Digite um número: ");
			x = entrada.nextInt();

			if (x % 3 == 0) {
				soma += x;
				cont++;
			}
		} while (x != 0);

		entrada.close();

		media = soma / cont;

		System.out.println("A média dos múltiplos de 3 é " + media);
	}

}