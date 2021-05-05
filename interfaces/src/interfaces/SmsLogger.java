package interfaces;

public class SmsLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("sms has been sent :"+message);
    }
}
