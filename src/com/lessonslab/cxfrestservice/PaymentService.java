package com.lessonslab.cxfrestservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/payment")
public interface PaymentService {
	
	@GET
	@Path("/initiate/{amount}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response initiatePayment(@PathParam("amount") String amount);

}
