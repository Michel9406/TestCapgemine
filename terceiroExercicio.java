package exerciciosCapgemine;

import java.util.Scanner;

public class terceiroExercicio {

	private static final int D = 0;

	public static void main(String[] args) {

	int anoFabricacao = 0;
	float valorCarro = 0.0f;
	float porcentagemDesconto = 0.0f;
	float valorDesconto = 0.0f;
	float valorPagar = 0.0f;
	
	int totalCarroSemiNovos = 0;
	int totalCarros = 0;
	

	Scanner ler = new Scanner (System.in);	
	
	char desejaRepetir = 's';
	
	while ( desejaRepetir == 's'|| desejaRepetir == 'S' ) {
		
		System.out.println( " Digite o Valor do veiculo");
		 anoFabricacao = ler.nextInt();
		 
		 System.out.println(" Digite o ano de fabricação");
		 valorCarro = ler.nextFloat();
		 
		 if (anoFabricacao <= 2000) {
			 porcentagemDesconto = 0.12f;
		 }else {
			 porcentagemDesconto = 0.07f;
			 totalCarroSemiNovos++;
			}
		totalCarros ++;
		 
	 valorDesconto = valorCarro * porcentagemDesconto;
	 valorPagar = valorCarro - valorDesconto;
	
	 System.out.println(" Valor de desconto foi de: " + valorDesconto);
	 System.out.println(" Valor que deve ser pago é :" + valorPagar);
	 
	 System.out.println(" Deseja fazer mais cadastro ? S- sim / N- Não");
		 desejaRepetir = ler.next ().charAt (D);
		 
	}
	System.out.println("Total de carros semi noovos " + totalCarroSemiNovos);
	
	System.out.println("Total de carros " + totalCarros);
	}

}
