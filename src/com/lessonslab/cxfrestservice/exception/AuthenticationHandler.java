/**
 * 
 */
package com.lessonslab.cxfrestservice.exception;

import javax.ws.rs.core.Response;

import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

/**
 * @author Satish
 *
 */
public class AuthenticationHandler implements RequestHandler {

	/* (non-Javadoc)
	 * @see org.apache.cxf.jaxrs.ext.RequestHandler#handleRequest(org.apache.cxf.message.Message, org.apache.cxf.jaxrs.model.ClassResourceInfo)
	 */
	@Override
	public Response handleRequest(Message m, ClassResourceInfo arg1) {
		
		  System.out.println(">>>>>>>>AuthenticationHandler Begin...>>>>>>>>>>");
		  AuthorizationPolicy policy = (AuthorizationPolicy)m.get(AuthorizationPolicy.class);
		  if(policy != null){
	        String username = policy.getUserName();
	        String password = policy.getPassword(); 
	        if (true) {
	        	System.out.println("username :: "+username + "  password  :: "+password);
	            // let request to continue
	            return null;
	        } else {
	            // authentication failed, request the authetication, add the realm name if needed to the value of WWW-Authenticate 
	            return Response.status(401).header("WWW-Authenticate", "Basic").build();
	        }
		  }
		  return null;
	}

}
