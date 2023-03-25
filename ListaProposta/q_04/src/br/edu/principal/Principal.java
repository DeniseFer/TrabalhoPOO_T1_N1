package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double nota1 = 0.0;
		double nota2 = 0.0;
		double pond = 0.0;
		
		System.out.println("Digite sua primeira nota: ");
		nota1=sc.nextDouble();
		
		System.out.println("Digite sua segunda nota: ");
		nota2=sc.nextDouble();
		
		pond = (nota1*2 + nota2*3) / 5;
		
		System.out.println("===========RESULTADOS============");
		System.out.println ("A media ponderada da primeira nota ("+nota1+") e da segunda nota ("+nota2+") é igual a :"+ new DecimalFormat(".##").format(pond));
		}

}
