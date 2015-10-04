
package com.webservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.client package. 
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

    private final static QName _TestMyServerStart_QNAME = new QName("http://server.webservice.com/", "testMyServerStart");
    private final static QName _TestMyServerStartResponse_QNAME = new QName("http://server.webservice.com/", "testMyServerStartResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestMyServerStartResponse }
     * 
     */
    public TestMyServerStartResponse createTestMyServerStartResponse() {
        return new TestMyServerStartResponse();
    }

    /**
     * Create an instance of {@link TestMyServerStart }
     * 
     */
    public TestMyServerStart createTestMyServerStart() {
        return new TestMyServerStart();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMyServerStart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.com/", name = "testMyServerStart")
    public JAXBElement<TestMyServerStart> createTestMyServerStart(TestMyServerStart value) {
        return new JAXBElement<TestMyServerStart>(_TestMyServerStart_QNAME, TestMyServerStart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestMyServerStartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server.webservice.com/", name = "testMyServerStartResponse")
    public JAXBElement<TestMyServerStartResponse> createTestMyServerStartResponse(TestMyServerStartResponse value) {
        return new JAXBElement<TestMyServerStartResponse>(_TestMyServerStartResponse_QNAME, TestMyServerStartResponse.class, null, value);
    }

}
