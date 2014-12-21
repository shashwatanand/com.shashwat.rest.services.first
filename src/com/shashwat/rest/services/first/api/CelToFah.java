package com.shashwat.rest.services.first.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/tempCtoF")
public class CelToFah {

	@GET
	@Produces("application/xml")
	public String convertCtoF() {
		Double cel = 40.2;
		Double fah = ((cel * 9) / 5) + 32;

		String returnStr = "Cel to Fah Output: \n\n" + fah;
		
		return "<tempCtoFService>" + "<celsius>" + cel + "</celsius>"
				+ "<ctof>" + returnStr + "</ctof>"
				+ "</tempCtoFService>";
	}
	
	@Path("{celP}")
	@GET
	@Produces("application/xml")
	public String convertCtoF(@PathParam("celP") Double celP) {
		Double cel = celP;
		Double fah = ((cel * 9) / 5) + 32;

		String returnStr = "Cel to Fah Output: \n\n" + fah;
		
		return "<tempCtoFService>" + "<celsius>" + cel + "</celsius>"
				+ "<ctof>" + returnStr + "</ctof>"
				+ "</tempCtoFService>";
	}

}
