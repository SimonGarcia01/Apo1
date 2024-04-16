package model;

public class University {
    //Attributes
    private Professor[] professors;

    //Methods
    
    //Register a professor
    public String registerProfessor(int intProfType, String firstName, String lastName, String id, double baseSalary, 
    double bonus, int extraHours, int workedHours){
        String message = "";

        boolean duplicate = searchProf(firstName, lastName);

        if(!duplicate){
            int space = availableProf();

            if(space != -1){
                if(intProfType == 1){
                    professors[space] = new FullTimeProfessor(firstName, lastName, id, baseSalary, bonus, extraHours);
                } else {
                    professors[space] = new HourlyProfessor(firstName, lastName, id, baseSalary, workedHours);
                }

            } else {
                message = "There is no more space to register a professor. Try Later.";
            }

        } else {
            message = "The entered professor has already been registered. Please enter other one.";
        }

        return message;
    }

    //SEARCH METHODS
    public boolean searchProf(String firstName, String lastName){
        boolean existProfessor = false;
        
        for(Professor professor : professors){
            if(professor != null && professor.getFirstName().equals(firstName) && professor.getLastName().equals(lastName)){
                existProfessor = true;
            }
        }

        return existProfessor;
    }


    //AVAILABLE SPACE METHODS
    public int availableProf(){
        int space = -1;

        for(int n = 0; n < professors.length; n++) {
            if(professors[n] == null) {
                space = n;
            }
        }

        return space;
    }

    //CONSTRUCTOR
    public University(){
        this.professors = new Professor[50];
    }

    //SETTERS AND GETTERS
    public Professor[] getProfessors() {
        return professors;
    }
}
