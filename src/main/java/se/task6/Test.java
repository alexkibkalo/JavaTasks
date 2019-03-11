package se.task6;

public class Test {
    private String name;
    private boolean run;

    public Test(String name, boolean run) {
        this.name = name;
        this.run = run;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRun() {
        return run;
    }

    public void setRun(boolean run) {
        this.run = run;
    }

    public void a() {
        System.out.println("#a launched");
    }
}
