package model;

public class University {
    //Attributes
    private Professor[] professors;

    //Methods
    
    //Register a full time professor
    /**
    * <p><b>registerProfessor</b></p>
    * <b>Description:</b> Registers a full-time professor based on the provided information.
    * This method checks for duplicate professors with the same first and last name using the {@link #searchProf(String, String)} method.
    * If there is a duplicate professor, it returns a message indicating that the professor has already been registered.
    * If there is no duplicate, it checks for available space to register a new professor using the {@link #availableProf()} method.
    * If there is no available space, it returns a message indicating that no more professors can be registered.
    * If space is available, it creates a new instance of the FullTimeProfessor class and initializes it with the provided information.
    * The newly created professor is then added to the array of professors.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li> {@code professors} array must be initialized.</li>
    *   <li> Both the {@code searchProf} and {@code availableProf} methods should be in place.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li> A full-time professor is registered based on the provided information, and a message indicating the success or failure of the registration is returned.</li>
    * </ul>
    * 
    * @param firstName The first name of the professor.
    * @param lastName The last name of the professor.
    * @param id The ID of the professor.
    * @param baseSalary The base salary of the professor.
    * @param bonus The bonus for the full-time professor.
    * @param extraHours The extra hours for the full-time professor.
    * @return A message indicating the success or failure of the registration.
    */
    public String registerProfessor(String firstName, String lastName, String id, double baseSalary, 
    double bonus, int extraHours){
        String message = "";

        boolean duplicate = searchProf(firstName, lastName);

        if(!duplicate){
            int space = availableProf();

            if(space != -1){
                professors[space] = new FullTimeProfessor(firstName, lastName, id, baseSalary, 
                bonus, extraHours);
                message = "The full time professor has been successfully registered.";
            } else {
                message = "There is no more space to register a professor. Try Later.";
            }
        } else {
            message = "The entered professor has already been registered. Please enter other one.";
        }

        return message;
    }

    //Register hourly professor
    /**
    * <p><b>registerProfessor</b></p>
    * <b>Description:</b> Registers an hourly (adjunct) professor based on the provided information.
    * This method checks for duplicate professors with the same first and last name using the {@link #searchProf(String, String)} method.
    * If there is a duplicate professor, it returns a message indicating that the professor has already been registered.
    * If there is no duplicate, it checks for available space to register a new professor using the {@link #availableProf()} method.
    * If there is no available space, it returns a message indicating that no more professors can be registered.
    * If space is available, it creates a new instance of the HourlyProfessor class and initializes it with the provided information.
    * The newly created professor is then added to the array of professors.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li> {@code professors} array must be initialized.</li>
    *   <li> Both the {@code searchProf} and {@code availableProf} methods should be in place.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li> An hourly (adjunct) professor is registered based on the provided information, and a message indicating the success or failure of the registration is returned.</li>
    * </ul>
    * 
    * @param firstName The first name of the professor.
    * @param lastName The last name of the professor.
    * @param id The ID of the professor.
    * @param baseSalary The base salary of the professor.
    * @param workedHours The worked hours for the hourly (adjunct) professor.
    * @return A message indicating the success or failure of the registration.
    */
    public String registerProfessor(String firstName, String lastName, String id, double baseSalary, 
    int workedHours){
        String message = "";

        boolean duplicate = searchProf(firstName, lastName);

        if(!duplicate){
            int space = availableProf();

            if(space != -1){
                professors[space] = new HourlyProfessor(firstName, lastName, id, baseSalary, workedHours);
                message = "The adjunct professor has been successfully registered.";
            } else {
                message = "There is no more space to register a professor. Try Later.";
            }

        } else {
            message = "The entered professor has already been registered. Please enter other one.";
        }

        return message;
    }

    //Display all professors
    public String displayAllProfessors(){
        String message = "";
        if(professors[0] != null){
            message = "All registered professors: ";
            for(Professor professor : professors){
                if(professor != null) {
                    message += "\n"+professor.toString();
                }
            }
        } else {
            message = "There are no registered professors.";
        }

        return message;
    }

    //Display the total salary of all professors
    public String displaySalaryAllProf(){
        String message = "";
        if(professors[0] != null){
            message = "All the registered salaries: ";
            for(Professor professor : professors){
                if(professor != null) {
                    message += "\n\tFull Name: " + professor.getFirstName() + " " + professor.getLastName() + " - Total Salary: $ " + professor.getTotalSalary();
                }
            }
        } else {
            message = "There are no registered professors.";
        }

        return message;
    }

    //Display the full time professors that have a bonus greater than 2 million
    public int fullTimeBonusGreater2Mil(){
        int counter = 0;

        for(Professor professor : professors){
            if(professor != null && professor instanceof FullTimeProfessor && ((FullTimeProfessor)professor).getBonus()>=2000000) {
                counter++;
            }
        }

        return counter;
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
    public University(){
        this.professors = new Professor[50];
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
}
