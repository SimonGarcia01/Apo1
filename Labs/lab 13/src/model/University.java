package model;
import java.util.ArrayList;

public class University {
    //Attributes

    //Relations
    private ArrayList<Collaborator> collaborators;

    //Methods

    //Main methods

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

    //Delete a collaborator
    public String deleteCollaborator(int intId){
        collaborators.remove(intId-1);
        return "The collaborator has been removed successfully.";
    }

    //Consult DTI efficiency
    public String consultEfficiency(int intDtiCollab){
        String message = "The efficiency of the selected DTI collaborator is: ";

        message += getDTICollaborators().get(intDtiCollab-1).calculateEfficiency() + "%";

        return message;
    }

    //Display the info of all employees
    public String displayAllEmployees(){
        String message = "";
        
        for(Collaborator collaborator : collaborators){
            message += "\n"+collaborator.toString();
        }

        return message;
    }
    

    //General  Methods

    //search collaborator
    public Collaborator searchCollaborator(String id){
        for(Collaborator instCollaborator : collaborators){
            if(instCollaborator.getId().equals(id)){
                return instCollaborator;
            }
        }

        return null;
    }

    //oneMinCollaborator
    public boolean oneMinCollaborator(){
        return !collaborators.isEmpty();
    }

    //oneMinDtiCollaborator
    public boolean oneMinDtiCollaborator(){
        return !getDTICollaborators().isEmpty();
    }

    //Display collaborators
    public String displayCollaborators(){
        String message = "Available collaborators: ";
        int counter = 1;

        for(Collaborator collaborator : collaborators){
            message += String.format("\n\t%d. Full name: %s - ID: %s", counter, collaborator.getFullName(), 
            collaborator.getId());
            counter++;
        }

        return message;
    }

    //Display DTI Collaborators
    public String displayDTICollaborators(){
        String message = "Available DTI collaborators: ";

        ArrayList<ImprovementCollaborator> dtiCollab = getDTICollaborators();
        int counter = 1;

        for(Collaborator collaborator : dtiCollab){
            message += String.format("\n\t%d. Full name: %s - ID: %s", counter, collaborator.getFullName(), 
            collaborator.getId());
            counter++;
        }

        return message;
    }

    //get DTI Collaborators
    public ArrayList<ImprovementCollaborator> getDTICollaborators(){
        ArrayList<ImprovementCollaborator> dtiCollab = new ArrayList<>();

        for(Collaborator collaborator : collaborators){
            if(collaborator instanceof ImprovementCollaborator){
                dtiCollab.add((ImprovementCollaborator)collaborator);
            }
        }

        return dtiCollab;
    }

    //int To Collaborator
    public Collaborator intToCollaborator(int intCollaborator){
        return collaborators.get(intCollaborator-1);
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
