package model;

public enum MoneyType {
    //Enumeration literals
    DOLLAR("Dollar"),
    PESO("Colombian Peso");

    //Attributes
    private String description;

    //Methods

    //intToMoneyType
    public static MoneyType intToMoneyType(int intToMoneyType) {
        MoneyType type = null;

        switch(intToMoneyType){
            case 1:
                type = DOLLAR;
                break;
            case 2:
                type = PESO;
                break;
            default:
                break;
        }

        return type;
    }


    //Constructor
    private MoneyType(String description) {
        this.description = description;
    }

    //GETTER

    public String getDescription() {
        return description;
    }
    
}
