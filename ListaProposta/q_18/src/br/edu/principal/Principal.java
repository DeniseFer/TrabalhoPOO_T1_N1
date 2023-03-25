package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double celsius= 0.0;
		double faren= 0.0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Digite a temperatura em Celsius: ");
		celsius = sc.nextDouble();
		faren = (celsius*9/5) + 32;

		System.out.println("============================");
		System.out.println("===RESULTADO DA CONVERSÃO===");
		System.out.println("============================");

		System.out.println("A temperatura em Farenheit é: "+ faren);

	}

}
