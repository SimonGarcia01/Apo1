package model;

public class HourlyProfessor extends Professor{
    //Attributes
    private int workedHours;

    //Methods
    
    //Calculate total salary
    public double calcTotalSalary(double baseSalary, int workedHours){
        return baseSalary + (workedHours*40000);
    }

    //CONSTRUCTOR
    public HourlyProfessor(String firstName, String lastName, String id, double baseSalary,  int workedHours){
        super(firstName, lastName, id, baseSalary);
        
        this.workedHours = workedHours;
        setTotalSalary(calcTotalSalary(baseSalary, workedHours));
    }

    //GETTERS AND SETTERS
    public int getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }
}
