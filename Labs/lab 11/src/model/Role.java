package model;

public enum Role {
    //Enumeration literals
	LEADER("Leader"),
    EXECUTOR("Executor"),
    OVERSEER("Overseer");

    //Attributes
    private final String description;

    //Methods

    //TO EXTRACT THE LIST OF DESCRIPTIONS

    public static String[] getRoles() {
        Role[] role = Role.values();
        String[] descriptions = new String[role.length];
        for (int i = 0; i < role.length; i++) {
            descriptions[i] = role[i].getDescription();
        }
        return descriptions;
    }

    //intToRole
    public static Role intToRole(int intRole){
        Role role = null;
        switch(intRole){
            case 1:
                role = LEADER;
                break;
            case 2:
                role = EXECUTOR;
                break;
            case 3:
                role = OVERSEER;
                break;
            default:
                role = null;
                break;
        }

        return role;
    }

    //CONSTRUCTOR
    private Role(String description){
        this.description = description;
    }

    //GET THE DESCRIPTION FOR ONE LITERAL

    public String getDescription(){
        return description;
    }

}
