package ExerciciosJavaDia1;

import java.util.Scanner;

public class exercicioJava08 {
	
public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			double n1, n2, n3, p1, p2, p3, media;
			
			System.out.println("Programa: Média Ponderada.");
			System.out.println("Insira a 1º Nota:");
			n1 = entrada.nextDouble();
			
			System.out.println("Insira o 1º Peso:");
			p1 = entrada.nextDouble();
			
			System.out.println("Insira a 2º Nota:");
			n2 = entrada.nextDouble();
			
			System.out.println("Insira o 2º Peso:");
			p2 = entrada.nextDouble();
			
			System.out.println("Insira a 3º Nota:");
			n3 = entrada.nextDouble();
			
			System.out.println("Insira o 3º Peso:");
			p3 = entrada.nextDouble();
			
			media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		

		System.out.println("A média final é: " + media);
		}
		
	}

}



