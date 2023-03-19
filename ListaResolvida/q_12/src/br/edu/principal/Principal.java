package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número positivo e maior que 0: ");
		double num = sc.nextDouble();
		System.out.println("Digite o segundo número positivo e maior que 0: ");
		double num2 = sc.nextDouble();
		
		if (num <= 0 | num2 <= 0) {
			System.out.println("Os números precisam ser maiores que zero!");}
		
		else {
		double resultado1 = Math.pow(num, num2);
		double resultado2 = Math.pow(num2, num);
		
		System.out.println("-------------");
		System.out.println("---RESULTADOS---");
		System.out.println("-------------");
		System.out.println(num + " elevado a " + num2 + " é igual a: " + new DecimalFormat(".##").format(resultado1));
		System.out.println(num2 + " elevado a " + num + " é igual a: " + new DecimalFormat(".##").format(resultado2)); 
		}
		}

	}


