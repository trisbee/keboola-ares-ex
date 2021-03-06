
package cz.ares.basic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * informace o z�kladn�m jm�n� subjektu
 * 
 * <p>Java class for kapital complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kapital">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZA" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vklad_spolecnika" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vklad_spolecnika" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ZAP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}vklad_spolecnika" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MKJ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ZAV" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CVK" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UOP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}jmeni" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Akcie" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}akcie" minOccurs="0"/>
 *         &lt;element name="UM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5}texty" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kapital", propOrder = {
    "za",
    "uk",
    "kj",
    "nj",
    "zap",
    "mkj",
    "mv",
    "zav",
    "cvk",
    "sp",
    "uop",
    "akcie",
    "um",
    "nm"
})
public class Kapital3 {

    @XmlElement(name = "ZA")
    protected List<VkladSpolecnika3> za;
    @XmlElement(name = "UK")
    protected List<VkladSpolecnika3> uk;
    @XmlElement(name = "KJ")
    protected List<Jmeni3> kj;
    @XmlElement(name = "NJ")
    protected List<Jmeni3> nj;
    @XmlElement(name = "ZAP")
    protected List<VkladSpolecnika3> zap;
    @XmlElement(name = "MKJ")
    protected List<Jmeni3> mkj;
    @XmlElement(name = "MV")
    protected List<Jmeni3> mv;
    @XmlElement(name = "ZAV")
    protected List<Jmeni3> zav;
    @XmlElement(name = "CVK")
    protected List<Jmeni3> cvk;
    @XmlElement(name = "SP")
    protected List<Jmeni3> sp;
    @XmlElement(name = "UOP")
    protected List<Jmeni3> uop;
    @XmlElement(name = "Akcie")
    protected Akcie3 akcie;
    @XmlElement(name = "UM")
    protected List<Texty3> um;
    @XmlElement(name = "NM")
    protected List<Texty3> nm;

    /**
     * Gets the value of the za property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the za property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VkladSpolecnika3 }
     * 
     * 
     */
    public List<VkladSpolecnika3> getZA() {
        if (za == null) {
            za = new ArrayList<VkladSpolecnika3>();
        }
        return this.za;
    }

    /**
     * Gets the value of the uk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VkladSpolecnika3 }
     * 
     * 
     */
    public List<VkladSpolecnika3> getUK() {
        if (uk == null) {
            uk = new ArrayList<VkladSpolecnika3>();
        }
        return this.uk;
    }

    /**
     * Gets the value of the kj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKJ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni3 }
     * 
     * 
     */
    public List<Jmeni3> getKJ() {
        if (kj == null) {
            kj = new ArrayList<Jmeni3>();
        }
        return this.kj;
    }

    /**
     * Gets the value of the nj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNJ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni3 }
     * 
     * 
     */
    public List<Jmeni3> getNJ() {
        if (nj == null) {
            nj = new ArrayList<Jmeni3>();
        }
        return this.nj;
    }

    /**
     * Gets the value of the zap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZAP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VkladSpolecnika3 }
     * 
     * 
     */
    public List<VkladSpolecnika3> getZAP() {
        if (zap == null) {
            zap = new ArrayList<VkladSpolecnika3>();
        }
        return this.zap;
    }

    /**
     * Gets the value of the mkj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mkj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMKJ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni3 }
     * 
     * 
     */
    public List<Jmeni3> getMKJ() {
        if (mkj == null) {
            mkj = new ArrayList<Jmeni3>();
        }
        return this.mkj;
    }

    /**
     * Gets the value of the mv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni3 }
     * 
     * 
     */
    public List<Jmeni3> getMV() {
        if (mv == null) {
            mv = new ArrayList<Jmeni3>();
        }
        return this.mv;
    }

    /**
     * Gets the value of the zav property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zav property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZAV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni3 }
     * 
     * 
     */
    public List<Jmeni3> getZAV() {
        if (zav == null) {
            zav = new ArrayList<Jmeni3>();
        }
        return this.zav;
    }

    /**
     * Gets the value of the cvk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCVK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni3 }
     * 
     * 
     */
    public List<Jmeni3> getCVK() {
        if (cvk == null) {
            cvk = new ArrayList<Jmeni3>();
        }
        return this.cvk;
    }

    /**
     * Gets the value of the sp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni3 }
     * 
     * 
     */
    public List<Jmeni3> getSP() {
        if (sp == null) {
            sp = new ArrayList<Jmeni3>();
        }
        return this.sp;
    }

    /**
     * Gets the value of the uop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Jmeni3 }
     * 
     * 
     */
    public List<Jmeni3> getUOP() {
        if (uop == null) {
            uop = new ArrayList<Jmeni3>();
        }
        return this.uop;
    }

    /**
     * Gets the value of the akcie property.
     * 
     * @return
     *     possible object is
     *     {@link Akcie3 }
     *     
     */
    public Akcie3 getAkcie() {
        return akcie;
    }

    /**
     * Sets the value of the akcie property.
     * 
     * @param value
     *     allowed object is
     *     {@link Akcie3 }
     *     
     */
    public void setAkcie(Akcie3 value) {
        this.akcie = value;
    }

    /**
     * Gets the value of the um property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the um property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getUM() {
        if (um == null) {
            um = new ArrayList<Texty3>();
        }
        return this.um;
    }

    /**
     * Gets the value of the nm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty3 }
     * 
     * 
     */
    public List<Texty3> getNM() {
        if (nm == null) {
            nm = new ArrayList<Texty3>();
        }
        return this.nm;
    }

}
