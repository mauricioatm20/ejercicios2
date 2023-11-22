package com.CursoJava.Introduccion.Ejercicios3;

import java.util.Random;
import java.util.Scanner;

public class ejer03 {
/*El programa generará un número aleatorio entre 0 y 100 y le pedirá al usuario que lo 
adivine. Cuando el usuario ingrese el número para ver si acertó, el programa le indicará si 
el número a adivinar es mayor, menor o bien si acertó. Cuando acierte, finaliza.*/
	
	
	public static void main(String[] args) {
		Scanner teclado =new Scanner(System.in);
		 Random random = new Random();
		 
		System.out.println("!Adivina el numero¡");
		
		
		
		 int adivinar = random.nextInt(3); // Genera un número aleatorio entre 0 y 100
		 int intentos;
		
		for(int i=1; i<=3; i++) {
			System.out.println("intentos " + i );
			intentos = teclado.nextInt();
			
			if (intentos == adivinar) {
				System.out.println("as acertado ");
				break;
			}
			
			if(intentos < adivinar) {
				System.out.println("el numero es mayor");
			} else {
			
				System.out.println("el numero es menor");
				}
			
		} System.out.println("el numero es " + adivinar);
	}

}
