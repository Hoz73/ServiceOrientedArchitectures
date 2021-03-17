package com.example.ServiceREST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hello-world/{userName}")
public class HelloResource {
    /*
    @GET
    @Produces("application/json")
    public String hello() {
        return "Hello, World test!";
    }*/

    @GET
    @Produces("application/json")
    public String hello2(@PathParam("userName") String test) {
        return "Hello,"+ test ;
    }
}