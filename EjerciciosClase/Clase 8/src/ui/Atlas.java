package ui;

import java.util.Scanner;

public class Atlas{
	public static void main(String[] args) {
		Scanner sk = new Scanner(System.in);
		final double NIGHT = 200000.0;
		final double DISCT_NIGHT = 0.10;
		final double BUS_COST = 100000.0;
		final double AIRP_COST = 300000.0;
		final double VIP_PERCNT = 0.30;
		final double SERVICE_PERCNT = 0.20;
		
		//Getting the right input for the nights the user wants ----------------------------------------------
		System.out.print("Ingrese los dias de estadia deseados (1 - 3): ");
		int daysStay = sk.nextInt();
		
		while (daysStay > 3 ||  daysStay <= 0) {
			System.out.println("El numero de noches debe ser mayor a 0 y menor a 3");
			System.out.print("Ingrese los dias de estadia deseados (1 - 3): ");
			daysStay = sk.nextInt();
		}
		
		//Calculating the transportation cost-------------------------------------------------------------
		System.out.print("Ingrese el tipo de transporte que desea (bus/avion): ");
		sk.nextLine();
		String busOrAirp = sk.nextLine();
		
		while (!busOrAirp.equalsIgnoreCase("bus") && !busOrAirp.equalsIgnoreCase("avion")) {
			System.out.println("Los unicos metodos de transporte son: Bus o Avion. ");
			System.out.print("Ingrese el tipo de transporte que desea (bus/avion): ");
			busOrAirp = sk.nextLine();
		}
		
		System.out.print("Ingrese si desea un vuelo de ida (1) o ida y devuelta (2): ");
		int numTrip = sk.nextInt();
		
		while (numTrip != 1 && numTrip != 2) {
			System.out.println("La entrada debe ser el numero 1 o 2.");
			System.out.print("Ingrese si desea un vuelo de ida (1) o ida y devuelta (2): ");
			numTrip = sk.nextInt();
		}
		
		//Input for the VIP fee---------------------------------------------------------------
		System.out.print("Desea agregar un paquete VIP? (Si/No): ");
		sk.nextLine();
		String vipPack = sk.nextLine();
		
		
		//Generating the bill
		generateBill(daysStay, NIGHT, DISCT_NIGHT, busOrAirp, numTrip, BUS_COST,AIRP_COST, vipPack, VIP_PERCNT, SERVICE_PERCNT);
		
	}
	
	public static String lodgingMessage(int daysStay, double nightCost, double disc3Nights) {
		double stayCost = daysStay*nightCost;
		double discount = 0;
		String textNights = " ";
		
		discount = daysStay == 3 ? stayCost*disc3Nights: 0;
		
		stayCost = daysStay == 3 ? stayCost - discount : stayCost;
		
	textNights = "Noches vendidas ..... " + daysStay + "\nValor Noche ..... $"+ nightCost +"\nDescuento ..... -$" + discount + "\nTotal Alojamiento ..... $" + stayCost;
		
		return textNights;
	}
	
	public static double calcLodging(int daysStay, double nightCost, double disc3Nights) {
		double stayCost = daysStay*nightCost;
		double discount = 0;
		
		discount = daysStay == 3 ? stayCost*disc3Nights: 0;
		
		stayCost = stayCost - discount;
		
		return stayCost;
	}
	
	public static double calctransportation(String vehicleType, int tripType, double busCost, 
	double airpCost) {
		double transpCost = 0;
		
		if (vehicleType.equalsIgnoreCase("bus")) {
			transpCost = busCost;
		} else {
			transpCost = airpCost;
		}
		
		if (tripType == 2) {
			transpCost = transpCost*2;
		} else {
			transpCost = transpCost;
		}
		
		return transpCost;
	}
	
	public static void generateBill(int daysStay, double nightCost, double disc3Nights, 
	String vehicleType, int tripType, double busCost, double airpCost, String vipPack, 
	double vipCost, double serviceCost) {
		
		//Calculating the lodging costs
		String stayMessage = lodgingMessage(daysStay, nightCost, disc3Nights);
		
		//Calculating the transportation cost
		double transportTotalCost = calctransportation(vehicleType, tripType, busCost, airpCost);
		
		String tripTypeMessage = " ";
		
		if (tripType == 1) {
			tripTypeMessage = "Ida";
		} else {
			tripTypeMessage = "Ida/Vuelta";
		}
		
		//Calculating vipCost
		double preVIPcost = transportTotalCost + calcLodging(daysStay, nightCost, disc3Nights);
		double vipCostAlone = preVIPcost*vipCost;
		
		preVIPcost = vipPack.equalsIgnoreCase("si") ? preVIPcost = preVIPcost + vipCostAlone: preVIPcost;
		
		//Adding the service fee
		double serviceFeeAlone = preVIPcost*serviceCost;
		
		double totalCost = preVIPcost + serviceFeeAlone;
		
		//Printing everything out
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Eventos atlas\nFactura de venta");
		System.out.println("\n\n" + stayMessage);
		System.out.println("\n\nTransporte\nTipo ..... " + tripTypeMessage + "\nMedio ..... " + vehicleType + "\nTotal Transporte ..... $" + transportTotalCost);
		
		if (vipPack.equalsIgnoreCase("si")) {
			System.out.println("\n\nVIP ..... $" + vipCostAlone);
		}
		
		System.out.println("\n\nServicio ..... $" + serviceFeeAlone);
		System.out.println("\n\nTotal a Pagar ..... $" + totalCost + "\n\n¡Gracias por preferirnos!");
		System.out.println("-------------------------------------------------------------------------");
	}
}
