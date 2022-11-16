package com.mmo515.mmometa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mmo515.mmometa.entities.Sale;
import com.mmo515.mmometa.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	@Autowired
	SaleService saleService;
	
	@GetMapping
	public List<Sale> findSales(){
		return saleService.findSales();
	}
}
