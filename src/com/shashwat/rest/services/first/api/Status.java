package com.shashwat.rest.services.first.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
public class Status {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getTitle() {
		return "<p>Shashwat REST Service</p>";
	}

}
