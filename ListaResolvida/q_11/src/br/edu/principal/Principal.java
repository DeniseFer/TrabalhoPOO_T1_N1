package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número positivo e maior que 0:\n ");
		double num = sc.nextDouble();
		
		if (num <= 0) {
		System.out.println("O número precisa ser maior que 0 e positivo");} 
		else {
		double quad = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		double r2 = Math.sqrt(num); //Calcula a raíz quadrada do número digitado
		double r3 = Math.cbrt(num); //Calcula a raíz cubica do número digitado pelo usuário
		
		System.out.println("================");
		System.out.println("===RESULTADOS===");
		System.out.println("=================\n");
		
		System.out.println(num +" ao quadrado é: " + quad );
		System.out.println("------------");
		System.out.println(num +" ao cubo é: " + cubo );
		System.out.println("------------");
		System.out.println("A raíz quadrada de " + num +" é, aproximadamente: " + new DecimalFormat(".##").format(r2) );
		System.out.println("------------");
		System.out.println("A raíz cubica de " + num +" é, aproximadamente: " + new DecimalFormat(".##").format(r3) );
		System.out.println("------------");
		
		}}}

	


