package EjerciciosCadenas;

import java.util.Scanner;

public class Longitud
{

	public static void main(String[] args)
	{
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una frase: ");
		frase = teclado.nextLine();
		System.out.println(frase);
		teclado.close();
		
		
		System.out.println(longitudCadena(frase));
		System.out.println(longitudCadenaPegada(frase));
		
	}
	public static int longitudCadena(String cad) {
		int longitud = cad.length();
		return longitud;
		
	}
	public static int longitudCadenaPegada(String cad) {
		cad = cad.replace(" ", "");
		int longitud = cad.length();
		return longitud;
		
	}
}
