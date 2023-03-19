package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número real: \n");
		double num = sc.nextDouble();
		double i = Math.floor(num);
		double f = num - i;
		double a = Math.round(num);
		
		System.out.println("================");
		System.out.println("====RESULTADOS=====");
		System.out.println("================");
		System.out.println("A parte inteira do número digitado é: " + i);
		System.out.println("A parte fracionaria do número digitado é: " + f);
		System.out.println("A parte arredondada do número digitado é: " + a); }
	}


