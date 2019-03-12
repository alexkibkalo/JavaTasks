package se.task12;

public class ProxyProject implements Project {

    private String url;
    private ImplementProject implementProject;

    ProxyProject(String url){
        this.url = url;
    }

    @Override
    public void run() {
        if (implementProject == null){
            implementProject = new ImplementProject(url);
        }
        implementProject.run();
    }
}
