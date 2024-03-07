package ui;
import java.util.Scanner;

public class Intereses {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        System.out.print("Ingrese el valor del capital:");
        double plata = lector.nextDouble();
        lector.nextLine();
        System.out.print("Ingrese el dia:");
        double dia = lector.nextDouble();
        lector.nextLine();
        dia = (360-dia)/30;
        System.out.print("Ingrese el interes:");
        double interes = lector.nextDouble();
        lector.nextLine();
        interes = interes/100;
        System.out.println("Datos ingresados\n Valor: " + plata +  "\n Meses: " + dia + "\n interes: " + interes);
        double interesTotal = plata*interes*dia;
        System.out.print("El interes total causado: " + interesTotal);
    }
}
