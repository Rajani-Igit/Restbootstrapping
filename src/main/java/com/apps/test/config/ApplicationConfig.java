package com.apps.test.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;

import com.apps.test.resources.TestResources;

public class ApplicationConfig extends ResourceConfig{
	
	public ApplicationConfig() {
		System.out.println("Resource Config");
		register(TestResources.class);
	}
/*@Override
public Set<Class<?>> getClasses() {
	// TODO Auto-generated method stub
	Set set=new HashSet();
	set.add(TestResources.class);
	return set;
}
@Override
	public Set<Object> getSingletons() {
		// TODO Auto-generated method stub
		return super.getSingletons();
	}*/
	
}
