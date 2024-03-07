package ui;

import java.util.Scanner;

public class MotorcyclePrice {
	public static void main(String[] args){
		Scanner sk = new Scanner(System.in);
		
		System.out.print("Ingrese la marca de la moto (Honda/Yamaha/Susuki/Otra): ");
		String motorBrand = sk.nextLine();
		System.out.print("Ingrese el valor original de la moto: ");
		double originalPrice = sk.nextDouble();
		double discount;
		
		discount = motorBrand.equalsIgnoreCase("honda")? 0.05: (motorBrand.equalsIgnoreCase("yamaha")? 
		0.08:(motorBrand.equalsIgnoreCase("susuki")? 0.1:0.02));
		
		double price = (1- discount)*originalPrice;
		discount = discount*originalPrice;
		
		System.out.printf("La moto valia: %.2f\nEl descuento: %.2f\nEl precio a pagar: %.2f",originalPrice,
		discount,price);
	}
}
