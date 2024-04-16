package model;

public class HourlyProfessor extends Professor{
    //Attributes
    private int workedHours;

    //Methods

    //CONSTRUCTOR
    public HourlyProfessor(String firstName, String lastName, double baseSalary, 
    double totalSalary, int workedHours){
        super(firstName, lastName, baseSalary, totalSalary);
        this.workedHours = workedHours;
    }

    //GETTERS AND SETTERS
    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}
