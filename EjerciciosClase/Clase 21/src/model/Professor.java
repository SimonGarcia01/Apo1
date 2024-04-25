package model;

public abstract class Professor {
    //Attributes
    private String firstName;
    private String lastName;
    private String id;
    private double baseSalary;
    private double totalSalary;

    //Methods

    public abstract double calcTotalSalary();

    //CONSTRUCTOR
    /**
    * <p><b>Professor</b></p>
    * <b>Description:</b> Constructs a new Professor object with the provided information.
    * This constructor initializes a new Professor object with the specified first name, last name, ID, and base salary.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code firstName} must be a String. </li>
    *   <li>{@code lastName} must be a String. </li>
    *   <li>{@code id} must be a String. </li>
    *   <li>{@code baseSalary} must be a String. </li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>A new Professor object is created with the specified first name, last name, ID, and base salary.</li>
    * </ul>
    * 
    * @param firstName The first name of the professor.
    * @param lastName The last name of the professor.
    * @param id The ID of the professor.
    * @param baseSalary The base salary of the professor.
    */
    public Professor(String firstName, String lastName, String id, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    //GETTERS AND SETTERS
    /**
    * <p><b>getFirstName</b></p>
    * <b>Description:</b> Retrieves the first name of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code professor} instance can't be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The first name of the professor is returned.</li>
    * </ul>
    * 
    * @return The first name of the professor.
    */
    public String getFirstName() {
        return firstName;
    }

    /**
    * <p><b>setFirstName</b></p>
    * <b>Description:</b> Sets the first name of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code professor} instance can't be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The first name of the professor is updated to the specified value.</li>
    * </ul>
    * 
    * @param firstName The new first name of the professor.
    */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
    * <p><b>getLastName</b></p>
    * <b>Description:</b> Retrieves the last name of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code professor} instance cannot be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The last name of the professor is returned.</li>
    * </ul>
    * 
    * @return The last name of the professor.
    */
    public String getLastName() {
        return lastName;
    }

    /**
    * <p><b>setLastName</b></p>
    * <b>Description:</b> Sets the last name of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>{@code lastName} must be a String.</li>
    *   <li>{@code professor} instance can't be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The last name of the professor is updated to the specified value.</li>
    * </ul>
    * 
    * @param lastName The new last name of the professor.
    */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
    * <p><b>getId</b></p>
    * <b>Description:</b> Retrieves the ID of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code professor} instance cannot be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The ID of the professor is returned.</li>
    * </ul>
    * 
    * @return The ID of the professor.
    */
    public String getId() {
        return id;
    }

    /**
    * <p><b>setId</b></p>
    * <b>Description:</b> Sets the ID of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code professor} instance cannot be null.</li>
    *   <li>{@code id} must be a String.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The ID of the professor is updated to the specified value.</li>
    * </ul>
    * 
    * @param id The new ID of the professor.
    */
    public void setId(String id) {
        this.id = id;
    }

    /**
    * <p><b>getBaseSalary</b></p>
    * <b>Description:</b> Retrieves the base salary of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code professor} instance cannot be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The base salary of the professor is returned.</li>
    * </ul>
    * 
    * @return The base salary of the professor.
    */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
    * <p><b>setBaseSalary</b></p>
    * <b>Description:</b> Sets the base salary of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code professor} instance cannot be null.</li>
    *   <li>{@code baseSalary} must be a double.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The base salary of the professor is updated to the specified value.</li>
    * </ul>
    * 
    * @param baseSalary The new base salary of the professor.
    */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
    * <p><b>getTotalSalary</b></p>
    * <b>Description:</b> Retrieves the total salary of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code professor} instance cannot be null.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The total salary of the professor is returned.</li>
    * </ul>
    * 
    * @return The total salary of the professor.
    */
    public double getTotalSalary() {
        return totalSalary;
    }

    /**
    * <p><b>setTotalSalary</b></p>
    * <b>Description:</b> Sets the total salary of the professor.
    * 
    * <p><b>Preconditions:</b></p>
    * <ul>
    *   <li>The {@code professor} instance cannot be null.</li>
    *   <li>{@code totalSalary} must be a double.</li>
    * </ul>
    * 
    * <p><b>Postconditions:</b></p>
    * <ul>
    *   <li>The total salary of the professor is updated to the specified value.</li>
    * </ul>
    * 
    * @param totalSalary The new total salary of the professor.
    */
    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}
