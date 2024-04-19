package model;

public class University {
    //Attributes
    private String name;
    private Professor[] professors;

    //Constants
    public final int MAX_PROF = 50;

    //Methods
    
    //Register a professor
    /**
    * <p><b>registerProfessor</b></p>
    * <b>Description:</b> Registers a professor based on the provided information.
    * This method checks for duplicate professors with the same first and last name using the {@link #searchProf(String, String)} method.
    * If there is a duplicate professor, it returns a message indicating that the professor has already been registered.
    * If there is no duplicate, it checks for available space to register a new professor using the {@link #availableProf()} method.
    * If there is no available space, it returns a message indicating that no more professors can be registered.
    * If space is available, it creates a new instance of the appropriate type of professor (full-time, adjunct or general) based on the provided type and initializes it with the provided information.
    * The newly created professor is then added to the array of professors.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li> intProfType must be 1 or 2 (as an int)</li>
    *   <li>{@code professors} array must be initialized.</li>
    *   <li>Both the {@code searchProf} and {@code availableProf} methods should be in place.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>A professor is registered based on the provided information, and a message indicating the success or failure of the registration is returned.</li>
    * </ul>
    * 
    * @param intProfType The type of professor (1 for full-time, 2 for hourly).
    * @param firstName The first name of the professor.
    * @param lastName The last name of the professor.
    * @param id The ID of the professor.
    * @param baseSalary The base salary of the professor.
    * @param totalSalary The total salary (applicable for general professors only)
    * @param bonus The bonus (applicable for full-time professors only).
    * @param extraHours The extra hours (applicable for full-time professors only).
    * @param workedHours The worked hours (applicable for hourly professors only).
    * @return A message indicating the success or failure of the registration.
    */
    public String registerProfessor(int intProfType, String firstName, String lastName, String id, double baseSalary,
    double totalSalary, double bonus, int extraHours, int workedHours){
        String message = "";

        boolean duplicate = searchProf(id);

        if(!duplicate){
            int space = availableProf();

            if(space != -1){
                if(intProfType == 1){
                    professors[space] = new FullTimeProfessor(firstName, lastName, id, baseSalary, totalSalary, bonus, extraHours);
                } else if (intProfType == 2){
                    professors[space] = new HourlyProfessor(firstName, lastName, id, baseSalary, totalSalary, workedHours);
                } else {
                    professors[space] = new Professor(firstName, lastName, id, baseSalary, totalSalary);
                }

                message = "The professor was registered successfully.";

            } else {
                message = "There is no more space to register a professor. Try Later.";
            }

        } else {
            message = "The entered professor has already been registered. Please enter other one.";
        }

        return message;
    }

    //Add project
    public String addProject(int intProf, int intRole, String projectName, double investment){
        Professor professor = intToProf(intProf);
        return professor.addProject(intRole, projectName, investment);
    }
    
    //investMaxProject
    public String maxInvestProject(){
        String projectName = "";
        double maxInvestment = 0;

        for(Professor professor : professors){
            if(professor!=null){
                for(Project project : professor.getProjects()){
                    if(project != null && project.getInvestment() >= maxInvestment){
                        projectName = project.getName();
                    }
                }
            }
        }

        return projectName;
    }

    public String displayOverseerProfessors(){
        String message = "List of professors that are overseers: ";
        String[] profNames = new String[MAX_PROF];
        int profCounter = 0;

        for(Professor professor : professors) {
            if(professor != null){
                boolean isOverseer = false;

                for(Project project : professor.getProjects()){
                    if(project.getRole() == Role.valueOf("OVERSEER")) {
                        isOverseer = true;
                        profCounter++;
                    }
                }
                message += "\n\t" + profCounter + ". " + professor.getFirstName() + " " + professor.getLastName();
            }
        }

        return message;
    }

    //SEARCH METHODS
    /**
    * <p><b>searchProf</b></p>
    * <b>Description:</b> Searches for a professor with the specified first and last name.
    * This method iterates through the array of professors stored in the univesity and checks if there is a professor with the provided first and last name.
    * If a professor with matching first and last names is found, it sets the flag {@code existProfessor} to true; otherwise, it remains false.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code professors} array must be initialized.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>A boolean value indicating whether a professor with the specified first and last name exists or not is returned.</li>
    * </ul>
    * 
    * @param firstName The first name of the professor to search for.
    * @param lastName The last name of the professor to search for.
    * @return {@code boolean} informing if a professor with the specified first and last name exists.
    */
    public boolean searchProf(String id){
        boolean existProfessor = false;
        
        for(Professor professor : professors){
            if(professor != null && professor.getId().equals(id)){
                existProfessor = true;
            }
        }

        return existProfessor;
    }

    //One minimum professor
    public boolean oneMinProf(){
        boolean oneProf = false;

        if(professors[0] != null){
            oneProf = true;
        }

        return oneProf;
    }

    //oneMinProject
    public boolean oneMinProject(){
        boolean oneProject = false;

        for(Professor professor : professors){
            if(professor != null && professor.getProjects()[0]!=null){
                oneProject = true;
            }
        }

        return oneProject;
    }

    //intToProfessor
    public Professor intToProf(int intProf){
        Professor professor = professors[intProf-1];
        return professor;
    }   

    //AVAILABLE SPACE METHODS
    /**
    * <p><b>availableProf</b></p>
    * <b>Description:</b> Finds the index of the first available slot in the professors array to register a new professor.
    * This method iterates through the array of professors stored in the controller and returns the index of the first null element, indicating an available slot to register a new professor.
    * If no available slot is found, it returns -1.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code professors} array must be initialized.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The index of the first available slot to register a new professor is returned.</li>
    * </ul>
    * 
    * @return The index of the first available slot to register a new professor, or -1 if no slot is available.
    */
    public int availableProf(){
        for(int n = 0; n < professors.length; n++) {
            if(professors[n] == null) {
                return n;
            }
        }

        return -1;
    }

    //DISPLAY METHODS
    public String displayRoles(){
        String message = "Available roles: ";

        String[] roles = Professor.getRoles();
        
        for(int n = 0; n < roles.length; n++){
            message +="\n\t" + (n+1) + ". " + roles[n];
        }

        return message;
    }

    public String displayProfessors(){
        String message = "Registered professors: \n";
        for(int i = 0; i < professors.length; i++){
            if(professors[i]!=null){
                message += "\t"+(i+1) + ". " + professors[i].getFirstName() + " " + professors[i].getLastName() + "\n";
            }
        }
        return message;
    }

    //CONSTRUCTOR

    /**
    * <p><b>University</b></p>
    * <b>Description:</b> Constructs a new University object.
    * This constructor initializes the array of professors with a fixed size of 50.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code None}: No preconditions.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>A new University object is created with an array of professors initialized to a size of 50.</li>
    * </ul>
    */
    public University(String name){
        this.name = name;
        this.professors = new Professor[MAX_PROF];
    }

    //SETTERS AND GETTERS
    /**
    * <p><b>getProfessors</b></p>
    * <b>Description:</b> Retrieves the array of professors.
    * This method returns the array of professors stored in the  University.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
        *   <li>{@code professors} array must be initialized.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The array of professors is returned.</li>
    * </ul>
    * 
    * @return The array of professors.
    */
    public Professor[] getProfessors() {
        return professors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
