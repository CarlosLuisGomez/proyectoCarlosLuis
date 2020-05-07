package com.mipaqueteMaven.proyectoCarlosLuis;

public class CalculosMatematicos {
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}


	public static int metodoNuevo() {
		return 9;
	}

	public static String cadena1() {
		return "Esta es la cadena de la rama SegundaRama";
	}
	
/*
Aqui está el código que ha añadido Jose Yague despues de un merge
de su rama
*/


	public static int minimo(int a, int b, int c) {
		//comentario para GIT
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		return min;

	}

	public static double dividePor(int numerador, int numero) {
		return (double) numerador / (double) numero;
	}
	public static int metodoCinco() {
		return 5;
	}
	public static int potencia(int base, int exponente) {

		int resul = 1;
		if (exponente > 0)
			resul = base * potencia(base, exponente - 1);
		return resul;
	}

	public static boolean esPrimo(int numero) {

		boolean primo = true;
		int divisor = 3;
		if (numero != 2 && numero % 2 == 0)
			primo = false;
		while (primo && divisor < numero / 2) {
			if (numero % divisor == 0)
				primo = false;
			divisor += 2;
		}
		return primo;
	}
	
	public static boolean noesPrimo(int numero) {
		return !esPrimo(numero);
	}
	
	public double numeroPi() {
		return Math.PI;
	}

	public static double notaFinal(double inicial, double teoria, double problemas) {

		if (inicial < 5) {
			return inicial;
		} else if (teoria < 4 || problemas < 4) {
			return 4;
		} else
			return (teoria + problemas) / 2;

	}

}
