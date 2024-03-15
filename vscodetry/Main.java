

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sk = new Scanner(System.in);

        int valor = menu(sk);

        sk.close();
    }

    public static int menu(Scanner sk){

        System.out.println("Ingrese lo que desea hacer en el menu: ");
        System.out.println("\t1 - Registrar un gasto\n\t2 - Ver total de gastos por un usuario\n\t3 - Ver gasto promedio de todos los usuarios\n\t4 - Salir\nIngrese el valor: ");
        int functionValue = sk.nextInt();
        sk.nextLine();
        return functionValue;
    }
}
