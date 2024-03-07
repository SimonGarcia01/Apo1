package ui;
import java.util.Scanner;

public class Terreno {
	public static void main (String[] args) {
		Scanner sk = new Scanner(System.in);
		
		System.out.print("Ingrese el perimetro del lindero: ");
		int perimeter = sk.nextInt();
		
		calcBaseArea(perimeter);
		
	}
	public static void calcBaseArea(int perimeter){
		int length = (perimeter-12)/4;
		int base = length + 6;
		int area = base*length;
		System.out.println("La altura del lindero: " + length + "\nEl area del lindero: " + area);
		
	}
}
