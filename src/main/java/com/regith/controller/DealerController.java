package com.regith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.regith.model.Dealer;
import com.regith.service.DealerService;

@RestController
@RequestMapping("/eshop/")
public class DealerController {
	
	@Autowired
	DealerService dealerService;
	
	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("dealers")
	public List<Dealer> getAllDealers() {
		return dealerService.getAllDealers();
	}

	@GetMapping("dealers/{dealer_id}")
	public Dealer getDealer(@PathVariable("dealer_id") int dealer_id) {
		return dealerService.getDealer(dealer_id);
	}
}
