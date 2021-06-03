package ExerciciosJavaDia1;

import java.util.Scanner;

public class exercicioJava03 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		int minutos, segundos , horas;
		
		System.out.println("Escreva quantos segundos durou seu evento: ");
		segundos = ler.nextInt();
		
		minutos = (segundos/60);
		horas =  (minutos/60);
		
		System.out.println("Os minutos de duração do seu evento foram de: "+ minutos);
		System.out.println("As horas de duração do seu evento foram de: "+ horas);
		
	}

}
