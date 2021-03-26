package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Caso16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas:......: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese tarifa por hora:......: ");
		float n2 = sc.nextFloat();
		
		float sueldo = n1 * n2 ;
		float Bono5 = (float) (sueldo * 0.05);
		float total = sueldo + Bono5;
		float Total_d = (float) (total / 3.24);
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("Sueldo :......."+ sueldo);
		System.out.println("Bono :........."+ df.format(Bono5));
		System.out.println("Total :........."+ total);
		System.out.println("Total en dolares :........."+ df.format(Total_d));

		
	}

}