/**
 * @author Simon Garcia
 * @since 2024-03-15
 */

package ui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sk = new Scanner(System.in);

        boolean continueLoop = true;

        int registrationCounter = 0;

        String[] names = new String[20];
        double[] expenses = new double[20];

        do{

            int option = menu(sk);

            switch(option){
                case 1:
                    
                    if(registrationCounter != 20){
                        registerExpense(sk, names, expenses, registrationCounter);
                        registrationCounter++;
                    }else{
                        System.out.println("El arreglo se ha llenado. No puede ingresar mas.");
                    }

                    break;
                case 2:
                    totalExpense(sk, names, expenses);
                    break;
                case 3:
                    avgExpense(sk, expenses, registrationCounter);
                    break;
                case 4:
                    continueLoop = false;
                    break;
                default:
                    System.out.print("Ingrese un valor valido.");
                    break;
            }



        }while(continueLoop);

        sk.close();
    }

    /**
	 * <p><b>menu</b></p>
	* <b>Description:</b> Prints the menu, takes the option selected and returns the selected option.
	*	
	* <p><b>Preconditions:</b></p>
	* <ul>
	* 	<li> {@code sk} Scanner created before hand.</li>
	* </ul>
	*
	* <p><b>Postconditions:</b></p>
	* <ul>
	* 	<li>After printing the menu it saves the choice in a variable</li>
	* </ul>
	*
	* @param sk Scanner name used in main.

	* @return The option selected by the user.
	*/
    public static int menu(Scanner sk){

        System.out.println("Ingrese lo que desea hacer en el menu: ");
        System.out.print("\t1 - Registrar un gasto\n\t2 - Ver total de gastos por un usuario\n\t3 - Ver gasto promedio de todos los usuarios\n\t4 - Salir\nIngrese el valor: ");
        int choice = sk.nextInt();
        sk.nextLine();
        return choice;
    }

    /**
    * <p><b>registerExpense</b></p>
    * <b>Description:</b> Stores the name and the cost entered inside two different arrays.
    *	
    * <p><b>Preconditions:</b></p>
    * <ul>
    * 	<li> {@code sk} Scanner created before hand.</li>
    * 	<li> {@code names} String[] length 20.</li>
    * 	<li> {@code expenses} double[] length 20.</li>
    * 	<li> {@code position} int between 0 and 19.</li>
    * </ul>
    *
    * <p><b>Postconditions:</b></p>
    * <ul>
    * 	<li>The name is {@code saved} in names and the {@code expense} is saved in expenses in the index {@code position}</li>
    * </ul>
    *
    * @param sk Scanner name used in main.
    * @param names Array that holds 20 names.
    * @param expenses Array that holds 20 expenses.
    * @param position index where the name and expense are saved.
    */
    public static void registerExpense(Scanner sk, String[] names, double[] expenses, 
    int position){

        System.out.print("Ingreso de usuario numero " + (position+1) + ":\n\tIngrese el nombre: ");
        names[position] = sk.nextLine();
        System.out.print("\tIngrese sus gastos: ");
        expenses[position] = sk.nextDouble();
        sk.nextLine();

    }

    /**
	* <p><b>totalExpense</b></p>
	* <b>Description:</b> The inputed name is looped checking for a match in the String[] and
    * when the inputed name matches that number saved in the double[] is added to the total.
    * After, the total is printed.
	*	
	* <p><b>Preconditions:</b></p>
	* <ul>
    * 	<li> {@code sk} Scanner created before hand.</li>
    * 	<li> {@code names} String[] length 20.</li>
    * 	<li> {@code expenses} double[] length 20.</li>
	* </ul>
	*
	* <p><b>Postconditions:</b></p>
	* <ul>
	* 	<li>The calculated expense for the user asked is printed</li>
	* </ul>
	*
    * @param sk Scanner name used in main.
    * @param names Array that holds 20 names.
    * @param expenses Array that holds 20 expenses.
	*/
    public static void totalExpense(Scanner sk, String[] names, double[] expenses){

        System.out.print("Ingrese el nombre del usuario que quiere checkear: ");
        String user = sk.nextLine();
        double total = 0;

        for(int n = 0; n < 20; n++){
            if(names[n] != null && names[n].equalsIgnoreCase(user)){
                total += expenses[n];
            }
        }
        
        System.out.println("El total de " + user + " es de $" + total);

    }

    /**
	 * <p><b>avgExpense</b></p>
	* <b>Description:</b> Calculates and prints the average of all the users in the 
    *expense array.
	*	
	* <p><b>Preconditions:</b></p>
	* <ul>
    * 	<li> {@code sk} Scanner created before hand.</li>
    * 	<li> {@code expenses} double[] length 20.</li>
    * 	<li> {@code position} int between 0 and 19.</li>
	* </ul>
	*
	* <p><b>Postconditions:</b></p>
	* <ul>
	* 	<li>]The total expenses entered in the array ar printed.</li>
	* </ul>
	*
    * @param sk Scanner name used in main.
    * @param expenses Array that holds 20 expenses.
    * @param counter int that holds how many users are in the expenses array.
	*/
    public static void avgExpense(Scanner sk, double[] expenses, int counter){
        double totalExpenses = 0;

        for(int n = 0; n < 20; n++){
            totalExpenses += expenses[n];
        }

        System.out.println("El promedio de gasto de todos los usuarios es: " +
        (totalExpenses/counter));

    }

}
