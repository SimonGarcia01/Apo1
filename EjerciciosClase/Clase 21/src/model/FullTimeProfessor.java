package model;

public class FullTimeProfessor extends Professor {
    //Attributes
    private double bonus;
    private int extraHours;

    //Methods

    //CONSTRUCTOR
    public FullTimeProfessor(String firstName, String lastName, double baseSalary, 
    double totalSalary, double bonus, int extraHours){
        super(firstName, lastName, baseSalary, totalSalary);

        this.bonus = bonus;
        this. extraHours = extraHours;
    }

    //GETTERS AND SETTERS
        public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }
    
}
