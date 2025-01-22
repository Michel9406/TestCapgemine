package exerciciosCapgemine;

import java.util.Scanner;

public class segundoExercicio {

	public static void main(String[] args) {

		String nomeProduto;
		float precoCusto;
		float precoVenda;

		float totalCusto = 0.0f;
		float totalVenda = 0.0f;

		Scanner leitor = new Scanner(System.in);
		
		int i = 0;
		for (; i < 40; i ++) {

			System.out.println("Digite o nome do produto: ");
			nomeProduto =  leitor.next ();

			System.out.println("Digite o preço de custo do produto: ");
			precoCusto =  leitor.nextFloat();

			System.out.println("Digite Preço de venda do produto:\n ");
			precoVenda =  leitor.nextFloat();

			totalCusto = totalCusto + precoCusto;
			totalVenda = totalVenda + precoVenda;

			if (precoCusto == precoVenda) {
				System.out.println("Ouve um empate\n");
			} else {

				if (precoCusto > precoVenda) {
					System.out.println(" Ouve prejuizo \n");
				} else {
					System.out.println(" Ouve lucro \n");

					System.out.println(nomeProduto + "preco de Custo = " + precoCusto + " preco de Venda = " + precoVenda);

					System.out.println(" A media de preço de custo é de: " + (totalCusto / i));
					System.out.println(" A media de preço de venda é de: " + (totalVenda / i));

				}
			}

		}

	}

}
