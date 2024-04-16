package model;

public class Professor {
    //Attributes
    private String firstName;
    private String lastName;
    private String id;
    private double baseSalary;
    private double totalSalary;

    //Methods

    //CONSTRUCTOR
    public Professor(String firstName, String lastName, String id, double baseSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    //GETTERS AND SETTERS
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}
