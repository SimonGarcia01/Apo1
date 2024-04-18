package model;

public class FullTimeProfessor extends Professor {
    //Attributes
    private double bonus;
    private double extraHours;

    //Methods

    //Calculate the total salary
    /**
    * <p><b>calcTotalSalary</b></p>
    * <b>Description:</b> Calculates the total salary of the full-time professor based on the base salary, bonus, and extra hours worked.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code baseSalary} must be a double.</li>
    *   <li>{@code bonus} must be a double.</li>
    *   <li>{@code extraHours} must be an int.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The total salary of the full-time professor is calculated and returned.</li>
    * </ul>
    * 
    * @param baseSalary The base salary of the full-time professor.
    * @param bonus The bonus amount for the full-time professor.
    * @param extraHours The number of extra hours worked by the full-time professor.
    * @return The total salary of the full-time professor.
    */
    public double calcTotalSalary(double baseSalary, double bonus, int extraHours){
        return baseSalary + bonus + (extraHours*60000);
    }

    //CONSTRUCTOR
    /**
    * <p><b>FullTimeProfessor</b></p>
    * <b>Description:</b> Constructs a new FullTimeProfessor object with the provided information.
    * This constructor initializes a new FullTimeProfessor object with the specified first name, last name, ID, base salary, bonus, and extra hours.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code firstName} must be a String.</li>
    *   <li>{@code lastName} must be a String.</li>
    *   <li>{@code id} must be a String.</li>
    *   <li>{@code baseSalary} must be a double.</li>
    *   <li>{@code bonus} must be a double.</li>
    *   <li>{@code extraHours} must be an int.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>A new FullTimeProfessor object is created with the specified first name, last name, ID, base salary, bonus, and extra hours.</li>
    *   <li>The total salary of the full-time professor is calculated based on the provided base salary, bonus, and extra hours, using the {@link #calcTotalSalary(double, double, int)} method.</li>
    *   <li>The total salary of the full-time professor is set using {@link Professor#setTotalSalary(double)} method from the superclass.</li>
    * </ul>
    * 
    * @param firstName The first name of the full-time professor.
    * @param lastName The last name of the full-time professor.
    * @param id The ID of the full-time professor.
    * @param baseSalary The base salary of the full-time professor.
    * @param bonus The bonus amount for the full-time professor.
    * @param extraHours The number of extra hours worked by the full-time professor.
    */
    public FullTimeProfessor(String firstName, String lastName, String id, double baseSalary, double totalSalary, double bonus, 
    int extraHours){
        super(firstName, lastName, id, baseSalary, totalSalary);
        
        this.bonus = bonus;
        this. extraHours = extraHours;
        
        super.setTotalSalary(calcTotalSalary(baseSalary, bonus, extraHours));
    }

    //GETTERS AND SETTERS

    /**
    * <p><b>getBonus</b></p>
    * <b>Description:</b> Retrieves the bonus amount for the full-time professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code FullTimeProfessor} instance cannot be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The bonus amount for the full-time professor is returned.</li>
    * </ul>
    * 
    * @return The bonus amount for the full-time professor.
    */
        public double getBonus() {
        return bonus;
    }

    /**
    * <p><b>setBonus</b></p>
    * <b>Description:</b> Sets the bonus amount for the full-time professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code FullTimeProfessor} instance cannot be null.</li>
    *   <li>{@code bonus} must be a double.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The bonus amount for the full-time professor is updated to the specified value.</li>
    * </ul>
    * 
    * @param bonus The new bonus amount for the full-time professor.
    */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
    * <p><b>getExtraHours</b></p>
    * <b>Description:</b> Retrieves the number of extra hours worked by the full-time professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code FullTimeProfessor} instance cannot be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The number of extra hours worked by the full-time professor is returned.</li>
    * </ul>
    * 
    * @return The number of extra hours worked by the full-time professor.
    */
    public double getExtraHours() {
        return extraHours;
    }

    /**
    * <p><b>setExtraHours</b></p>
    * <b>Description:</b> Sets the number of extra hours worked by the full-time professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code FullTimeProfessor} instance cannot be null.</li>
    *   <li>{@code extraHours} must be an int.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The number of extra hours worked by the full-time professor is updated to the specified value.</li>
    * </ul>
    * 
    * @param extraHours The new number of extra hours worked by the full-time professor.
    */
    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }
    
}
