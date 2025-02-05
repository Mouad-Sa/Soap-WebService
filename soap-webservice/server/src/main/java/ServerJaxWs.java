import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServerJaxWs {
    public static void main(String[] args) {
        String url = "http://localhost:5200/";
        Endpoint.publish(url, new BankService());

        System.out.println("Server started at : " + url);

    }
}
