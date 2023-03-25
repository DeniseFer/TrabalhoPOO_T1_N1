package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
				
		double cateto1 = 0.0;
		double cateto2 = 0.0;
		double hipotenusa = 0.0;

		Scanner sc= new Scanner(System.in);
        
		System.out.println("======CÁLCULO DE HIPOTENUSA======\n");
		System.out.println("Digite o valor do primeiro cateto: ");
		cateto1 = sc.nextDouble();
		System.out.println("Digite o valor do segundo cateto: ");
		cateto2 = sc.nextDouble();

		hipotenusa= Math.pow(cateto1,2 ) + Math.pow(cateto2, 2);
		hipotenusa = Math.sqrt(hipotenusa);

		System.out.println("============================");
		System.out.println("===RESULTADO DA HIPOTENUSA===");
		System.out.println("============================");

		System.out.println("A hipotenusa desse triângulo retângulo terá: "+ new DecimalFormat (".##").format( hipotenusa));
			}

		}

	
