package org.github.kanedafromparis.circle.ci.quarkus;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/1.0")
public class JsonResource {

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getList() {
        List<String> list =  Arrays.asList("Emmanuel", "Audrey", "Sophie");
        return list;
    }
}