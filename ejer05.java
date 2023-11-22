package com.CursoJava.Introduccion.Ejercicios3;

import java.util.Scanner;

public class ejer05 {
/*Escribir un programa que pida al usuario un número, que representará una cantidad de 
dinero expresada en euros. A continuación, el programa le ofrecerá un menú al usuario en 
el que le preguntará a qué divisa quiere convertir del dinero e imprimirá la conversión. Las 
posibles divisas son las siguientes (se indica el tipo de cambio): 
• Dólares (1 dólar = 0,88 euros) 
• Libra Esterlina (1 Libra = 1,20 euros) 
• Yen (1 yen = 0,0077 euros). 
• Dólares Canadienses (1 dólar C. = 0,71 euros)*/
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("seleccionar tipo de cambio \n1:dolar  \n2:libras  \n3:yen  \n4:dolares canadienses");
		String tipo = teclado.nextLine();
		System.out.println("Introducir cantidad de dinero");		
		int euros = teclado.nextInt();
		
		double resultado;
		
		switch(tipo){
		case "1":
			
			resultado = euros * 0.88;
			System.out.println(resultado);
			break;
			
		case "2":
			resultado = euros * 1.20;
			System.out.println(resultado);
			break;
		
		case "3":
			resultado = euros * 0.0077;
			System.out.println(resultado);
			break;
		case "4":
			resultado = euros * 0.71;
			System.out.println(resultado);
			break;
			
		}
	}

}
