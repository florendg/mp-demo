package com.triodos.mpdemo.service.boundary;

import com.triodos.mpdemo.service.control.GeneratorClient;
import org.eclipse.microprofile.metrics.annotation.Metered;
import org.eclipse.microprofile.opentracing.Traced;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/greeter")
public class GreetingService {

    @Inject
    @RestClient
    GeneratorClient generatorClient;

    @GET
    @Traced
    @Metered
    @Path("/{name}")
    public String greet(@PathParam("name") String name) {
        return generatorClient.greet(name);
    }
}
