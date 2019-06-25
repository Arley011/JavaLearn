package ua.art.springapp;

public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public void doMyInit() {
        System.out.println("Doing initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing destruction");
    }
}
