
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _EuroToDHConverter_QNAME = new QName("http://ws/", "Euro_to_DH_converter");
    private static final QName _EuroToDHConverterResponse_QNAME = new QName("http://ws/", "Euro_to_DH_converterResponse");
    private static final QName _GetAccount_QNAME = new QName("http://ws/", "getAccount");
    private static final QName _GetAccountList_QNAME = new QName("http://ws/", "getAccountList");
    private static final QName _GetAccountListResponse_QNAME = new QName("http://ws/", "getAccountListResponse");
    private static final QName _GetAccountResponse_QNAME = new QName("http://ws/", "getAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EuroToDHConverter }
     * 
     * @return
     *     the new instance of {@link EuroToDHConverter }
     */
    public EuroToDHConverter createEuroToDHConverter() {
        return new EuroToDHConverter();
    }

    /**
     * Create an instance of {@link EuroToDHConverterResponse }
     * 
     * @return
     *     the new instance of {@link EuroToDHConverterResponse }
     */
    public EuroToDHConverterResponse createEuroToDHConverterResponse() {
        return new EuroToDHConverterResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountList }
     * 
     * @return
     *     the new instance of {@link GetAccountList }
     */
    public GetAccountList createGetAccountList() {
        return new GetAccountList();
    }

    /**
     * Create an instance of {@link GetAccountListResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountListResponse }
     */
    public GetAccountListResponse createGetAccountListResponse() {
        return new GetAccountListResponse();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToDHConverter }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroToDHConverter }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Euro_to_DH_converter")
    public JAXBElement<EuroToDHConverter> createEuroToDHConverter(EuroToDHConverter value) {
        return new JAXBElement<>(_EuroToDHConverter_QNAME, EuroToDHConverter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EuroToDHConverterResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EuroToDHConverterResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Euro_to_DH_converterResponse")
    public JAXBElement<EuroToDHConverterResponse> createEuroToDHConverterResponse(EuroToDHConverterResponse value) {
        return new JAXBElement<>(_EuroToDHConverterResponse_QNAME, EuroToDHConverterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountList")
    public JAXBElement<GetAccountList> createGetAccountList(GetAccountList value) {
        return new JAXBElement<>(_GetAccountList_QNAME, GetAccountList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountListResponse")
    public JAXBElement<GetAccountListResponse> createGetAccountListResponse(GetAccountListResponse value) {
        return new JAXBElement<>(_GetAccountListResponse_QNAME, GetAccountListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

}
