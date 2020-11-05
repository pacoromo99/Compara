package es.studium.Compara;

import java.util.Scanner;

public class Compara 
{

	public static void main(String[] args) 
	{
		int num1, num2; //declaro variables
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame un numero entero");
		num1 = teclado.nextInt(); //leo variable num1
		System.out.println("Dame otro numero entero");
		num2 = teclado.nextInt(); //leo variable num2
		
		if (num1 > num2)
		{
			System.out.println("num1 es mayor que num2");
		}
		
		else 
		{
		
			if (num1 < num2) 
			{
				System.out.println("num1 es menor que num2");
			}
			else 
			{
				System.out.println("num1 es igual que num2");
			}
		}
	}
}
