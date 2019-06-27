package com.concrete.categoria.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.concrete.categoria.dto.CategoryThreeDTO;
import com.concrete.categoria.service.CategoryService;
import com.concrete.categoria.service.ConsumeService;
import com.concrete.categoria.service.imp.ConsumeServiceImp;

@RestController
@RequestMapping("/categoria")
public class CategoryController {
	
	@Autowired
	ConsumeService consumeService;
	@Autowired
	CategoryService categoryService;

	@RequestMapping(method = RequestMethod.GET, value = "listar/todo", produces = "application/json")
	public String getAll() {

		
		CategoryThreeDTO  categoryThreeDTO =  consumeService.getCategories();
		
		return "welcome";

		//return ":)";
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "relevante/listar/top-5", produces = "application/json")
	public String getTop5() {

		
		CategoryThreeDTO  categoryThreeDTO =  categoryService.getTop5();
		
		return "welcome";

		//return ":)";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "listar/restantes", produces = "application/json")
	public String getLeft() {

		
		CategoryThreeDTO  categoryThreeDTO =  consumeService.getCategories();
		
		return "welcome";

		//return ":)";
	} 
	
	
	
	/*
	@RequestMapping(method = RequestMethod.GET, value="/breed/{breed}", produces = "application/json")
	public String ByBreed(@PathVariable("breed") String breed) {


		return "";
	}*/
}
