package ui;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);

        boolean keepGoing = true;

        do{
            int option = menu(sk);
            
            switch(option) {
                case 1:
                    enter();
                    break;
                
                case 2:
                    eliminate();;
                    break;
                
                case 3:
                    int x =count();
                    System.out.print(x);
                    break;
                
                case 4:
                    keepGoing = exit();
                    break;
                
                default:
                System.out.print("El valor ingresado no es valido");
                
            }
            
        }while(keepGoing);

        sk.close();

    }

    public static int menu(Scanner sk){

        System.out.println("Ingrese lo que desea hacer en el menu: ");
        System.out.println("1 - Ingresar\n2 - Eliminar\n3 - Contar\n4 - Salir\nIngrese el valor: ");
        int functionValue = sk.nextInt();
        sk.nextLine();
        return functionValue;
    }

    public static void enter(){
        System.out.print("Se imprime alguna vaina");
    }

    public static void eliminate(){
        System.out.print("Elimine algo mas");
    }

    public static int count() {
        int value = 30;
        return value;
    }

    public static boolean exit(){
        return false;
    }
}
