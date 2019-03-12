package se.task12;

public class Task12 {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/alexkibkalo/test");
        project.run();
    }
}
