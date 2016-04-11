
package cz.ares.basic;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HttpGetBasic", targetNamespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/wsdl/basic.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HttpGetBasic {


    /**
     * Request/response operace pro z�sk�n� xml v�pisu BASIC p�es HTTP GET
     * 
     * @param ver
     * @param ico
     * @param aktivni
     * @param jazyk
     * @param xml
     * @return
     *     returns cz.ares.basic.AresOdpovedi
     * @throws GetHttpBasicFault
     */
    @WebMethod(operationName = "GetXmlFile")
    @WebResult(name = "Ares_odpovedi", targetNamespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer_basic/v_1.0.3", partName = "Answer")
    public AresOdpovedi getXmlFile(
        @WebParam(name = "ico", targetNamespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.3", partName = "ico")
        String ico,
        @WebParam(name = "jazyk_odkazu", targetNamespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5", partName = "jazyk")
        JazykOdkazu jazyk,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "ver")
        String ver,
        @WebParam(name = "vystup_format_xml", targetNamespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.5", partName = "xml")
        String xml,
        @WebParam(name = "boolean", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "aktivni")
        boolean aktivni)
        throws GetHttpBasicFault
    ;

}
