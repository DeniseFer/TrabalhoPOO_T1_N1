package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		float nota1;
		float nota2;
		float nota3;
		double media;
		Scanner sc = new Scanner(System.in);

		System.out.println("=======CÁLCULO DE MÉDIA=======\n");
		
		System.out.println("Digite a nota 1:\n");
		nota1 = sc.nextFloat();
		System.out.println("Digite a nota 2:\n");
		nota2 = sc.nextFloat();
		System.out.println("Digite a nota 3:\n");
		nota3 = sc.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
	
		System.out.printf("Sua média é "+ new DecimalFormat(".##").format(media));
		
	}

}
