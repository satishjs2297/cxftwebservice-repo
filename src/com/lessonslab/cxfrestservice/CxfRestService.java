package com.lessonslab.cxfrestservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * 
 * @author lessonslab.com
 * This is interface for the employee services
 *
 */
@Path("/")
public interface CxfRestService 
{
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Path("/getemployeedetail")
	public Response getEmployeeDetail(@QueryParam("employeeId") String employeeId);
	
}
