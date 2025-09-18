package org.freecodecamp.app.model;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;

@Path("/")
public class FilmResource {

    @GET
    @Path("/helloword")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello World!";
    }


    @GET
    @Path("/helloword/2")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello2() {
        return "Java Toto !";
    }
}
