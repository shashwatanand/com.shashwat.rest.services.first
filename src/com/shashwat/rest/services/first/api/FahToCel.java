package com.shashwat.rest.services.first.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/tempFtoC")
public class FahToCel {

	@GET
	@Produces("application/json")
	public Response convertFtoC() throws JSONException {
		JSONObject jsonObject = new JSONObject();
		Double fah = 90.35;
		Double cel = (fah - 32) * 5 / 9;
		jsonObject.put("Fah Value", fah);
		jsonObject.put("Cel Value", cel);
		
		String returnStr = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(returnStr).build();
	}
	
	@Path("{fah}")
	@GET
	@Produces("application/json")
	public Response convertFtoC(@PathParam("fah") Double fah) throws JSONException {
		JSONObject jsonObject = new JSONObject();
		Double cel = (fah - 32) * 5 / 9;
		jsonObject.put("Fah Value", fah);
		jsonObject.put("Cel Value", cel);
		
		String returnStr = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(returnStr).build();
	}
}
