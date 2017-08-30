
package wservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wservice package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://WService/", "helloResponse");
    private final static QName _CheckLoginCtrResponse_QNAME = new QName("http://WService/", "checkLoginCtrResponse");
    private final static QName _CheckLoginCtr_QNAME = new QName("http://WService/", "checkLoginCtr");
    private final static QName _Hello_QNAME = new QName("http://WService/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CheckLoginCtrResponse }
     * 
     */
    public CheckLoginCtrResponse createCheckLoginCtrResponse() {
        return new CheckLoginCtrResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CheckLoginCtr }
     * 
     */
    public CheckLoginCtr createCheckLoginCtr() {
        return new CheckLoginCtr();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginCtrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "checkLoginCtrResponse")
    public JAXBElement<CheckLoginCtrResponse> createCheckLoginCtrResponse(CheckLoginCtrResponse value) {
        return new JAXBElement<CheckLoginCtrResponse>(_CheckLoginCtrResponse_QNAME, CheckLoginCtrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckLoginCtr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "checkLoginCtr")
    public JAXBElement<CheckLoginCtr> createCheckLoginCtr(CheckLoginCtr value) {
        return new JAXBElement<CheckLoginCtr>(_CheckLoginCtr_QNAME, CheckLoginCtr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WService/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
