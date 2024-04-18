package ui;

import java.util.Scanner;
import model.University;

public class Main{
    //attributes
    private University controller;
    private Scanner sk;

    /**
    * <p><b>Main</b></p>
    * <b>Description:</b> Constructs a new Main object.
    * This constructor initializes a new Main object by creating instances of the University controller and Scanner for user input.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code None}: No preconditions.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>A new Main object is created with instances of the University controller and Scanner for user input.</li>
    * </ul>
    */
    public Main(){
        controller = new University();
        sk = new Scanner(System.in);
    }

    public static void main(String[] args){

        Main objMain = new Main();

        boolean menuLoop = true;

        do{
            int option = objMain.menu();

            switch (option) {
                case 1:
                    //To register a professor
                    objMain.registerProfessor();
                    break;
                case 2:
                    //To end the program
                    menuLoop = false;
                default:
                    System.out.println("Select one of the available choices.");
                    break;
            }


        }while(menuLoop);

        

    }

    /**
    * <p><b>menu</b></p>
    * <b>Description:</b> Displays a general menu and retrieves the user's choice.
    * After displaying the following options it will take the option  and return it.
    *  <ol>
    *   <li> Register a professor </li>
    *   <li> Exit program </li>
    * </ol>
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The scanner object {@code sk} must be initialized.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The user's choice is returned as an integer.</li>
    * </ul>
    * 
    * @return The user's choice.
    */    
    public int menu(){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("General menu:");
        System.out.println("\t1. Register a professor\n\t2. Exit Program");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.print("Enter the option: ");
        int option = sk.nextInt();
        sk.nextLine();

        return option;
    }

    /**
    * <p><b>registerProfessor</b></p>
    * <b>Description:</b> Registers a professor based on the user's input.
    * This method guides the user through the process of registering a professor by providing options for the type of professor (full-time or adjunct) and collecting relevant information.
    * Depending on the type of professor the specific additional information will be asked, but both professors have a first and lastname, id and a base salary.
    * It then calls the {@link  University#registerProfessor(int, String, String, String, double, double, int, int)}method in the controller class to handle the registration process and returns the message indicating the success or failure of the registration.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>intProfesorType must be an int.</li>
    *   <li>The first and lastname and the id must be a String.</li>
    *   <li>The base salary must be a double.</li>
    *   <li>In case of registering a full time professor:  the bonus must be a double and the extra hours an int.</li>
    *   <li>In case of registering an adjunct professor: the worked hours must be an int.</li>
    *   <li>The scanner object {@code sk} must be initialized.</li>
    *   <li>The University object {@code controller} must be initialized.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>A professor is registered based on the user's input, and a message indicating the success or failure of the registration is returned.</li>
    * </ul>
    */
    public void registerProfessor(){
        System.out.println("REGISTERING A PROFESSOR: ");

        String message = "";

        System.out.println("Type of professors:\n\t1. Full time professor\n\t2. Adjunct professor\n\t3. General professor");
        System.out.print("Select one of the options: ");
        int intProfType = sk.nextInt();
        sk.nextLine();

        String firstName = "";
        String lastName = "";
        String id = "";
        double baseSalary = 0;
        double bonus = 0;
        int extraHours = 0;
        int workedHours = 0;
        double totalSalary = 0;

        if(intProfType == 1 || intProfType == 2 || intProfType ==3){
            System.out.print("Enter the first name: ");
            firstName = sk.nextLine();
    
            System.out.print("Enter the last name: ");
            lastName = sk.nextLine();
    
            System.out.print("Enter the ID: ");
            id = sk.nextLine();
    
            System.out.print("Enter the base salary: ");
            baseSalary = sk.nextDouble();
            sk.nextLine();

            if(intProfType == 1){
                System.out.print("Enter the bonus: ");
                bonus = sk.nextDouble();
                sk.nextLine();
    
                System.out.print("Enter the amount of extra hours: ");
                extraHours = sk.nextInt();
                sk.nextLine();
            } else if (intProfType == 2){
                System.out.print("Enter the amount of worked hours: ");
                workedHours = sk.nextInt();
                sk.nextLine();
            } else {
                System.out.print("Enter the total salary: ");
                totalSalary = sk.nextDouble();
            }
            message = controller.registerProfessor(intProfType, firstName, lastName, id, 
            baseSalary, totalSalary, bonus, extraHours, workedHours);

        } else {
            message = "Please select one of the provided options.";
        }

        System.out.println(message);
    }

}