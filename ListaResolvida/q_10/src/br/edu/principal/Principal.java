package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double area;
		double raio;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======CÁLCULO DA ÁREA DE UM CÍRCULO======\n");
		System.out.println("Digite o valor (em metros) do raio de um círculo:\n");
		raio = sc.nextDouble();
		
		area = 3.14 * Math.pow(raio, 2);
		
		System.out.println("============================");
		System.out.println("A área do círculo é " + new DecimalFormat(".##").format(area) + "m²");
		System.out.println("============================");

	}

}
