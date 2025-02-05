package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(serviceName="BankConverterWS")
public class BankService {
    public BankService() {}

    @WebMethod(operationName = "Euro_to_DH_converter")
    public double converstion(@WebParam double amount) {
        return amount * 11;
    }

    @WebMethod
    public Account getAccount(@WebParam int code) {
        return new Account(code,new Date(),Math.random()*10000);
    }

    @WebMethod
    public List<Account> getAccountList(){
        return  List.of(
                new Account(1,new Date(),Math.random()*10000),
                new Account(2,new Date(),Math.random()*10000),
                new Account(3,new Date(),Math.random()*10000)
        );
    }
}
