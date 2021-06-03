package ExerciciosJavaDia1;

import java.util.Scanner;

public class exercicioJava01 {

	public static void main(String[] args) {
		
		int dia, mes, idade;

		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Coloque sua idade apenas em anos");
		idade = entrada.nextInt();
		
		
		System.out.println("Coloque sua idade apenas em mes");
		mes = entrada.nextInt();
		
		
		System.out.println("Coloque sua idade apenas em dias");
		dia = entrada.nextInt();
		
	
		
		System.out.println("Sua idade em dia é: " + idade + "dias");
		
		
	}

}
