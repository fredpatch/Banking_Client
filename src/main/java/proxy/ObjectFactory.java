
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private static final QName _Conversion_QNAME = new QName("http://ws/", "Conversion");
    private static final QName _ConversionResponse_QNAME = new QName("http://ws/", "ConversionResponse");
    private static final QName _AccountList_QNAME = new QName("http://ws/", "accountList");
    private static final QName _AccountListResponse_QNAME = new QName("http://ws/", "accountListResponse");
    private static final QName _Getaccount_QNAME = new QName("http://ws/", "getaccount");
    private static final QName _GetaccountResponse_QNAME = new QName("http://ws/", "getaccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     * @return
     *     the new instance of {@link Conversion }
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link ConversionResponse }
     * 
     * @return
     *     the new instance of {@link ConversionResponse }
     */
    public ConversionResponse createConversionResponse() {
        return new ConversionResponse();
    }

    /**
     * Create an instance of {@link AccountList }
     * 
     * @return
     *     the new instance of {@link AccountList }
     */
    public AccountList createAccountList() {
        return new AccountList();
    }

    /**
     * Create an instance of {@link AccountListResponse }
     * 
     * @return
     *     the new instance of {@link AccountListResponse }
     */
    public AccountListResponse createAccountListResponse() {
        return new AccountListResponse();
    }

    /**
     * Create an instance of {@link Getaccount }
     * 
     * @return
     *     the new instance of {@link Getaccount }
     */
    public Getaccount createGetaccount() {
        return new Getaccount();
    }

    /**
     * Create an instance of {@link GetaccountResponse }
     * 
     * @return
     *     the new instance of {@link GetaccountResponse }
     */
    public GetaccountResponse createGetaccountResponse() {
        return new GetaccountResponse();
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
     * Create an instance of {@link BankService_Type }
     * 
     * @return
     *     the new instance of {@link BankService_Type }
     */
    public BankService_Type createBankService_Type() {
        return new BankService_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Conversion")
    public JAXBElement<Conversion> createConversion(Conversion value) {
        return new JAXBElement<>(_Conversion_QNAME, Conversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ConversionResponse")
    public JAXBElement<ConversionResponse> createConversionResponse(ConversionResponse value) {
        return new JAXBElement<>(_ConversionResponse_QNAME, ConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "accountList")
    public JAXBElement<AccountList> createAccountList(AccountList value) {
        return new JAXBElement<>(_AccountList_QNAME, AccountList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "accountListResponse")
    public JAXBElement<AccountListResponse> createAccountListResponse(AccountListResponse value) {
        return new JAXBElement<>(_AccountListResponse_QNAME, AccountListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getaccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Getaccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getaccount")
    public JAXBElement<Getaccount> createGetaccount(Getaccount value) {
        return new JAXBElement<>(_Getaccount_QNAME, Getaccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetaccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetaccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getaccountResponse")
    public JAXBElement<GetaccountResponse> createGetaccountResponse(GetaccountResponse value) {
        return new JAXBElement<>(_GetaccountResponse_QNAME, GetaccountResponse.class, null, value);
    }

}
