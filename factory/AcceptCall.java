package factory;

public class AcceptCall implements Calling {
    @Override
    public void execute() {
        System.out.println("Accept the call...");
    }
}
