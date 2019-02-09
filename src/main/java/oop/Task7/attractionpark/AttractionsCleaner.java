package oop.Task7.attractionpark;

import oop.Task7.interfaces.Cleaner;

public class AttractionsCleaner implements Cleaner {
    private String name;

    public AttractionsCleaner() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doCleaning() {
        System.out.println("The cleaner is cleaning the attraction park!");
    }
}
