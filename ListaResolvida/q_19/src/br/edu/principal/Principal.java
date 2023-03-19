package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		double a_degrau;
		double a_usuario;
		double qtd_degraus;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da altura dos degraus(em metros):\n");
		a_degrau = sc.nextDouble();
		System.out.println("Digite o valor da altura que deseja alcançar(em metros):\n");
		a_usuario = sc.nextDouble();
		
		qtd_degraus = a_usuario/a_degrau;
		
		System.out.println("O número de degraus que você deverá subir é de "+ Math.round(qtd_degraus)+" degraus");
		
		
	}

}
