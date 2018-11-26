
package com.bravehorsie.jaxws.runtimeclient;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CountService", targetNamespace = "http://com.bravehorsie.jaxws/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CountService {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod(action = "http://com.bravehorsie.jaxws/               CountService/getCount")
    @WebResult(name = "getCountResponse", targetNamespace = "http://com.bravehorsie.jaxws/", partName = "parameters")
    public int getCount();

}
