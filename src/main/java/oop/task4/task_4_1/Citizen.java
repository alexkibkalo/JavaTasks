package oop.task4.task_4_1;

public class Citizen extends Human {

    private String passportData;

    public Citizen(String name, String passportData) {
        super(name);
        this.passportData = passportData;
    }

    protected String getPassportData() {
        return passportData;
    }

    @Override
    public String toString() {
        return "The citizen " + getName() +
                " is an unemployed!";
    }
}
