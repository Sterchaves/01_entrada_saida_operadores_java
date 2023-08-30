package entrada_saida_operadores_java;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		
		var scanner = new Scanner(System.in);
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		float diferenca;

		System.out.println("\nDigite o primeiro número: ");
		numero1 = scanner.nextFloat();
		System.out.println("\nDigite o segundo número: ");
		numero2 = scanner.nextFloat();
		System.out.println("\nDigite o terceiro número: ");
		numero3 = scanner.nextFloat();
		System.out.println("\nDigite o quarto número: ");
		numero4 = scanner.nextFloat();
		
		diferenca = (numero1*numero2)-(numero3*numero4);
		System.out.printf("\nA diferença é: %.1f ", diferenca);

	}	
}
