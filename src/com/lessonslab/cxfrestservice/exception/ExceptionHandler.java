/**
 * 
 */
package com.lessonslab.cxfrestservice.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

/**
 * @author Satish
 *
 */
public class ExceptionHandler implements ExceptionMapper<IllegalArgumentException> {

	@Override
	public Response toResponse(IllegalArgumentException arg0) {
		// TODO Auto-generated method stub
		System.out.println("exception to Responnse");
		return Response.status(Status.BAD_REQUEST).header("exception", arg0.getMessage()+" Illegal exception ").build();
	}

}
