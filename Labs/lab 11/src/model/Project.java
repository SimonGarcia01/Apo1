package model;

public class Project {
    //Attributes
    private String name;
    private double investment;
    private Role role;

    //Methods
    public static String[] getRoles(){
        return Role.getRoles();
    }

    //CONSTRUCTOR
    public Project(int intRole, String name, double investment){
        this.role = Role.intToRole(intRole);
        this.name = name;
        this.investment = investment;
    }

    //toString
    public String toString(){
        return String.format("Project Name: %s\nInversion: %.2f",name,investment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getInvestment() {
        return investment;
    }

    public void setInvestment(double investment) {
        this.investment = investment;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
