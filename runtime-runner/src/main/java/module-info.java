module com.bravehorsie.jaxb.runner {
    requires java.xml.bind;
    exports com.bravehorsie.jaxb.runner;

    //reflective access for jaxb
    opens com.bravehorsie.jaxb.runner to java.xml.bind;
}