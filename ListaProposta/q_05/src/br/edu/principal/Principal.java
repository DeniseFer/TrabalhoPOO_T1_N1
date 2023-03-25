package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// LISTA PROPOSTA
		float preço_prod = 0.0f;
		float novo_preço = 0.0f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====CÁLCULO DO DESCONTO=====");
		System.out.println("Digite o preço de um produto:\n");
		preço_prod = sc.nextFloat();
		
		novo_preço = preço_prod - preço_prod * 10/100;
		System.out.println("O novo preço desse produto é de R$"+ new DecimalFormat(".##").format(novo_preço));

	}

}
