package com.CursoJava.Introduccion.Ejercicios3;

import java.util.Scanner;

public class ejer01 {
/*Dados un número indefinido de notas obtenidas por alumnos en sus exámenes, mostrar 
por pantalla la mayor y la menor nota obtenida del grupo. (Cuando el usuario ingrese -1 
finaliza la carga)*/
	
	
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);
		
		
	int mayor = Integer.MIN_VALUE; //Integer.MIN_VALUE es el valor más PEQUEÑO que puede tomar una variable cualquier valor ingresado se convertirá en el nuevo MAXIMO.
	int menor = Integer.MAX_VALUE; //Integer.MAX_VALUE es el valor más GRANDE que puede tomar una variable cualquier valor ingresado se convertirá en el nuevo MINIMO.

		System.out.println("Ingresa las notas de los alumnos (o -1 para finalizar):");
		int nota = teclado.nextInt();
			
		while (true) {
			nota = teclado.nextInt();

        if (nota == -1) {
        	break;
        	}

        if (nota > mayor) {
        	mayor = nota;
        	}

        if (nota < menor) {
        	menor = nota;
        	}
		}

		System.out.println("La mayor nota es: " + mayor);
		System.out.println("La menor nota es: " + menor);
		                
	}
					
}


