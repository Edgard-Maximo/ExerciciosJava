package exerciciosLacoRepeticao;

import java.util.Scanner;

//Autor:edgard 
//Data:04/06
//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
//Para sair digitar 0(zero).(DO...WHILE)

public class exercicioJava06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int x, soma = 0, cont = 0;
		double media;
		System.out.println("Programa: m�dia dos m�ltiplos de 3. O programa encerra quando voc� digita 0.");
		do {
			System.out.println("Digite um n�mero: ");
			x = entrada.nextInt();

			if (x % 3 == 0) {
				soma += x;
				cont++;
			}
		} while (x != 0);

		entrada.close();

		media = soma / cont;

		System.out.println("A m�dia dos m�ltiplos de 3 � " + media);
	}

}