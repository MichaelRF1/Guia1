package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer numero .....: ");
		n1 = sc.nextFloat();
		
		System.out.print("Segundo numero ....: ");
		n2 = sc.nextFloat();
		
		float suma = n1 + n2;
		float resta = n1 - n2;
		float producto = n1 * n2;
		float division = n1 / n2;
		float resto = n1 % n2;
		
		System.out.println("======Valores Ingresados=======");
		System.out.println("Suma............: " + suma);
		System.out.println("Resta...........: " + resta);
		System.out.println("Producto........: " + producto);
		System.out.println("Division........: " + division);
		System.out.println("Resto entero....: " + resto);

		
		

	}

}