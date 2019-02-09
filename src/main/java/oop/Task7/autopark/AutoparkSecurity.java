package oop.Task7.autopark;

import oop.Task7.interfaces.Security;

public class AutoparkSecurity implements Security {
    private String name;

    AutoparkSecurity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("The security is working in the autopark!");
    }
}
