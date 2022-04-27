package prueba1;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorUno;
		int valorDos;
		int valorFinal;
		
		System.out.println("Introduzca el primer numero:");
		valorUno=sc.nextInt();
		
		System.out.println("Introduzca el segundo numero:");
		valorDos= sc.nextInt();
		
		valorFinal = valorUno + valorDos;
		
		System.out.println("El resultado de la suma es: " + valorFinal);

	}

}
