package factory;

public class FinishCall implements Calling {
    @Override
    public void execute() {
        System.out.println("The call has finished...");
    }
}
