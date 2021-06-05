package exerciciosLacoRepeticao;

public class exemploLacoRepeticao {

	public static void main(String[] args) throws InterruptedException {

		// while = enquanto
		int numero = 10;

		while (numero > 0) {

			System.out.println("Contando . . ." + numero);
			numero = numero - 1;
			Thread.sleep(1000);
		}

		System.out.println("Contagem Parada....");
	}

}
