package factory;

public class InACall implements Calling{
    @Override
    public void execute() {
        System.out.println("In a call...");
    }
}
