package ui;

import java.util.Scanner;
import 

public class MorganUi{
	
	//Create new Scanner with static method
	public static Scanner sk = new Scanner(System.in);
	
	public static void main(String[] args){
		Morgancontroller objMorgan = new MorganController("12345567","Morgancito","El Pirata",200000,500000);
		
		boolean exit = false;
		
		int option = 0;
		
		do{
			option = menu();
			
			switch(option){
				
				case 1: //register client
					addClient();
					break;
				
				case 2: //update ship info
					updateShip(Morgancontroller objMorgan);
					break;
				
				case 9:
					exit = true;
					
				default:
					System.out.println("Not a valid option");
			}
			
			
		}while(!exit);
	
	}
	
	public static int menu(){
		
		int option = 0;
		System.out.println("1. Ingresar cliente\n2. Actualizar cliente\n9. Salir");
		option = sk.nextInt();
		sk.nextLine();
		return option;
	}
	
	public static void updateShip(Morgancontroller objMorgan){
		int option = 0;
		System.out.println("Desea cambiar\n\t1. nombre\n\t2. limite min\n\t3. limite max");
		option = sk.nextInt();
		sk.nextLine();
		String newNameS;
		double newLimMin;
		double newLimMax;
		
		if(option == 1){
			
			System.out.print("Escriba el nuevo nombre del barco: ");
			newNameS = sk.nextLine();
			
		} else if (option == 2){
			
			System.out.print("Ingrese el nuevo limite minimo");
			newLimMin = sk.nextDouble();
			
		}else{
			System.out.print("Ingrese el nuevo limite maximo");
			newLimMax = sk.nextDouble();
		}
		
		objMorgan.updateInfoShip(option, newNameS,newLimMin ,newLimMax);
		
	}
	
	public static void addClient(Morgancontroller objMorgan){
		String nameClient;
		String nitClient;
		
		System.out.print("Escriba el nombre del cliente: ");
		nameClient = sk.nextLine();
		
		System.out.print("Escriba el nit del cliente: ");
		nitCliente = sk.nextLine();
		
		String message = objMorgan.addClient(nitClient,nameClient);
		System.out.println(message);
		
	}

}