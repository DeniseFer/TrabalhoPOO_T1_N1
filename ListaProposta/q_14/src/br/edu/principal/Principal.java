package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//14 - A IDADE EM MESES, DIAS, SEMANAS
		
		System.out.println("Digite seu ano de nascimento: ");
		int anoNasc= sc.nextInt();
		
		System.out.println("Digite o ano atual em que está: ");
		int anoAtual= sc.nextInt();
		
		int idade= anoAtual - anoNasc;
		int idadeMeses= idade*12;
		int idadeDias = idade*365;
		int idadeSemanas= idade*52;
		
		System.out.println("=============================================");
		System.out.println("A sua idade atual em meses é: "+ idadeMeses);
		System.out.println("A sua idade atual em dias é: "+ idadeDias);
		System.out.println("A sua idade atual em semanas é: "+idadeSemanas);
	}

}
