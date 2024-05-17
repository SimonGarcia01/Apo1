package model;

public class ImprovementCollaborator extends Collaborator implements EfficiencyCalculable {
    //Attributes
    private int numberImplementedImprovements;
    private int numberLedProjects;

    //Relations

    //Methods
    public double calculateEfficiency(){
        double efficiency = -1;
        
        if(numberLedProjects!=0){
            efficiency = ((double) numberImplementedImprovements)/numberLedProjects;
        }

        return  efficiency*100;
    }

    //toString
    @Override
    public String toString(){
        return String.format("%s\n\tNumber of implemented projects: %d\n\tNumber of led projects: %d",super.toString(), numberImplementedImprovements, numberLedProjects);
    }


    //CONSTRUCTOR
    public ImprovementCollaborator(String id, String fullName, String email, String extension,
    int numberImplementedImprovements, int numberLedProjects){
        super(id, fullName, email, extension);
        
        this.numberImplementedImprovements = numberImplementedImprovements;
        this.numberLedProjects = numberLedProjects;
    }

    //GETTERS AND SETTERS
    public int getNumberImplementedImprovements() {
        return numberImplementedImprovements;
    }


    public void setNumberImplementedImprovements(int numberImplementedImprovements) {
        this.numberImplementedImprovements = numberImplementedImprovements;
    }


    public int getNumberLedProjects() {
        return numberLedProjects;
    }


    public void setNumberLedProjects(int numberLedProjects) {
        this.numberLedProjects = numberLedProjects;
    }
}
