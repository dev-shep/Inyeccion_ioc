package com.limoncitoscompany.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.limoncitoscompany.springboot.model.Product;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductWebController {

	@Autowired
	ProductController productController;

	@GetMapping("/")
	public String getAllProducts(Model model) {
		
		List<Product> productsList = productController.getAllProducts();

		model.addAttribute("products", productsList);

		return "list_products";
	}
}
