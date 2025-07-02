package app2.model;

public class DHL implements MailDeliveryService{
    public void sendMail(){
        System.out.println("Отправить по Интернет");
    }

}
