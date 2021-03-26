package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese valor de venta:......: ");
		float n1 = sc.nextFloat();
		
		float incre42 = (float)  (n1 * 0.42) + n1;
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("Incremento en un 42% :........."+ df.format(incre42));
	}

}