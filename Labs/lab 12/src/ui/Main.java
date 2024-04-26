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
                    //Display the info of all professors
                    objMain.displayAllProfessors();
                    break;
                case 3:
                    //Display the total salary of all professors\
                    objMain.displaySalaryAllProf();
                    break;
                case 4:
                    //Display amount of full-time professors with a bonus greater than $2,000,000
                    objMain.fullTimeBonusGreater2Mil();
                    break;
                case 5:
                    //To end the program
                    menuLoop = false;
                    System.out.println("EXITING PROGRAM...");
                    break;
                
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
        System.out.println("\t1. Register a professor\n\t2. Display the info of all professors\n\t3. Display the total salary of all professors\n\t4. Display amount of full-time professors with a bonus greater than $2,000,000\n\t5. Exit Program");
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
    * Depending on the type of professor, specific additional information will be asked, but both professors have a first name, last name, ID, and base salary.
    * It then calls the {@link University#registerProfessor(String, String, String, double, double, int)} method for a full-time professor or the {@link University#registerProfessor(String, String, String, double, int)} method for an adjunct professor in the controller class to handle the registration process and returns the message indicating the success or failure of the registration.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code intProfType} must be an int.</li>
    *   <li>The first name, last name, and ID must be a String.</li>
    *   <li>The base salary must be a double.</li>
    *   <li>In case of registering a full-time professor: the bonus must be a double and the extra hours an int.</li>
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

        System.out.println("Type of professors:\n\t1. Full time professor.\n\t2. Adjunct professor.");
        System.out.print("Select one of the options: ");
        int intProfType = sk.nextInt();
        sk.nextLine();

        String firstName = "";
        String lastName = "";
        String id = "";
        double baseSalary = 0;

        if(intProfType == 1 || intProfType == 2){
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
                double bonus = sk.nextDouble();
                sk.nextLine();
    
                System.out.print("Enter the amount of extra hours: ");
                int extraHours = sk.nextInt();
                sk.nextLine();

                message = controller.registerProfessor(firstName, lastName, id, baseSalary, bonus, 
                extraHours);
                
            } else {
                System.out.print("Enter the amount of worked hours: ");
                int workedHours = sk.nextInt();
                sk.nextLine();

                message = controller.registerProfessor(firstName, lastName, id, baseSalary, workedHours);
            }

        } else {
            message = "Please select one of the provided options.";
        }

        System.out.println(message);
    }

    public void displayAllProfessors(){
        System.out.println("DISPLAYING INFORMATION OF ALL PROFESSORS");
        System.out.println(controller.displayAllProfessors());
    }

    public void displaySalaryAllProf(){
        System.out.println("DISPLAYING THE SALARY OF ALL PROFESSORS:");
        System.out.println(controller.displaySalaryAllProf());
    }

    public void fullTimeBonusGreater2Mil(){
        System.out.println("DISPLAYING THE SALARY OF ALL PROFESSORS WITH A BONUS GREATER THAN 2 MILLION:");
        System.out.println("Number of full-time professors with a bonus greater than 2 million: " + controller.fullTimeBonusGreater2Mil());
    }
}