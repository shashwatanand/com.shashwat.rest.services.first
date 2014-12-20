package com.shashwat.rest.services.first.api;

import javax.ws.rs.Path;

@Path("/tempCtoF")
public class CelToFah {

	public String convertCtoF() {
		double cel = 40.2;
		double fah = ((cel * 9) / 5) + 32;

		String returnStr = "@Produces(\"application/xml\") Cel to Fah Output: \n\n" + fah;
		
		return "<tempCtoFService>" + "<celsius>" + cel + "</celsius>"
				+ "<ctof>" + returnStr + "</ctof>"
				+ "</tempCtoFService>";
	}

}
