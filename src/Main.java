import java.time.LocalDateTime;

public class Main {
    public static void main(String args[]){
        EmailNotification emailNotification = new EmailNotification(LocalDateTime.MAX,"test", "test", "Test","test");

        System.out.println(emailNotification.subject);

        emailNotification.transport();

        TextNotification textNotification = new TextNotification(LocalDateTime.MAX,"test", "test", "Test","test");

        System.out.println(textNotification.subject);

        textNotification.transport();
        Object emailNotificationClone = emailNotification.clone();
        System.out.println(emailNotificationClone);
        emailNotification.equals(emailNotificationClone);
    }
}

