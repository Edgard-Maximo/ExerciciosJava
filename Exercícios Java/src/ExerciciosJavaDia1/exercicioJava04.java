package ExerciciosJavaDia1;

import java.util.Scanner;

public class exercicioJava04 {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		double a,b,c,r,s,d;
		
		System.out.println("Escreva o valor de A: ");
		a = ler.nextDouble();
		System.out.println("Escreva o valor de B: ");
		b = ler.nextDouble();
		System.out.println("Escreva o valor de C: ");
		c = ler.nextDouble();
		
		r= Math.pow(a, b);
		s= Math.pow(b, c);
		d= (r+s)/2;
		System.out.println("O resultado de D �: "+d);
	}

}
