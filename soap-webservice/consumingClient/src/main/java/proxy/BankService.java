
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BankService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Euro_to_DH_converter")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Euro_to_DH_converter", targetNamespace = "http://ws/", className = "proxy.EuroToDHConverter")
    @ResponseWrapper(localName = "Euro_to_DH_converterResponse", targetNamespace = "http://ws/", className = "proxy.EuroToDHConverterResponse")
    @Action(input = "http://ws/BankService/Euro_to_DH_converterRequest", output = "http://ws/BankService/Euro_to_DH_converterResponse")
    public double euroToDHConverter(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.Account
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccount", targetNamespace = "http://ws/", className = "proxy.GetAccount")
    @ResponseWrapper(localName = "getAccountResponse", targetNamespace = "http://ws/", className = "proxy.GetAccountResponse")
    @Action(input = "http://ws/BankService/getAccountRequest", output = "http://ws/BankService/getAccountResponse")
    public Account getAccount(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Account>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAccountList", targetNamespace = "http://ws/", className = "proxy.GetAccountList")
    @ResponseWrapper(localName = "getAccountListResponse", targetNamespace = "http://ws/", className = "proxy.GetAccountListResponse")
    @Action(input = "http://ws/BankService/getAccountListRequest", output = "http://ws/BankService/getAccountListResponse")
    public List<Account> getAccountList();

}
