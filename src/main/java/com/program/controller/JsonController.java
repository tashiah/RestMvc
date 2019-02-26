package com.program.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.program.model.Shop;

@Controller
@RequestMapping("/brand")
public class JsonController {
	
	@GetMapping(value="/{name}")
	@ResponseBody
	public Shop getShopInJSON(@PathVariable String name) {
		
		Shop shop = new Shop();
		shop.setName(name);
		shop.setStaffName(new String[]{"rb1", "rb2"});
		
		return shop;
	}

}
