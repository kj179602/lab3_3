package edu.iis.mto.time;

import static org.junit.Assert.*;

import org.junit.Test;

import org.joda.time.DateTime;
import org.junit.Test;

public class OrderTest {

	@Test(expected = OrderExpiredException.class)
	public void testConfirm_expectedOrderExpiredException(){
	
	
		Order order = new Order(new DateTime().plusDays(2));
		order.submit();
		order.confirm();
	}

}