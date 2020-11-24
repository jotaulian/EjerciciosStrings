package EjerciciosCadenas;

import java.util.Scanner;

public class Igualdad
{

	public static void main(String[] args)
	{
		String a1,a2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena");
		a1 = teclado.nextLine();
		System.out.println("Dame otra");
		a2 = teclado.nextLine();
		teclado.close();
		
		if(a1.equalsIgnoreCase(a2)) {
			System.out.println("Las cadenas son iguales");
		} else {
			System.out.println("Las cadenas son diferentes");
		}
	}

}
