package entrada_saida_operadores_java;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		float nota1;
		float nota2;
		float nota3;
		float nota4; 		
		
		float media;
		var scanner = new Scanner(System.in);
		System.out.println("\nDigite a primeira nota: ");
		nota1 = scanner.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = scanner.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = scanner.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		nota4 = scanner.nextFloat();

		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nA média das notas é: %.1f ", media);


	}
}
