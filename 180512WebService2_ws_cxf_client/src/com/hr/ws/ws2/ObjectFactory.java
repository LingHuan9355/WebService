
package com.hr.ws.ws2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hr.ws.ws2 package. 
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

    private final static QName _GetAllStudentMap_QNAME = new QName("http://ws2.ws.hr.com/", "getAllStudentMap");
    private final static QName _GetStudentById_QNAME = new QName("http://ws2.ws.hr.com/", "getStudentById");
    private final static QName _GetStudentsByPriceResponse_QNAME = new QName("http://ws2.ws.hr.com/", "getStudentsByPriceResponse");
    private final static QName _GetAllStudentMapResponse_QNAME = new QName("http://ws2.ws.hr.com/", "getAllStudentMapResponse");
    private final static QName _AddStudent_QNAME = new QName("http://ws2.ws.hr.com/", "addStudent");
    private final static QName _GetStudentByIdResponse_QNAME = new QName("http://ws2.ws.hr.com/", "getStudentByIdResponse");
    private final static QName _GetStudentsByPrice_QNAME = new QName("http://ws2.ws.hr.com/", "getStudentsByPrice");
    private final static QName _AddStudentResponse_QNAME = new QName("http://ws2.ws.hr.com/", "addStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hr.ws.ws2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllStudentMapResponse }
     * 
     */
    public GetAllStudentMapResponse createGetAllStudentMapResponse() {
        return new GetAllStudentMapResponse();
    }

    /**
     * Create an instance of {@link GetAllStudentMapResponse.Return }
     * 
     */
    public GetAllStudentMapResponse.Return createGetAllStudentMapResponseReturn() {
        return new GetAllStudentMapResponse.Return();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link GetStudentsByPrice }
     * 
     */
    public GetStudentsByPrice createGetStudentsByPrice() {
        return new GetStudentsByPrice();
    }

    /**
     * Create an instance of {@link GetStudentByIdResponse }
     * 
     */
    public GetStudentByIdResponse createGetStudentByIdResponse() {
        return new GetStudentByIdResponse();
    }

    /**
     * Create an instance of {@link GetStudentById }
     * 
     */
    public GetStudentById createGetStudentById() {
        return new GetStudentById();
    }

    /**
     * Create an instance of {@link GetAllStudentMap }
     * 
     */
    public GetAllStudentMap createGetAllStudentMap() {
        return new GetAllStudentMap();
    }

    /**
     * Create an instance of {@link GetStudentsByPriceResponse }
     * 
     */
    public GetStudentsByPriceResponse createGetStudentsByPriceResponse() {
        return new GetStudentsByPriceResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetAllStudentMapResponse.Return.Entry }
     * 
     */
    public GetAllStudentMapResponse.Return.Entry createGetAllStudentMapResponseReturnEntry() {
        return new GetAllStudentMapResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws2.ws.hr.com/", name = "getAllStudentMap")
    public JAXBElement<GetAllStudentMap> createGetAllStudentMap(GetAllStudentMap value) {
        return new JAXBElement<GetAllStudentMap>(_GetAllStudentMap_QNAME, GetAllStudentMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws2.ws.hr.com/", name = "getStudentById")
    public JAXBElement<GetStudentById> createGetStudentById(GetStudentById value) {
        return new JAXBElement<GetStudentById>(_GetStudentById_QNAME, GetStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws2.ws.hr.com/", name = "getStudentsByPriceResponse")
    public JAXBElement<GetStudentsByPriceResponse> createGetStudentsByPriceResponse(GetStudentsByPriceResponse value) {
        return new JAXBElement<GetStudentsByPriceResponse>(_GetStudentsByPriceResponse_QNAME, GetStudentsByPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStudentMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws2.ws.hr.com/", name = "getAllStudentMapResponse")
    public JAXBElement<GetAllStudentMapResponse> createGetAllStudentMapResponse(GetAllStudentMapResponse value) {
        return new JAXBElement<GetAllStudentMapResponse>(_GetAllStudentMapResponse_QNAME, GetAllStudentMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws2.ws.hr.com/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws2.ws.hr.com/", name = "getStudentByIdResponse")
    public JAXBElement<GetStudentByIdResponse> createGetStudentByIdResponse(GetStudentByIdResponse value) {
        return new JAXBElement<GetStudentByIdResponse>(_GetStudentByIdResponse_QNAME, GetStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentsByPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws2.ws.hr.com/", name = "getStudentsByPrice")
    public JAXBElement<GetStudentsByPrice> createGetStudentsByPrice(GetStudentsByPrice value) {
        return new JAXBElement<GetStudentsByPrice>(_GetStudentsByPrice_QNAME, GetStudentsByPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws2.ws.hr.com/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

}
