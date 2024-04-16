package model;

public class FullTimeProfessor extends Professor {
    //Attributes
    private double bonus;
    private double extraHours;

    //Methods

    //Calculate the total salary
    public double calcTotalSalary(double baseSalary, double bonus, int extraHours){
        return baseSalary + bonus + (extraHours*60000);
    }

    //CONSTRUCTOR
    public FullTimeProfessor(String firstName, String lastName, String id, double baseSalary, double bonus, 
    int extraHours){
        super(firstName, lastName, id, baseSalary);
        
        this.bonus = bonus;
        this. extraHours = extraHours;
        setTotalSalary(calcTotalSalary(baseSalary, bonus, extraHours));
    }

    //GETTERS AND SETTERS
        public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getExtraHours() {
        return extraHours;
    }

    public void setExtraHours(int extraHours) {
        this.extraHours = extraHours;
    }
    
}
