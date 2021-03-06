
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pravni_stav_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pravni_stav_ros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KPS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}pravni_stav" minOccurs="0"/>
 *         &lt;element name="NPS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3}popis" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pravni_stav_ros", propOrder = {
    "kps",
    "nps"
})
public class PravniStavRos {

    @XmlElement(name = "KPS")
    protected Byte kps;
    @XmlElement(name = "NPS")
    protected String nps;

    /**
     * Gets the value of the kps property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getKPS() {
        return kps;
    }

    /**
     * Sets the value of the kps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setKPS(Byte value) {
        this.kps = value;
    }

    /**
     * Gets the value of the nps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS() {
        return nps;
    }

    /**
     * Sets the value of the nps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS(String value) {
        this.nps = value;
    }

}
