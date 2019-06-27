package com.concrete.categoria.service;

import com.concrete.categoria.dto.CategoryThreeDTO;

public interface CategoryService {
	
	public CategoryThreeDTO getCategories();
	public CategoryThreeDTO getTop5();
	public String getLeftCategories();

}
