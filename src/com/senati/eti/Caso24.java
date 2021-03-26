package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Monto 1..................: ");
		float m1 = sc.nextFloat();

		System.out.print("Monto 2..................: ");
		float m2 = sc.nextFloat();

		System.out.print("Monto 3..................: ");
		float m3 = sc.nextFloat();
		
		float c1 = (m1 / 5) + (float)(m2 * 0.20) ;
		float c2 = (m3 +(float) (m3 * 0.60)) / 2;
		float suma3 = m1 + m2 + m3;
		float c3 = suma3 -(float) (suma3 * 0.08);
		
		System.out.println("\n=========== Resultados ==========");
		//La quinta parte del primer monto más el 20% del segundo monto.
		System.out.println("Caso 1 :......."+ c1);
		//La mitad del aumento en 60% del tercer monto.
		System.out.println("Caso 2 :......."+ c2);
		//Disminuya en 8% la suma de los tres montos.
		System.out.println("Caso 3 :......."+ c3);
		
			
		

	}

}
