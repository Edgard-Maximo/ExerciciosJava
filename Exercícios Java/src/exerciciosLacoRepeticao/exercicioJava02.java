package exerciciosLacoRepeticao;
//Autor:edgard 
//Data:04/06
//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)


import java.util.Scanner;

class exercicioJava02 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int num, par = 0, impar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "� n�mero");
			num = ent.nextInt();

			// para informar numeros pares
			if (num % 2 == 0) {
				par++;
			}

			// para informar n�meros impares
			if (num % 2 == 1) {
				impar++;
			}

		}

		System.out.println("\nForam digitados " + par + " n�meros pares ");
		// System.out.println("E " + impar + " n�meros �mpares");

		System.out.println("\nForam digitados " + impar + " n�meros pares ");
		// System.out.println("E " + par + " n�meros pares");
	}
}
