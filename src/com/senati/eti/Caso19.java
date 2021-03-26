package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("\n=========== Tri�ngulo ==========");
		
		System.out.print("Ingrese Lado 1......: ");
		float l1 = sc.nextFloat();
		
		System.out.print("Ingrese Lado 2......: ");
		float l2 = sc.nextFloat();
		
		System.out.print("Ingrese Lado 3......: ");
		float l3 = sc.nextFloat();
		
		float perimetro = l1 * l2 * l3;
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("El perimetro del Triangulo es :........"+ df.format(perimetro));
	}

}