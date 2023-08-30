package entrada_saida_operadores_java;

import java.util.Scanner;

public class Atividade3 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
	
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;

		
		System.out.println("\nDigite o seu salário bruto: ");
		salarioBruto = scanner.nextFloat();
		System.out.println("\nDigite o seu adicional noturno: ");
		adicionalNoturno = scanner.nextFloat();
		System.out.println("\nDigite suas horas extras: ");
		horasExtras = scanner.nextFloat();
		System.out.println("\nDigite o seu desconto: ");
		descontos = scanner.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		System.out.printf("\nExibe novo salário: %.1f", salarioLiquido);

	}
}
