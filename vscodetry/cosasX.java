import java.util.Scanner;

public class cosasX {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        int vote = 0;
        boolean checkSk = false;
        
        do{

            vote = menu(sk);

            if(!(vote==1||vote==2||vote==3||vote==4||vote==5||vote==6)){
                System.out.print("El valor debe ser del 1 - 6. Intente de nuevo.");
                checkSk = true;
            } else{
                checkSk = false;
            }


        }while(checkSk);

        System.out.print(vote);
    }
    
    public static int menu(Scanner sk) {
        System.out.print("\nIngrese su voto:\n\t1. El chico y la garza\n\t2. Elemental");
        System.out.print("\n\t3. Robot Dreams\n\t5. Spider-Man: Cruzando el Multiverso");
        System.out.println("\nSi desea salir la ultima opcion:\n\t6. Terminar las votaciones");
        System.out.print("Su voto: ");

        return sk.nextInt();
    }
}
