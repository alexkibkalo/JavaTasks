package oop.Task7.autopark;

import oop.Task7.interfaces.Cleaner;

public class AutoCleaner implements Cleaner {
    private String name;

    public AutoCleaner() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doCleaning() {
        System.out.println("The cleaner is cleaning in the autopark!");
    }
}
