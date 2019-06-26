package com.concrete.categoria.service;

import java.util.Collection;

import com.concrete.categoria.dto.CategoryThreeDTO;
import com.concrete.categoria.dto.CouponDTO;
import com.concrete.categoria.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type; 

public class ConsumeService {
	
	
	public CategoryThreeDTO getCategories() {

		String urlEnv="https://cs-hsa-api-categories.herokuapp.com/categories";
		
		CategoryThreeDTO categoryThreeDTO = null;
		Utils util= new Utils();

		try {
			
			String response = util.getResponse(urlEnv);
			
			categoryThreeDTO = new Gson().fromJson(response, CategoryThreeDTO.class);

			return categoryThreeDTO;

		} catch (Exception e) {
			System.out.println("Exception in Calling API:- " + e);
		}

		return categoryThreeDTO;
	}

	
	public Collection<CouponDTO> getCoupons() {
	
		String urlEnv="https://cs-hsa-api-coupons.herokuapp.com/coupons";
		
		Collection<CouponDTO> couponDTO = null;
		Utils util= new Utils();

		try {
			
			String response = util.getResponse(urlEnv);
			
			Type collectionType = new TypeToken<Collection<CouponDTO>>(){}.getType();
			couponDTO = new Gson().fromJson(response, collectionType);
			
			//couponDTO[] couponDTO = new Gson().fromJson(response, couponDTO[].class);


			return couponDTO;

		} catch (Exception e) {
			System.out.println("Exception in Calling API:- " + e);
		}

		return couponDTO;
	}

}
