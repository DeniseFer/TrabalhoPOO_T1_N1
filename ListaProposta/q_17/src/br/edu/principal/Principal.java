package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//LISTA PROPOSTA
		double raio;
		double Comp;
		double Area;
		double Vol;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========CÁLCULO DO VOLUME, ÁREA E COMPRIMENTO DE UMA ESFERA=======");
		
		System.out.println("Digite o valor do raio de uma esfera, em centímentos:\n");
		raio = sc.nextDouble();
		
		Comp = 2 * 3.14 * raio; 
		Area = 3.14 * Math.pow(raio, 2);
		Vol = (4 * 3.14 * Math.pow(raio, 3))/3;
		
		System.out.println("O comprimento da esfera equivale a " + new DecimalFormat(".##").format(Comp) + "cm");
		System.out.println("A área da esfera equivale a " + new DecimalFormat(".##").format(Area) + "cm²");
		System.out.println("O volume da esfera equivale a " + new DecimalFormat(".##").format(Vol) + "cm³");

	}

}
