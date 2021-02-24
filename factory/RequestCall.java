package factory;

public class RequestCall implements Calling {
    @Override
    public void execute() {
        System.out.println("Request a call");
    }
}
