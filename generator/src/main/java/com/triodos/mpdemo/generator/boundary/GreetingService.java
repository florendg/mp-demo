package com.triodos.mpdemo.generator.boundary;

import com.triodos.mpdemo.generator.control.GreetingGenerator;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.opentracing.Traced;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/greet")
public class GreetingService {

    @Inject
    GreetingGenerator generator;

    @GET
    @Traced
    @Counted
    @Path("/{name}")
    public String greet(@PathParam("name") String name) {
        return generator.greet(name);
    }
}
