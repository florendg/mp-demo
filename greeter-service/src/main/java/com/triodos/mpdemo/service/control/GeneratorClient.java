package com.triodos.mpdemo.service.control;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@RegisterRestClient(configKey = "generator")
@Path("greet")
public interface GeneratorClient {

    @GET
    @Path("{name}")
    @Produces(MediaType.TEXT_PLAIN)
    String greet(@PathParam("name") String name);
}
