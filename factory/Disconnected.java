package factory;

public class Disconnected implements Calling{
    @Override
    public void execute() {
        System.out.println("Disconnected from the call...");
    }
}
