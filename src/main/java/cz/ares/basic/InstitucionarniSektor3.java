
package cz.ares.basic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Institucionární sektor (RES)
 * 
 * <p>Java class for institucionarni_sektor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="institucionarni_sektor">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}zdroj_type" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "institucionarni_sektor", propOrder = {
    "value"
})
public class InstitucionarniSektor3 {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected ZdrojType3 zdroj;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link ZdrojType3 }
     *     
     */
    public ZdrojType3 getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZdrojType3 }
     *     
     */
    public void setZdroj(ZdrojType3 value) {
        this.zdroj = value;
    }

}
