
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * �daje k elementu dozor�� rada
 * 
 * <p>Java class for dozorci_rada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dozorci_rada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CDR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}clen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="T" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}textType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dozorci_rada", propOrder = {
    "cdr",
    "t"
})
public class DozorciRada3 {

    @XmlElement(name = "CDR")
    protected List<Clen3> cdr;
    @XmlElement(name = "T")
    protected List<TextType3> t;

    /**
     * Gets the value of the cdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Clen3 }
     * 
     * 
     */
    public List<Clen3> getCDR() {
        if (cdr == null) {
            cdr = new ArrayList<Clen3>();
        }
        return this.cdr;
    }

    /**
     * Gets the value of the t property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the t property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType3 }
     * 
     * 
     */
    public List<TextType3> getT() {
        if (t == null) {
            t = new ArrayList<TextType3>();
        }
        return this.t;
    }

}
