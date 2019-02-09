package oop.Task7.autopark;

import oop.Task7.interfaces.Repairer;

public class AutoRepairer implements Repairer {
    private String name;

    AutoRepairer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doRepairing() {
        System.out.println("The repairer is fixing a car!");
    }
}
