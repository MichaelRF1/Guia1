package com.senati.eti;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Numero de aprobados.....: ");
		int na = sc.nextInt();
		
		System.out.print("Numero de desaprobados.....: ");
		int nd = sc.nextInt();
		
		System.out.print("Numero de retirados.....: ");
		int nr = sc.nextInt();
		
		float total = na + nd + nr;
		
		float pa = na / total * 100;
		float pd = nd / total * 100;
		float pr = nr / total * 100;
		
		System.out.println("\n=========== Resultados ==========");
		System.out.println("Porcentaje de aprobados....." + df.format(pa) + "%");
		System.out.println("Porcentaje de desaprobados....." + df.format(pd) + "%");
		System.out.println("Porcentaje de aprobados....." + df.format(pr) + "%");
		

	}

}