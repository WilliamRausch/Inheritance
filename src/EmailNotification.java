import java.time.LocalDateTime;

public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;
   
    public EmailNotification(LocalDateTime createdAt, String subject, String body, String recipient, String smtpProvider) {
        super(createdAt, subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;


    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return super.getCreatedAt();
    }

    @Override
    public void transport() {
        super.transport();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmailNotification that = (EmailNotification) o;

        if (!recipient.equals(that.recipient)) return false;
        return smtpProvider.equals(that.smtpProvider);
    }

    @Override
    public int hashCode() {
        int result = recipient.hashCode();
        result = 31 * result + smtpProvider.hashCode();
        return result;
    }

    @Override
    protected Object clone() {
        EmailNotification EmailNotificationClone = new EmailNotification(this.getCreatedAt(), this.getSubject(),this.getBody(),
                this.getRecipient(), this.getSmtpProvider());
        return EmailNotificationClone;

    }
}

