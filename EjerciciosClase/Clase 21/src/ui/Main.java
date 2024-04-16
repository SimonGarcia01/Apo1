package ui;

import java.util.Scanner;
import model.University;

public class Main{
    //attributes
    private University controller;
    private Scanner sk;

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
        double bonus = 0;
        int extraHours = 0;
        int workedHours = 0;

        if(intProfType == 1){
            System.out.print("Enter the first name: ");
            firstName = sk.nextLine();
    
            System.out.print("Enter the last name: ");
            lastName = sk.nextLine();
    
            System.out.print("Enter the ID: ");
            id = sk.nextLine();
    
            System.out.print("Enter the base salary: ");
            baseSalary = sk.nextDouble();
            sk.nextLine();

            System.out.println("Enter the bonus: ");
            bonus = sk.nextDouble();
            sk.nextLine();

            System.out.println("Enter the amount of extra hours: ");
            extraHours = sk.nextInt();
            sk.nextLine();

            message = controller.registerProfessor(intProfType, firstName, lastName, id, baseSalary, bonus, extraHours, 
            workedHours);

        } else if (intProfType == 2){
            System.out.print("Enter the first name: ");
            firstName = sk.nextLine();
    
            System.out.print("Enter the last name: ");
            lastName = sk.nextLine();
    
            System.out.print("Enter the ID: ");
            id = sk.nextLine();
    
            System.out.print("Enter the base salary: ");
            baseSalary = sk.nextDouble();
            sk.nextLine();

            System.out.print("Enter the amoun of worked hours: ");
            workedHours = sk.nextInt();
            sk.nextLine();

            message = controller.registerProfessor(intProfType, firstName, lastName, id, baseSalary, bonus, extraHours, 
            workedHours);

        } else {
            message = "Please select one of the provided options.";
        }

        System.out.println(message);
    }

}