package com.oracle.jaxb.riclient;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringWriter;
import java.io.Writer;

public class Runner {

    public void marshallPojo() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Pojo.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        Writer out = new StringWriter();
        marshaller.marshal(new Pojo("abc value"), out);
        System.out.println("result = " + out);

    }


    public void printModule(String className, String dependencyName) {
        Class<?> cls = null;
        try {
            cls = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        if (dependencyName.length() > 25) {
            dependencyName = dependencyName.substring(0, 25);
        }
        int spaces = 25 - dependencyName.length();
        System.out.print(dependencyName + ":");
        for(int i=0; i<spaces; i++) {
            System.out.print(" ");
        }
        System.out.println(cls.getModule().getName());
    }

    @XmlRootElement
    public static final class Pojo {

        private String strValue;

        public Pojo() {
        }

        public Pojo(String strValue) {
            this.strValue = strValue;
        }

        @XmlElement
        public String getStrValue() {
            return strValue;
        }

        public void setStrValue(String strValue) {
            this.strValue = strValue;
        }
    }
}
