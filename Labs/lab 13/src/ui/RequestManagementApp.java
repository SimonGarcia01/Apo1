package ui;

import java.util.Scanner;
import model.University;

public class RequestManagementApp{
    //Attributes
    private Scanner sk;

    //Relations
    private University controller;

    //Methods
    //CONSTRUCTOR
    public RequestManagementApp(){
        sk = new Scanner(System.in);
        controller = new University();
    }

    //MAIN
    public static void main(String[] args){
        RequestManagementApp objMain = new RequestManagementApp();

        boolean generalLoop = true;
        int option = 0;

        do{
            option = objMain.menu();

            switch (option) {
                case 1: //To register a collaborator
                    objMain.registerCollaborator();
                    break;
                
                case 2: //Delete a collaborator
                    objMain.deleteCollaborator();
                    break;

                case 3: //Consult efficiency of a collaborator
                    objMain.consultEfficiency();
                    break;

                case 4: //Display the information of all employees
                    objMain.displayAllEmployees();
                    break;

                case 5: //To end the program
                    generalLoop = false;
                    System.out.println("EXITING PROGRAM...");
                    break;
                    
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }

        }while(generalLoop);

    }

    //General methods
    public int menu(){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("General Menu:\n\t1. Register a collaborator\n\t2. Delete a collaborator\n\t3. Consult the efficiency of a collaborator\n\t4. Display the information of all employees.\n\t5. Exit Program");
        System.out.print("Enter one of the options: ");
        int option = sk.nextInt();
        sk.nextLine();
        System.out.println("------------------------------------------------------------------------------------------");
        
        return option;
    }

    public void registerCollaborator(){
        System.out.println("REGISTERING A COLLABORATOR:");
        System.out.println("The types of collaborators are:\n\t1. DTI collaborator\n\t2. General collaborator");
        System.out.print("Enter one of the options: ");
        int intCollabType = sk.nextInt();
        sk.nextLine();

        System.out.print("Enter the collaborator's full name: ");
        String fullName = sk.nextLine();

        System.out.print("Enter the collaborator's ID: ");
        String id = sk.nextLine();

        System.out.print("Enter the collaborator's email: ");
        String email = sk.nextLine();
        
        System.out.print("Enter the collaborator's extension (optional): " );
        String extension = sk.nextLine();

        if(intCollabType==1){
            System.out.print("Enter the number of implemented improvements: ");
            int numberImplementedImprovements = sk.nextInt();
            sk.nextLine();

            System.out.print("Enter the number of projects the collaborator has led: ");
            int numberLedProjects = sk.nextInt();
            sk.nextLine();

            System.out.println(controller.registerCollaborator(fullName, id, email, extension, numberImplementedImprovements, numberLedProjects));

        } else {
            System.out.println(controller.registerCollaborator(fullName, id, email, extension));
        }

        
    }

    public void deleteCollaborator(){
        System.out.println("DELETING A COLLABORATOR");

        if(controller.oneMinCollaborator()){

            System.out.println(controller.displayCollaborators());
            System.out.print("Enter the collaborator you want to remove: ");
            int intId = sk.nextInt();
            sk.nextLine();

            System.out.println(controller.deleteCollaborator(intId));

        } else {
            System.out.println("There must be at least one collaborator to delete one.");
        }
        
    }

    public void consultEfficiency(){
        System.out.println("CONSULTING EFFICIENCY OF A DTI COLLABORATOR:");
        if(controller.oneMinDtiCollaborator()){
            System.out.println(controller.displayDTICollaborators());
            System.out.print("Enter one of the DTI collaborators: ");
            int intDtiCollab = sk.nextInt();
            sk.nextLine();

            System.out.println(controller.consultEfficiency(intDtiCollab));

        } else {
            System.out.println("There should be at least one DTI collaborator in order to consult the efficiency.");
        }
    }

    public void displayAllEmployees(){
        System.out.println("DISPLAYING THE INFORMATION OF ALL EMPLOYEES:");

        if(controller.oneMinCollaborator()){
            System.out.println(controller.displayAllEmployees());
        } else {
            System.out.println("There must be at least one registered collaborator in order to display its info.");
        }
    }    
}