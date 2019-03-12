package se.task12;

public class ImplementProject implements Project {

    private String url;

    ImplementProject(String url){
        this.url = url;
        load();
    }

    private void load(){
        System.out.println("Loading a project from " + url + "...");
    }

    @Override
    public void run() {
        System.out.println("Running a project " + url + "...");
    }
}
