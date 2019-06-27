package com.concrete.categoria.service.imp;

import java.util.Collection;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.concrete.categoria.dto.CategoryThreeDTO;
import com.concrete.categoria.dto.CouponDTO;
import com.concrete.categoria.service.ConsumeService;
import com.concrete.categoria.utils.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type; 

@Component 
public class ConsumeServiceImp implements ConsumeService{
	
	@Cacheable("categories")
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

	@Cacheable("coupons")
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
