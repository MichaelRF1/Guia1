package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre de producto:......: ");
		String pro = sc.nextLine();
		
		System.out.print("Ingrese Precio...................: ");
		float precio = sc.nextFloat();

		System.out.print("Ingrese Cantidad.................: ");
		int cantidad = sc.nextInt();
		
		float importe = cantidad * precio ;
		float igv18 = (float) (importe * 0.18);
		float desc3 = (float) (importe * 0.03);
		float Total = (importe - desc3) + igv18 ;
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("Ingrese nombre de producto :......."+ pro);
		System.out.println("Importe :........."+ df.format(importe));
		System.out.println("IGV 18% :........."+ df.format(igv18));
		System.out.println("Descuento :........."+ (desc3));
		System.out.println("Total :........."+ df.format(Total	));
	
		
	}

}
