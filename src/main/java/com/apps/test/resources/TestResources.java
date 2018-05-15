package com.apps.test.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/demo")
public class TestResources  {
	public TestResources() {
		System.out.println("TestResources Constructor");
	}
	
	@GET
	public Response demotest(@QueryParam("name") String name,@QueryParam("age") int age) {
		
		return Response.ok("Succes").build();
		
	}

}
