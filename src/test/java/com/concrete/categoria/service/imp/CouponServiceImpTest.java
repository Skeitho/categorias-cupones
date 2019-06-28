 package com.concrete.categoria.service.imp;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

import com.concrete.categoria.dto.CouponDTO;
import com.concrete.categoria.service.ConsumeService;

public class CouponServiceImpTest {

	@Test
	public void testGetCoupons() {
		
		
	}

	@Test
	public void testGetNotExpiredCoupons() {
		

	}
	
	@Test
	public void testGetNotExpiredCouponsSubMethod() {
		
		Collection<CouponDTO> coupons = new ArrayList<CouponDTO>();
		
		CouponDTO couponGood1 = new CouponDTO("1","Cupon1","Me","Image","2056-12-12");
		CouponDTO couponBad1 = new CouponDTO("2","Cupon2","Me","Image","2016-12-12");
		CouponDTO couponGood2 = new CouponDTO("3","Cupon3","Me","Image","2033-04-03");
		
		coupons.add(couponGood1);
		coupons.add(couponBad1);
		coupons.add(couponGood2);
		
		CouponServiceImp csi = new CouponServiceImp();
		coupons = csi.getNotExpiredCoupons(coupons);
		
		assertEquals("Filtro por feca de expiracion?", 2, coupons.size());
		
		
		
		
	}
	
	

}
