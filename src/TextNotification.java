import java.time.LocalDateTime;

public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;


    public TextNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smtpProvider) {
        super(createdAt, subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        pMethod();


    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }
    @Override
    public void transport() {

        super.transport();
    }

    @Override
    public void pMethod() {
        System.out.println("TEXT!");
        super.pMethod();
    }

}


