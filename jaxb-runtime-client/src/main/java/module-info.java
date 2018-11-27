module com.bravehorsie.jaxb.runtimeclient {
    requires java.xml.bind;
    //loads class from runtime to show its module.
//    requires com.sun.xml.bind;
    requires com.bravehorsie.jaxb.runner;

    opens com.bravehorsie.jaxb.runtimeclient to java.xml.bind;
}