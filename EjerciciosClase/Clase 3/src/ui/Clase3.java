package ui;
import java.util.Scanner;

public class Clase3 {
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Convertir un numero dado en sec en su correspondiente minutos y segundos");
		System.out.println("Ingrese los segundos:");
		int sec = lector.nextInt();
		int min = sec/60;
		sec = sec%60;
		System.out.println("Minutos: " + min + " Segundos: " + sec);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Leer un sueldo y aumentarle el 5%");
		System.out.println("Ingrese el sueldo:");
		double salary = lector.nextDouble();
		salary = salary*(1.05);
		System.out.println("El nuevo salario es: " + salary);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Un maestro necesita conocer el % de hombres y mujeres en su curso:\nIngrese el numero de hombres: ");
		double men = lector.nextDouble();
		System.out.println("Ingrese el numero de mujeres:");
		double women = lector.nextDouble();
		men = (men/(men + women))*100;
		women = (women/(men + women))*100;
		System.out.println("% de hombres: " + men + "\n% de mujeres: " + women);
		
		System.out.println("------------------------------------------------------");
		
		System.out.println("Usted acaba de ganarse un descuento en la compra de su celular. Cuanto debe pagar?\nIngrese el valor del telefono: ");
		double phonePrice = lector.nextDouble();
		System.out.println("Ingrese el porcentaje del descuento");
		double discount = lector.nextDouble();
		discount = discount/100;
		System.out.println("Por el telefono debe pagar: " + (phonePrice*(1-discount)));

		System.out.println("------------------------------------------------------");

		
		System.out.println("Dado un numero de millas convertir en kilometros:\nIngrese el numero de millas: ");
		double miles = lector.nextDouble();
		System.out.println("En kilometros: " + (miles*1.6));

		System.out.println("------------------------------------------------------");

		System.out.println("Dada una cadena de 5 caracteres, muestrala al reves.\nIngrese la cadena de 5 caracteres: ");
		lector.nextLine();
		String string = lector.nextLine();
		System.out.println("El string en reversa: " + string.charAt(4) + string.charAt(3) + string.charAt(2) + string.charAt(1) + string.charAt(0));
	}
}
