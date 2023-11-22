package com.CursoJava.Introduccion.Ejercicios3;

import java.util.Random;
import java.util.Scanner;

public class ejer04 {
/*Realizar un programa que adivine el número (entre 0 y 100) que ha pensado el usuario. En 
cada paso, el programa propone un número y el usuario debe contestar, introduciendo su 
contestación como dato, si ha acertado, o bien si el número que ha propuesto el 
ordenador es mayor o es menor que el que tenía pensado. Por ejemplo, ingresando:
0 –> Acierto
1 –> El valor propuesto es mayor
-1 –> El valor propuesto es Menor*/
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		int min=0;
		int max =100;
		
		int intento;
		
		System.out.println("piensa un numero he intentare adivinarlo");
		
		
		do {
			intento = (min + max)/2; 
			System.out.println("el numero es " + intento);
			System.out.println("0:acierto , 1: el valor es mayor,  -1:el valor es menor");
			int numero=teclado.nextInt();
			
			if(numero == 0) {
				System.out.println("acierto");
				break;
				
			}
			else if(numero == 1)  {
				min = intento + 1;
				
			} else if (numero == -1){
				max = intento - 1;
			}
			
			
		}while (true);
		
	}

}
