package exerciciosLacoRepeticao;
//Autor:edgard 
//Informar todos os n�meros de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
//Data:04/06


public class exercicioJava01 {

	public static void main(String[] args) {

		int i;

		for (i = 1000; i <= 2000; i++) {
		
			if (i % 11 == 5) 
				System.out.println("Esse s�o os resultados obtidos: " + i);
			}

		}

	}

