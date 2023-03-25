package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// LISTA PROPOSTA
		float vlr_sal;
		float vlr_conta1;
		float vlr_conta2;
		double vlr_sal_final;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==================================================================");
		System.out.println("= Bem- vindo, João!! Soubemos que você tem duas contas atrasadas.=\n= Descubra aqui o que restará de seu salário após pagá-las.      =");
		System.out.println("==================================================================\n");
		
		
		System.out.println("Digite aqui o valor de seu salário:\n");
		vlr_sal = sc.nextFloat();
		
		System.out.println("Digite aqui o valor de sua primeira conta atrasada:\n");
		vlr_conta1 = sc.nextFloat();
		
		System.out.println("Digite aqui o valor de sua segunda conta atrasada:\n");
		vlr_conta2 = sc.nextFloat();
		
		//Multa de 2% sobre cada conta
		vlr_conta1 = vlr_conta1 + vlr_conta1 * 2/100;
		vlr_conta2 = vlr_conta2 + vlr_conta2 * 2/100;
		
		//O que resta do salário
		vlr_sal_final = vlr_sal - (vlr_conta1 + vlr_conta2);
		
		System.out.println("O valor que restará de seu salário será de R$"+ new DecimalFormat(".##").format(vlr_sal_final));

	}

}
