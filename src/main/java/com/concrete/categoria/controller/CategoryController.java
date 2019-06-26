package com.concrete.categoria.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoryController {

	@RequestMapping(method = RequestMethod.GET, value = "listar/todo", produces = "application/json")
	public String getAll() {


		return "";
	}
	
	/*
	@RequestMapping(method = RequestMethod.GET, value="/breed/{breed}", produces = "application/json")
	public String ByBreed(@PathVariable("breed") String breed) {


		return "";
	}*/
}
