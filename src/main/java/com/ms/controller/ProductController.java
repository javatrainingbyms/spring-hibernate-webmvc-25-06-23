package com.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ms.entity.Product;
import com.ms.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	//a mapping to show search form
	@RequestMapping("searchform")
	public String showSearchForm() {
		return "search.jsp";
	}
	
	//a mapping to process search
	@RequestMapping("searchproduct")
	public ModelAndView searchProduct(@RequestParam("code") int code) {
		Product product=productService.findById(code);
		System.out.println(product);
		//send it to DispServ (model+view)
		ModelAndView mv=new ModelAndView("product-details.jsp");
		mv.addObject("product", product);
		return mv;
	}
}
