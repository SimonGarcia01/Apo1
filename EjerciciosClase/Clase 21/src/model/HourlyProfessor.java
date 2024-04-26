package model;

public class HourlyProfessor extends Professor{
    //Constants
    public static final double HOURLY_WAGE = 40000;
    
    //Attributes
    private int workedHours;

    //Methods
 
    //Calculate total salary
    /**
    * <p><b>calcTotalSalary</b></p>
    * <b>Description:</b> Calculates the total salary of the hourly professor based on the base salary and the number of worked hours.
    * The base salary is accessed using {@link Professor#getBaseSalary()}
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code baseSalary} must be a double.</li>
    *   <li>{@code workedHours} must be an int.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The total salary of the hourly professor is calculated and returned.</li>
    * </ul>
    * 
    * @return The total salary of the hourly professor.
 */
    public double calcTotalSalary(){
        return super.getBaseSalary() + (workedHours*HOURLY_WAGE);
    }

    //TOSTRING
    @Override
    public String toString(){
        return String.format("%s\n\tWorked Hours: %d",super.toString(), getWorkedHours());
    }

    //CONSTRUCTOR
    /**
    * <p><b>HourlyProfessor</b></p>
    * <b>Description:</b> Constructs a new HourlyProfessor object with the provided information.
    * This constructor initializes a new HourlyProfessor object with the specified first name, last name, ID, base salary, and worked hours.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code firstName} must be a String.</li>
    *   <li>{@code lastName} must be a String.</li>
    *   <li>{@code id} must be a String.</li>
    *   <li>{@code baseSalary} must be a double.</li>
    *   <li>{@code workedHours} must be an int.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>A new HourlyProfessor object is created with the specified first name, last name, ID, base salary, and worked hours.</li>
    *   <li>The total salary of the hourly professor is calculated based on the provided base salary and worked hours, using the {@link #calcTotalSalary()} method.</li>
    *   <li>The total salary of the hourly professor is set using {@link Professor#setTotalSalary(double)} method from the superclass.</li>
    * </ul>
    * 
    * @param firstName The first name of the hourly professor.
    * @param lastName The last name of the hourly professor.
    * @param id The ID of the hourly professor.
    * @param baseSalary The base salary of the hourly professor.
    * @param workedHours The number of hours worked by the hourly professor.
    */
    public HourlyProfessor(String firstName, String lastName, String id, double baseSalary,  int workedHours){
        super(firstName, lastName, id, baseSalary);
        
        this.workedHours = workedHours;
        super.setTotalSalary(calcTotalSalary());
    }

    //GETTERS AND SETTERS
    /**
    * <p><b>getWorkedHours</b></p>
    * <b>Description:</b> Retrieves the number of hours worked by the hourly professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code HourlyProfessor} instance cannot be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The number of hours worked by the hourly professor is returned.</li>
    * </ul>
    * 
    * @return The number of hours worked by the hourly professor.
    */
    public int getWorkedHours() {
        return workedHours;
    }

    /**
    * <p><b>setWorkedHours</b></p>
    * <b>Description:</b> Sets the number of hours worked by the hourly professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code HourlyProfessor} instance cannot be null.</li>
    *   <li>{@code workedHours} must be an int.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The number of hours worked by the hourly professor is updated to the specified value.</li>
    * </ul>
    * 
    * @param workedHours The new number of hours worked by the hourly professor.
    */
    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}
