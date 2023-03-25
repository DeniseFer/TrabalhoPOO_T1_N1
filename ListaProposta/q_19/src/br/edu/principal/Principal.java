package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		//19 - WALTZ DE POTENCIA
		
		System.out.println("Digite a altura do comodo desejado: ");
		double altura = sc.nextDouble();
		
		System.out.println("Digite a largura do comodo desejado: ");
		double largura = sc.nextDouble();
		
		if (altura <= 0 && largura <= 0){
			System.out.println("Os numeros precisam ser maiores que 0"); 
			}
		else{
		 double area = altura*largura;
		 double potencia = area*18;
		 
		 System.out.println("A area desse comodo e: "+new DecimalFormat(".##").format(area)+" m² ");
		 System.out.println("Serao necessarios "+new DecimalFormat(".##").format(potencia)+" Waltz de iluminacao.");
		 }

	}

}
