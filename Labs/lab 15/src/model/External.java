package model;

import java.util.ArrayList;

public class External extends Collaborator implements Payable{
    //Attributes
    private String arl;
    private String businessName;
    private double hourValue;
    private ArrayList<String> certifications;
    private MoneyType typeMoney;


    //Relations
    

    //Methods
    public String addCertification(String certification){
        certifications.add(certification);
        return "The certification has been added to the external collaborator.";
    }


    //calculate bonus
    public double calculateBonus(int hours){
        double bonus = 0;
        double totalSalary = hours*hourValue;

        if(certifications.size() >= 3 && certifications.size() <=5){
            bonus = 0.10;
        } else if(certifications.size() > 5) {
            bonus = 0.20;
        }

        totalSalary += totalSalary*bonus;

        return totalSalary;
    }

    //toString
    @Override
    public String toString(){
        String listCertifications = "Certifications: ";
        int counter = 1;

        for(String string : certifications){
            listCertifications += "\n\t\t" + counter + ". " + string;
            counter++;
        }

        return String.format("%s\n\tARL: %s\n\tBusinessName: %s\n\tHour Value: %.2f\n\tCurrency: %s\n\t%s", super.toString(), arl, businessName, hourValue, typeMoney.getDescription(), listCertifications);
    }


    //CONSTRUCTOR
    public String getArl() {
        return arl;
    }
    public External(String id, String fullName, String email, String extension, String arl, String businessName,
            double hourValue, int intTypeMoney) {
        super(id, fullName, email, extension);
        this.arl = arl;
        this.businessName = businessName;
        this.hourValue = hourValue;
        this.typeMoney = MoneyType.intToMoneyType(intTypeMoney);

        this.certifications = new ArrayList<>();
    }

    //GETTERS AND SETTERS

    public void setArl(String arl) {
        this.arl = arl;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public double getHourValue() {
        return hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }

    public MoneyType getTypeMoney() {
        return typeMoney;
    }

    public void setTypeMoney(MoneyType typeMoney) {
        this.typeMoney = typeMoney;
    }

    public ArrayList<String> getCertificacions() {
        return certifications;
    }

}
