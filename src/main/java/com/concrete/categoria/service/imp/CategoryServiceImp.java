package com.concrete.categoria.service.imp;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.concrete.categoria.dto.CategoryDTO;
import com.concrete.categoria.dto.CategoryThreeDTO;
import com.concrete.categoria.dto.SubcategoryLevel2DTO;
import com.concrete.categoria.service.CategoryService;
import com.concrete.categoria.service.ConsumeService;


@Component
public class CategoryServiceImp implements CategoryService {

	@Autowired
	ConsumeService consumeService;
	
	public CategoryThreeDTO getCategories() {
		return consumeService.getCategories();
	}
	
	public CategoryThreeDTO getTop5() {
		
		CategoryThreeDTO categoryThreeDTO = consumeService.getCategories();
		CategoryDTO categoriesDTO = categoryThreeDTO.getSubcategories()[0];
		SubcategoryLevel2DTO[] subcategoryLevel2DTO = categoriesDTO.getSubcategories();
		
		Arrays.sort(subcategoryLevel2DTO, 
				(a,b) -> ((b.getRelevance() == null) ? (Integer)0 : b.getRelevance()).compareTo( (a.getRelevance() == null) ? 0 : a.getRelevance() )
				
				);		
		subcategoryLevel2DTO = Arrays.copyOfRange(subcategoryLevel2DTO, 0, 5);
				
		categoriesDTO.setSubcategories(subcategoryLevel2DTO);
		categoryThreeDTO.getSubcategories()[0] = categoriesDTO;
		
		return categoryThreeDTO;
		
	}

	@Override
	public String getLeftCategories() {

		CategoryThreeDTO categoryThreeDTO = consumeService.getCategories();
		CategoryDTO categoriesDTO = categoryThreeDTO.getSubcategories()[0];
		SubcategoryLevel2DTO[] subcategoryLevel2DTO = categoriesDTO.getSubcategories();
		
		Arrays.sort(subcategoryLevel2DTO, 
				(a,b) -> ((b.getRelevance() == null) ? (Integer)0 : b.getRelevance()).compareTo( (a.getRelevance() == null) ? 0 : a.getRelevance() )
				
				);		
		subcategoryLevel2DTO = Arrays.copyOfRange(subcategoryLevel2DTO, 5, subcategoryLevel2DTO.length);
				
		categoriesDTO.setSubcategories(subcategoryLevel2DTO);
		categoryThreeDTO.getSubcategories()[0] = categoriesDTO;
		
		return "-";
	}
	
	
	

	
}
