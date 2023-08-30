package entrada_saida_operadores_java;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
	
		float salario;
		float abono;
		float novoSalario;
		
		System.out.println("\nDigite o salário: ");
		salario = scanner.nextFloat();
		System.out.println("\nDigite o abono: ");
		abono = scanner.nextFloat();
		
		novoSalario = salario + abono;
		System.out.printf("\nExibe novo salário: %.1f", novoSalario);

	}
}
