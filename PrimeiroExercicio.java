package exerciciosCapgemine;

import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {

		Scanner leiaScanner = new Scanner(System.in);

		char desejaContinuar = 's';

		while (desejaContinuar == 's' && desejaContinuar == 's') {
			System.out.println("Digite um numero");

			int numero = leiaScanner.nextInt();

			if (numero == 0) {
				System.out.println("O numero é zero");

			} else {

			
			if (numero > 0) {
				System.out.println("O numero é maior que Zero");
				
			} else {
				System.out.println("O numero é menor que zero");
			}
		}
		System.out.println("Deseja continuar ? S/sim N/não");
		desejaContinuar = leiaScanner.next().charAt(0);
	}

}
}