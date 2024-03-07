package ui;
import java.util.Scanner;

public class Clase7 {
	public static void main(String[] args){
		Scanner sk = new Scanner(System.in);
		System.out.print("Ingrese el valor de la compra: ");
		double cost = sk.nextInt();
		discount(cost);
		
		System.out.println("------------------------------------------------");
		
		System.out.print("Ingrese la marca de la moto: ");
		sk.nextLine();
		String motorBrand = sk.nextLine();
		
		System.out.print("Ingrese el precio de la moto: ");
		double motorcost = sk.nextDouble();
		
		motorcycleDiscount(motorBrand, motorcost);
		
	
	}
	public static void discount(double testcost){
		if (testcost > 100000) {
		testcost = testcost*0.75;
		}
		System.out.println("El valor de la compra es de: " + testcost);
	}
	
	public static void motorcycleDiscount(String brand, double firstcost) {
		double discount;
		double realcost;
		
		if (brand.equalsIgnoreCase("Honda")){
			discount = firstcost*0.05;
			realcost = firstcost - discount;
		} else if (brand.equalsIgnoreCase("Yamaha")) {
			discount = firstcost*0.05;
			realcost = firstcost - discount;
		} else if (brand.equalsIgnoreCase("Susuki")){
			discount = firstcost*0.1;
			realcost = firstcost - discount;
		} else {
			discount = firstcost*0.2;
			realcost = firstcost - discount;
		}
		System.out.print("El precio de la moto: " + firstcost + "\nEl descuento: " + discount + 
		"\nEl precio a pagar: " + realcost);
	}
}
