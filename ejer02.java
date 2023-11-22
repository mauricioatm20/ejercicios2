package com.CursoJava.Introduccion.Ejercicios3;

import java.util.Scanner;

public class ejer02 {
/*Se solicitará al usuario que ingrese números reales para procesar. Luego de ingresar cada
número, se le preguntará si quiere ingresar más o no, leyendo el carácter ‘s’ o ‘n’. Cuando 
indique que no ingresa más números, Mostrar la cantidad de valores ingresados, el primer 
valor, el último, el mayor y el menor.*/
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int mayor = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int cantidadValor = 0;
		int primerValor = 0;
		int ultimoValor =0;
		
		char respuesta = 's';
		
		while (respuesta == 's')  {
			System.out.println("ingrese numeros");
			int numero = teclado.nextInt();
			
			
			 if (cantidadValor == 0) {
				 primerValor = numero;
				 
			 }
			
			 ultimoValor = numero;	// realiza un seguimiento del último valor ingresado por el usuario y mostrarlo en la salida del programa. 
			 cantidadValor++;	//incrementa el valor de la variable en 1 unidad.
				 
			 if (numero > mayor) {
		        	mayor = numero;
			 }
			 
			 if (numero < menor) {
		        	menor = numero;
			 }
			 
		do  {
			System.out.print("¿Deseas ingresar más números? (s/n): ");
            respuesta = teclado.next().charAt(0);	//toma la primera letra o carácter de la cadena ingresada por el usuario y lo almacena como un carácter en una variable
            
               
               }while (respuesta != 's'  && respuesta != 'n');
		
		}
		System.out.println("el numero mayor es : " + mayor);
		System.out.println("el numero menor es : " + menor);
		System.out.println("el primer valor es : " + primerValor);
		System.out.println("el ultimo valor es : " + ultimoValor);
		System.out.println("cantidad valores : " + cantidadValor);
	}

}
