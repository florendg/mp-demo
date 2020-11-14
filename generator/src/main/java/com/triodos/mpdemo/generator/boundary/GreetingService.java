package com.triodos.mpdemo.generator.boundary;

import com.triodos.mpdemo.generator.control.GreetingGenerator;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.opentracing.Traced;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greet")
public class GreetingService {

    @Inject
    GreetingGenerator generator;

    @GET
    @Traced
    @Counted
    @Path("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greet(@PathParam("name") String name) {
        return generator.greet(name);
    }
}
