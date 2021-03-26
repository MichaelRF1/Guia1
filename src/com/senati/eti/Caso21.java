package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese valor de gasto:......: ");
		float n1 = sc.nextFloat();
		
		float dismin12 =  n1 - (float) (n1 * 0.12);
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("Disminución en un 12% :........."+ df.format(dismin12));
	}

}