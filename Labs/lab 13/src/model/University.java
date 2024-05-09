package model;
import java.util.ArrayList;

public class University {
    //Attributes

    //Relations
    private ArrayList<Collaborator> collaborators;

    //Methods

    //Register a DTI collaborator
    public String registerCollaborator(String fullName, String id, String email, String extension, int numberImplementedImprovements, int numberLedProjects){
        String message = "";

        if(searchCollaborator(id) == null){

            collaborators.add(new ImprovementCollaborator(id, fullName, email, extension, numberImplementedImprovements, numberLedProjects));
            message = "The DTI collaborator has been registered successfully.";

        }else{
            message = "A collaborator with that Id has already been registered.";
        }

        return message;
    }

    //Register a general collaborator
    public String registerCollaborator(String fullName, String id, String email, String extension){
        String message = "";

        if(searchCollaborator(id) == null){

            collaborators.add(new Collaborator(id, fullName, email, extension));
            message = "The general collaborator has been registered successfully.";

        }else{
            message = "A collaborator with that Id has already been registered.";
        }

        return message;
    }

    //search collaborator
    public Collaborator searchCollaborator(String id){
        Collaborator collaborator = null;

        for(Collaborator instCollaborator : collaborators){
            if(instCollaborator!=null && instCollaborator.getId().equals(id)){
                collaborator = instCollaborator;
            }
        }

        return collaborator;
    }

    //CONSTRUCTOR
    public University(){
        this.collaborators = new ArrayList<>();
    }


    //GETTERS AND SETTERS
    public ArrayList<Collaborator> getCollaborators() {
        return collaborators;
    }
    
}
