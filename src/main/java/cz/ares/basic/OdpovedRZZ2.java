
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odpoved_RZZ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_RZZ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="E" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}error_ARES" minOccurs="0"/>
 *         &lt;element name="VH" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vysledek_hledani"/>
 *         &lt;element name="PZA" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Vypis_RZZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3}vypis_RZZ" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_RZZ", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.3", propOrder = {
    "pid",
    "e",
    "vh",
    "pza",
    "vypisRZZ"
})
public class OdpovedRZZ2 {

    @XmlElement(name = "PID")
    protected int pid;
    @XmlElement(name = "E")
    protected ErrorARES2 e;
    @XmlElement(name = "VH", required = true)
    protected VysledekHledani2 vh;
    @XmlElement(name = "PZA")
    protected int pza;
    @XmlElement(name = "Vypis_RZZ")
    protected List<VypisRZZ2> vypisRZZ;

    /**
     * Gets the value of the pid property.
     * 
     */
    public int getPID() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     */
    public void setPID(int value) {
        this.pid = value;
    }

    /**
     * Gets the value of the e property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorARES2 }
     *     
     */
    public ErrorARES2 getE() {
        return e;
    }

    /**
     * Sets the value of the e property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorARES2 }
     *     
     */
    public void setE(ErrorARES2 value) {
        this.e = value;
    }

    /**
     * Gets the value of the vh property.
     * 
     * @return
     *     possible object is
     *     {@link VysledekHledani2 }
     *     
     */
    public VysledekHledani2 getVH() {
        return vh;
    }

    /**
     * Sets the value of the vh property.
     * 
     * @param value
     *     allowed object is
     *     {@link VysledekHledani2 }
     *     
     */
    public void setVH(VysledekHledani2 value) {
        this.vh = value;
    }

    /**
     * Gets the value of the pza property.
     * 
     */
    public int getPZA() {
        return pza;
    }

    /**
     * Sets the value of the pza property.
     * 
     */
    public void setPZA(int value) {
        this.pza = value;
    }

    /**
     * Gets the value of the vypisRZZ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vypisRZZ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVypisRZZ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VypisRZZ2 }
     * 
     * 
     */
    public List<VypisRZZ2> getVypisRZZ() {
        if (vypisRZZ == null) {
            vypisRZZ = new ArrayList<VypisRZZ2>();
        }
        return this.vypisRZZ;
    }

}
