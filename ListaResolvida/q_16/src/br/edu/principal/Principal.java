package br.edu.principal;


import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int horas_t;
		double vlr_sal_min;
		double vlr_hora_t;
		double vlr_sal_bru;
		double vlr_sal_liq;
		double imp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu número de horas trabalhadas:\n");
		horas_t = sc.nextInt();
		System.out.println("Digite o valor de seu salário mínimo:\n");
		vlr_sal_min = sc.nextFloat();
		
		// Valor da hora trabalhada
		vlr_hora_t = vlr_sal_min/2;
		// Salário bruto
		vlr_sal_bru = horas_t * vlr_hora_t;
		// Imposto
		imp = vlr_sal_bru * 3/100;
		// Valor a receber
		vlr_sal_liq = vlr_sal_bru - imp;
		
		System.out.println("O valor do seu salário líquido é de R$" + vlr_sal_liq );
		

	}

}
