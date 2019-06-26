package com.concrete.categoria.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cupon")
public class CouponController {

	@RequestMapping(method = RequestMethod.GET, value = "listar/todo", produces = "application/json")
	public String getAll() {


		return "";
	}
}
