package com.mmo515.mmometa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmo515.mmometa.entities.Sale;
import com.mmo515.mmometa.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	public List<Sale> findSales() {
		return saleRepository.findAll();
	}
}
