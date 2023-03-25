package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int hora;
		int minutos;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======CONVERSÃO HORA, MINUTOS E SEGUNDOS=====");
		
		System.out.println("Digite a hora:\n");
		hora = sc.nextInt();
		System.out.println("Digite os minutos:\n");
		minutos = sc.nextInt();
		
		int horaConvMin = hora * 60;
		int minutoTotal = horaConvMin + minutos;
		int minConvSeg = minutos * 60;
		
		System.out.println("A hora digitada convertida em minutos equivale a "+ horaConvMin + " minutos");
		System.out.println("Os minutos digitados convertidos em segundos equivalem a " + minConvSeg +" segundos");
		System.out.println("O total de minutos é: " + minutoTotal);
	
		
	}

}
