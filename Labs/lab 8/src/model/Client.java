package model;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Client {

    //attributes
    private String name;
    private String registrationNumber;
    private Calendar registrationDate;
    private String nit;
    private double transportedKilos;
    private double payments;

    //relations

    //Methods
    //constructor
    public Client(String name, String registrationNumber, Calendar registrationDate, String nit,
    double transportedKilos, double payments){

        this.name = name;
        this.registrationNumber = registrationNumber;
        this.registrationDate = registrationDate;
        this.nit = nit;
        this.transportedKilos = transportedKilos;
        this.payments = payments;

    }
    //empty constructor
    public Client(){
        this.name = "";
        this.registrationNumber = "";
        this.registrationDate = null;
        this.nit = "";
        this.transportedKilos = 0;
        this.payments = 0;

    }

    //toString method
    public String toString(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = dateFormat.format(this.registrationDate.getTime());
        return String.format("\n\nClient's Name: %s\n\tRegistration Number: %s\n\tExpiration date of registration: %s\n\tNit: %s\n\tTransported Kilos: %f\n\tPayments: %f",this.name, this.registrationNumber, 
        formattedDate, this.nit, this.transportedKilos, this.payments);
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Calendar getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Calendar registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public double getTransportedKilos() {
        return transportedKilos;
    }

    public void setTransportedKilos(double transportedKilos) {
        this.transportedKilos = transportedKilos;
    }

    public double getPayments() {
        return payments;
    }

    public void setPayments(double payments) {
        this.payments = payments;
    }

}
