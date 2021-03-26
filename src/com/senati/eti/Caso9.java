package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n=========== Rectangulo ==========");
		
		System.out.print("Ingrese Base......: ");
		int base = sc.nextInt();
		
		System.out.print("Ingrese Altura......: ");
		int altura = sc.nextInt();
		
		float area = base * altura;
		float perimetro = (base + altura) * 2;
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("El area del Rectangulo es :........"+ area);
		System.out.println("El perimetro del Rectangulo es....."+ perimetro);

	}

}