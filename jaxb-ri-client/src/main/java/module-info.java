module com.bravehorsie.jaxb.riclient {
    requires java.xml.bind;
    //loads class from implementation modules to print module name.
    requires com.sun.xml.bind;
    requires com.sun.istack.tools;
    requires com.sun.xml.dtdparser;
    requires com.sun.tools.jxc;
    requires com.bravehorsie.jaxb.runner;

}