package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("======Cálculo da soma de números inteiros=====\n");
		
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = 0;
		int soma = 0;
	 
		System.out.println("Digite um número inteiro:\n");
		n1 = sc.nextInt();
		System.out.println("Digite um número inteiro:\n");
		n2 = sc.nextInt();
		System.out.println("Digite um número inteiro:\n");
		n3 = sc.nextInt();
		System.out.println("Digite um número inteiro:\n");
		n4 = sc.nextInt();
		
		soma = n1+n2+n3+n4;
		System.out.println("A soma de todos esses números é igual a "+soma);

	}

}
