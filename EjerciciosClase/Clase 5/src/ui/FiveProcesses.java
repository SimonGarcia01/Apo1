package ui;

import java.util.Scanner;

public class FiveProcesses {
	public static void main(String[] args) {
	Scanner sk = new Scanner(System.in);
	System.out.print("Ingrese el primer numero: ");
	int num1 = sk.nextInt();
	System.out.print("Ingrese el segundo numero: ");
	int num2 = sk.nextInt();
	System.out.print("Ingrese el tercer numero: ");
	int num3 = sk.nextInt();
	System.out.print("Ingrese el cuarto numero: ");
	int num4 = sk.nextInt();
	System.out.print("Ingrese el quinto numero: ");
	int num5 = sk.nextInt();
	
	mean(num1, num2, num3, num4, num5);
	
	divisible10(num1, num2, num3, num4, num5);
	
	exist5(num1, num2, num3, num4, num5);
	
	maximum(num1, num2, num3, num4, num5);
	}
	
	/*
	Input: num1, num2, num3, num4, num5
	Output: prints the mean of the 5 numbers
	Process: All the iputs are added together and then divided by 5
	*/
	public static void mean(int num1, int num2, int num3, int num4, int num5) {
		System.out.println("El promedio de los numeros es: " + ((num1 + num2 + num3 + num4 + num5)/5));
	}
	/*
	/*
	Input: num1, num2, num3, num4, num5
	Output: Verifies if every number is divisible by 10 (True/False)
	Process: All the iputs %10 and then verify if its == to 0
	*/
	public static void divisible10 (int num1, int num2, int num3, int num4, int num5) {
		int num1Try = num1%10==0 ? 1: 0;
		int num2Try = num2%10==0 ? 1: 0;
		int num3Try = num3%10==0 ? 1: 0;
		int num4Try = num4%10==0 ? 1: 0;
		int num5Try = num5%10==0 ? 1: 0;
		System.out.println("Cantidad de numeros divisibles por 10: " + (num1Try+num2Try+num3Try+num4Try+
		num5Try));
	}
		/*
	Input: num1, num2, num3, num4, num5
	Output: Shows if at least one of the numbers is divisible by 5
	Process: do a logical test using || seeing if any number %5 == 0
	*/
	public static void exist5(int num1, int num2, int num3, int num4, int num5) {
		boolean divisible5 = (num1%5==0 || num2%5==0 || num3%5==0 || num4%5==0 || num5%5==0);
		System.out.println("Algun numero es divisible por 5: " + divisible5);
	}
		/*
	Input: num1, num2, num3, num4, num5
	Output: prints the largest number
	Process: every number is compared to each other if its < using &&, if its not, then go to
	the next number. If num1, num2, num3, num4 are not the biggest of all the inputs, then
	num5 is selected.
	*/
	public static void maximum(int num1, int num2, int num3, int num4, int num5) {
		int biggest = (num1 > num2 && num1 > num3 && num1 > num4 && num1> num5 ? num1 : 
		(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 ? num2 :
		(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 ? num3 : 
		(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 ? num4 : num5))));
		
		System.out.println("El numero mas grande: " + biggest);
	}
	
}

