package ui;

import model.MorganController;

import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MorganUi{
	
	//Create new Scanner with static method so it can be used everywhere
	public static Scanner sk = new Scanner(System.in);
	
	public static void main(String[] args){
		MorganController objMorgan = new MorganController("12345567","Morgancito","El Pirata",200000,500000);
		
		boolean exit = false;
		
		int option = 0;
		
		do{
			option = menu();
			
			switch(option){
				
				case 1: //register client
					addClient(objMorgan);
					break;
				
				case 2: //update ship info
					updateShip(objMorgan);
					break;

				case 3://to search for a client
					searchClient(objMorgan);
					break;
				
				case 9:
					exit = true;
					break;
					
				default:
					System.out.println("Not a valid option");
			}
			
			
		}while(!exit);
	
	}
	
	public static int menu(){
		
		int option = 0;
		System.out.println("-----------------------------------------------------------");
		System.out.println("Menu de opciones: ");
		System.out.println("\t1. Ingresar cliente\n\t2. Actualizar info del barco\n\t3. Buscar un cliente\n\t9. Salir");
		System.out.println("-----------------------------------------------------------");
		System.out.print("Ingrese la opcion: ");
		option = sk.nextInt();
		sk.nextLine();
		return option;
	}
	
	public static void updateShip(MorganController objMorgan){
		int option = 0;
		System.out.println("Informacion que desea cambiar:");
		System.out.println("\t1. Nombre del barco\n\t2. Limite Minimo de peso\n\t3. Limite maximo de peso");
		System.out.print("Ingrese la opcion: ");
		option = sk.nextInt();
		sk.nextLine();

		/*
		Here im setting the existing values as the old inputs so there is not a problem
		while updateInfoShip is setting values because the variables weren't initialized
		before. The only value that would've been initialized was the one that gets
		a new value.
		*/
		String newNameS = objMorgan.getShips().getName();
		double newLimMin = objMorgan.getShips().getLimMin();
		double newLimMax = objMorgan.getShips().getLimMax();
		
		if(option == 1){
			
			System.out.print("Escriba el nuevo nombre del barco: ");
			newNameS = sk.nextLine();
			
		} else if (option == 2){
			
			System.out.print("Ingrese el nuevo limite minimo: ");
			newLimMin = sk.nextDouble();
			
		}else{
			System.out.print("Ingrese el nuevo limite maximo: ");
			newLimMax = sk.nextDouble();
		}
		
		String updateMessage = objMorgan.updateInfoShip(option, newNameS,newLimMin ,newLimMax);
		System.out.println(updateMessage);
	}
	
	public static void addClient(MorganController objMorgan){
		
		System.out.print("Escriba el nombre del cliente: ");
		String nameClient = sk.nextLine();
		
		System.out.print("Escriba el nombre del numero de registro: ");
		String registrationClient = sk.nextLine();
		
		System.out.print("Escriba la fecha de expedicion del registo (dd/mm/aaaa): ");
		//get the date as a string with the format dd/mm/aaaa
		String expirationDateString = sk.nextLine();
		//create a calendar instance so i can then save the time in it
		Calendar expirationDate = Calendar.getInstance();
		//create a simpledateformat to change the String info to date format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//now change the Calendar expiration date using the transformed date format
		try {
			//Had to use parce exception because it said so...
            expirationDate.setTime(sdf.parse(expirationDateString));
        } catch (ParseException e) {
            System.out.println("Formato de fecha incorrecto. Utilice el formato dd/MM/yyyy.");
            return;
        }

		System.out.print("Escriba el nit del cliente: ");
		String nitClient = sk.nextLine();

		System.out.print("Escriba el numero de kilos transportados por el cliente: ");
		double alreadyTransported = sk.nextDouble();

		System.out.print("Escriba el total de pagos hecho por el cliente: ");
		double alreadyPaid = sk.nextDouble();
		
		
		String message = objMorgan.addClient(nameClient, registrationClient, expirationDate, nitClient,
		alreadyTransported, alreadyPaid);
		
		System.out.println(message);
		
	}

	public static void searchClient(MorganController objMorgan){

		System.out.print("Ingrese el nit del cliente de busca: ");
		String nitTry = sk.nextLine();

		boolean nitSearchResult = objMorgan.searchClient(nitTry);

		if(nitSearchResult){
			System.out.println("El cliente con nit " + nitTry +" ya existe.");
		}else{
			System.out.println("El cliente con nit " + nitTry +" no existe.");
		}

	}

}