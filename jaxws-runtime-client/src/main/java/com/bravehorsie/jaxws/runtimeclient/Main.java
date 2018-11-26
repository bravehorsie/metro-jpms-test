package com.bravehorsie.jaxws.runtimeclient;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint publish = Endpoint.publish("http://localhost:8080/countservice", new CountServiceImpl());

        CountService_Service service = new CountService_Service();
        CountService port = service.getCountServicePort();

        int count = port.getCount();
        System.out.println("count = " + count);

        publish.stop();

    }
}
