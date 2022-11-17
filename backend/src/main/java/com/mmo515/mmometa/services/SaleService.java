package com.mmo515.mmometa.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.mmo515.mmometa.dto.SaleDTO;
import com.mmo515.mmometa.entities.Sale;
import com.mmo515.mmometa.repositories.SaleRepository;
import com.mmo515.mmometa.services.exceptions.ObjectNotFoundException;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable) {
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault());
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate);
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);
		
		return saleRepository.findSales(min, max, pageable);
	}
	
	public Sale find(Long id) {
		Optional<Sale> obj = saleRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Sale.class.getName()));
	}
	
	public Sale insert(Sale obj) {
		obj.setId(null);
		return saleRepository.save(obj);
	}
	
	public Sale fromDTO(SaleDTO objDTO) {
		return new Sale(objDTO.getId(), objDTO.getSellerName(), objDTO.getVisited(), objDTO.getDeals(),
				objDTO.getAmount(), objDTO.getDate());
	}
	
}
 