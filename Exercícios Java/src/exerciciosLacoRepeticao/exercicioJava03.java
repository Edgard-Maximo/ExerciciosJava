package exerciciosLacoRepeticao;
//Autor:edgard 
//Data:04/06
//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)

import java.util.Scanner;

public class exercicioJava03 {

	public static void main(String[] args) {

		int idade = 0, idadeMenor21 = 0, idadeMaior50 = 0;

		Scanner entrada = new Scanner(System.in);

		while (idade != -99) {
			System.out.println("Digite a idade: ");
			idade = entrada.nextInt();

			if (idade < 21 && idade > 0) {
				idadeMenor21++;
			} else if (idade > idadeMaior50) {
				idadeMaior50++;
			}
		}

		System.out.println("Pessoas com menos de 21 anos: " + idadeMenor21);
		System.out.println("Pessoas com mais de 50 anos: " + idadeMaior50);
		
		entrada.close();
	
	}
}
