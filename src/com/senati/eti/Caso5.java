package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número......: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese número......: ");
		int n2 = sc.nextInt();
		
		float promedio = (n1 + n2) / 2;
		float suma20 = (float) (n1 + (n1 * 0.20));
		float suma30 = (float) (n2 - (n2 * 0.30));
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("Resultado 1....."+ promedio);
		System.out.println("Resultado 2....."+ suma20);
		System.out.println("Resultado 3....."+ suma30);

	}

}