package com.oracle.jaxb.riclient;


import javax.xml.bind.JAXBException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, JAXBException {
        Runner runner = new Runner();

        System.out.println("JAXB modules: ");
        runner.printModule("javax.xml.bind.JAXBContext", "JAXB API");
        runner.printModule("com.sun.xml.bind.v2.runtime.JAXBContextImpl", "JAXB IMPL");
        runner.printModule("org.jvnet.staxex.StAxSOAPBody", "STAX-EX");
        runner.printModule("org.jvnet.fastinfoset.FastInfosetParser", "FastInfoset");
        runner.printModule("com.sun.xml.dtdparser.DTDParser", "DTD-Parser");
        runner.printModule("com.sun.istack.Builder", "istack-runtime");
        runner.printModule("com.sun.istack.tools.ParallelWorldClassLoader", "istack-tools");
        runner.printModule("com.sun.tools.jxc.SchemaGenerator", "JXC");
        runner.printModule("com.sun.tools.xjc.XJCFacade", "XJC");
        runner.printModule("org.relaxng.datatype.Datatype", "relaxNG");

        runner.marshallPojo();

    }
}
