package com.senati.eti;

import java.util.Scanner;

public class Caso10 {
 //df.format()
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n=========== Circulo ==========");
		
		System.out.print("Ingrese Radio......: ");
		int radio = sc.nextInt();
		
		float area = (float) (3.1416 * (radio * radio)) ;
		float perimetro = (float) ((2 * 3.1416) * radio) ;
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("El area del Cirsculo es :......."+ area);
		System.out.println("El perimetro del Circulo es....."+ perimetro);

	}

}