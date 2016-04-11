
package cz.ares.basic;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typ_upadku.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typ_upadku">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="1"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="Z"/>
 *     &lt;enumeration value="K"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typ_upadku")
@XmlEnum
public enum TypUpadku {

    U,
    N,
    Z,
    K;

    public String value() {
        return name();
    }

    public static TypUpadku fromValue(String v) {
        return valueOf(v);
    }

}
