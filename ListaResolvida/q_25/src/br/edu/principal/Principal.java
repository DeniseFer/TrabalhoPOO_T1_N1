package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		

		double custo;
		double convite;
		double qtd;
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("==========QUANTOS CONVITES VOCÊ DEVERÁ VENDER EM SUA PEÇA? DESCUBRA========");
		
		System.out.println("Digite o custo da produção de um espetáculo teatral:\n");
		custo = sc.nextDouble();
		System.out.println("Digite o preço do convite desse espetáculo:\n");
		convite = sc.nextDouble();
		
		qtd = custo/convite;
		
		System.out.println("A quantidade mínima de convites que deve ser vendida é de " + Math.round(qtd)+ " convites");
		
		
	}

}
