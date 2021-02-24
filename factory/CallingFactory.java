package factory;

public class CallingFactory {

    public static Calling handleCall(CallingState callingState) {
        switch (callingState) {
            case ACCEPTED -> {
                return new AcceptCall();
            }
            case DISCONNECTED -> {
                return new Disconnected();
            }
            case FINISHED -> {
                return new FinishCall();
            }
            case IN_A_CALL -> {
                return new InACall();
            }
            case RECONNECTED -> {
                return new Reconnnect();
            }
            default -> {
                return new RequestCall();
            }
        }

    }
    public static void main(String[] args) {
        Calling accepted = handleCall(CallingState.ACCEPTED);
        accepted.execute();

        Calling disconnected = handleCall(CallingState.DISCONNECTED);
        disconnected.execute();

        Calling finished = handleCall(CallingState.FINISHED);
        finished.execute();

        Calling inACall = handleCall(CallingState.CALLING);
        inACall.execute();

        Calling reconnected = handleCall(CallingState.RECONNECTED);
        reconnected.execute();

        Calling request = handleCall(CallingState.REQUESTED);
        request.execute();
    }
}
