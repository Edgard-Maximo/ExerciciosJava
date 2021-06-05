package exerciciosLacoRepeticao;
//Autor:edgard 
//Data:04/06
//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)


import java.util.Scanner;

class exercicioJava02 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int num, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número");
			num = ent.nextInt();

			// para informar numeros pares
			if (num % 2 == 0) {
				par++;
			}

			// para informar números impares
			if (num % 2 == 1) {
				impar++;
			}

		}

		System.out.println("\nForam digitados " + par + " números pares ");
		// System.out.println("E " + impar + " números ímpares");

		System.out.println("\nForam digitados " + impar + " números pares ");
		// System.out.println("E " + par + " números pares");
	}
}
