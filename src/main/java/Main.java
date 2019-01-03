import ssl.SendEmail;

public class Main {

    private static ssl.SendEmail sslSender = new SendEmail("yourgmail", "yourpass");
    private static tls.SendEmail tlsSender = new tls.SendEmail("yourgmail", "yourpass");

    public static void main(String[] args){
        tlsSender.send("This is Subject", "TLS: This is text", "admin@mail.com", "username@gmail.com");
        sslSender.send("This is Subject", "SSL: This is text!", "admin@mail.com", "username@yandex.ru");
    }
}
