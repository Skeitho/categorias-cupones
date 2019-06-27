package com.concrete.categoria.utils;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;

import org.junit.Test;

public class UtilsTest {

	@Test
	public void testGetResponse() {
		Utils util = new Utils();
		String answer = null;
		
		try {
			answer = util.getResponse("https://cs-hsa-api-coupons.herokuapp.com/coupons");
			assertNotNull(answer);	
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			assertNotNull(answer);
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			assertNotNull(answer);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			assertNotNull(answer);
		}
		
	}

}
