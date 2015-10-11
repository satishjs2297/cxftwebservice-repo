package com.lessonslab.cxfrestservice.internal;

import javax.ws.rs.core.Response;

import com.lessonslab.cxfrestservice.PaymentService;

public class PaymentServiceImpl implements PaymentService{

	@Override
	public Response initiatePayment(String amount) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>initiatePayment >>>>>>>>>>>>>>>>>>");
		//if(true)
			//throw new IllegalArgumentException("amount was invalid...");
		return Response.ok("Payment "+amount + " was successful").build();
	}

}
