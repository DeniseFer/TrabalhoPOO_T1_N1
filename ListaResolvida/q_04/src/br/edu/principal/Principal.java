package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		float sal;
		double novosal;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======CÁLCULO DE AUMENTO DE SALÁRIO=====");
		System.out.println("Digite o valor de um salário:\n");
		sal = sc.nextFloat();
		
		novosal = sal + sal * 25/100;
		
		System.out.println("O novo salário agora terá o valor de R$" + new DecimalFormat(".##").format(novosal));
	    

	}

}
