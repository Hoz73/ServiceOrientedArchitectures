
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _Livraison_QNAME = new QName("http://example.com/", "livraison");
    private final static QName _Addition_QNAME = new QName("http://example.com/", "addition");
    private final static QName _PrixTotal_QNAME = new QName("http://example.com/", "prixTotal");
    private final static QName _PrixTotalResponse_QNAME = new QName("http://example.com/", "prixTotalResponse");
    private final static QName _LivraisonResponse_QNAME = new QName("http://example.com/", "livraisonResponse");
    private final static QName _PrixResponse_QNAME = new QName("http://example.com/", "prixResponse");
    private final static QName _AdditionResponse_QNAME = new QName("http://example.com/", "additionResponse");
    private final static QName _Prix_QNAME = new QName("http://example.com/", "prix");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PrixTotalResponse }
     * 
     */
    public PrixTotalResponse createPrixTotalResponse() {
        return new PrixTotalResponse();
    }

    /**
     * Create an instance of {@link AdditionResponse }
     * 
     */
    public AdditionResponse createAdditionResponse() {
        return new AdditionResponse();
    }

    /**
     * Create an instance of {@link Prix }
     * 
     */
    public Prix createPrix() {
        return new Prix();
    }

    /**
     * Create an instance of {@link LivraisonResponse }
     * 
     */
    public LivraisonResponse createLivraisonResponse() {
        return new LivraisonResponse();
    }

    /**
     * Create an instance of {@link PrixResponse }
     * 
     */
    public PrixResponse createPrixResponse() {
        return new PrixResponse();
    }

    /**
     * Create an instance of {@link Livraison }
     * 
     */
    public Livraison createLivraison() {
        return new Livraison();
    }

    /**
     * Create an instance of {@link PrixTotal }
     * 
     */
    public PrixTotal createPrixTotal() {
        return new PrixTotal();
    }

    /**
     * Create an instance of {@link Addition }
     * 
     */
    public Addition createAddition() {
        return new Addition();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Livraison }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "livraison")
    public JAXBElement<Livraison> createLivraison(Livraison value) {
        return new JAXBElement<Livraison>(_Livraison_QNAME, Livraison.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Addition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "addition")
    public JAXBElement<Addition> createAddition(Addition value) {
        return new JAXBElement<Addition>(_Addition_QNAME, Addition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrixTotal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "prixTotal")
    public JAXBElement<PrixTotal> createPrixTotal(PrixTotal value) {
        return new JAXBElement<PrixTotal>(_PrixTotal_QNAME, PrixTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrixTotalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "prixTotalResponse")
    public JAXBElement<PrixTotalResponse> createPrixTotalResponse(PrixTotalResponse value) {
        return new JAXBElement<PrixTotalResponse>(_PrixTotalResponse_QNAME, PrixTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LivraisonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "livraisonResponse")
    public JAXBElement<LivraisonResponse> createLivraisonResponse(LivraisonResponse value) {
        return new JAXBElement<LivraisonResponse>(_LivraisonResponse_QNAME, LivraisonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrixResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "prixResponse")
    public JAXBElement<PrixResponse> createPrixResponse(PrixResponse value) {
        return new JAXBElement<PrixResponse>(_PrixResponse_QNAME, PrixResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "additionResponse")
    public JAXBElement<AdditionResponse> createAdditionResponse(AdditionResponse value) {
        return new JAXBElement<AdditionResponse>(_AdditionResponse_QNAME, AdditionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Prix }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example.com/", name = "prix")
    public JAXBElement<Prix> createPrix(Prix value) {
        return new JAXBElement<Prix>(_Prix_QNAME, Prix.class, null, value);
    }

}
