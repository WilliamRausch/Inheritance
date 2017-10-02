import java.time.LocalDateTime;
public class Notification {
    private LocalDateTime createdAt;
    public String subject;
    public String body;

    public Notification(LocalDateTime createdAt, String subject, String body){
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }


    public String getBody() {
        return body;
    }
    public void transport() throws NoTransportException{

    }
    protected void pMethod(){
        System.out.println("PROTECTED METHOD");
    }


    
}
