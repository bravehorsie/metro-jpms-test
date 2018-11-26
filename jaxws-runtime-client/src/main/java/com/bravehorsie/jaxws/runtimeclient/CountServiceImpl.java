package com.bravehorsie.jaxws.runtimeclient;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.bravehorsie.jaxws.runtimeclient.CountService")
public class CountServiceImpl implements CountService {

    @WebMethod
    @Override
    public int getCount() {
        return 35;
    }
}
