package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Faça um programa que receba a medida do ângulo formado por uma escada apoiada no chão e a distância que a escada está da parede. Calcule e mostre a medida da escada para que se possa alcançar a ponta da escada.
      
		double ang;
		double distan;
		double escada;
		double radiano;
	    Scanner sc = new Scanner(System.in);
		
	    
	    System.out.println("=====CÁLCULO DA MEDIDA DE UMA ESCADA=====");
	    
		System.out.println("Digite aqui o ângulo entre a escada e o chão:\n");
		ang = sc.nextDouble();
		
		System.out.println("Digite aqui o valor da distância da escada até a parede (em metros):\n");
		distan = sc.nextDouble();
		
		radiano = ang * 3.14 /180;
		escada = distan / Math.cos(radiano);
		
		System.out.println("A medida da escada é igual a " + new DecimalFormat(".##").format(escada) + "m");
		
		
		
		
	}

}
