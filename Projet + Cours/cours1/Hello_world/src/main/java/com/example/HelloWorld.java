package com.example;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
/**
 * Created by David on 27/01/2017.
 */
@WebService()
public class HelloWorld {
    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }
    @WebMethod
    public int addition (int a, int b){
        return a + b;
    }

}
