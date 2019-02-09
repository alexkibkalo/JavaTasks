package oop.Task7.attractionpark;

import oop.Task7.interfaces.Repairer;

public class AttractionsRepairer implements Repairer {
    private String name;

    AttractionsRepairer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doRepairing() {
        System.out.println("The repairer is fixing an attraction!");
    }
}
