package ExerciciosJavaDia1;

import java.util.Scanner;

public class exercicioJava02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int anos, meses, dias;
		System.out.println("Escreva quantos dias voce viveu: ");
		dias = ler.nextInt();

		anos = (dias / 365);
		meses = (dias / 30);

		System.out.println("A quantidade de anos que voc� j� viveu foi de: " + anos);
		System.out.println("A quantidade de meses que voc� j� viveu foi de: " + meses);

	}

}
