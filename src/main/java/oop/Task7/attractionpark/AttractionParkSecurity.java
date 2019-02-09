package oop.Task7.attractionpark;

import oop.Task7.interfaces.Security;

public class AttractionParkSecurity implements Security {
    private String name;

    AttractionParkSecurity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("The security is working in the attraction park!");
    }
}
