package com.regith.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.regith.model.Dealer;
import com.regith.repository.DealerRepository;

@Service
public class DealerService {
	
	@Autowired
	DealerRepository dealerRepository;
	
	public List<Dealer> getAllDealers(){
		List<Dealer> dealerList = new ArrayList<Dealer>();
		dealerRepository.findAll().forEach((dealer) -> dealerList.add(dealer));
		
		return dealerList;
	}
	
	
	public Dealer getDealer(int dealer_id) {
		//System.out.println("dealer id : " + dealerRepository.findById(dealer_id).get());
		if(dealerRepository.existsById(dealer_id)) {
			return dealerRepository.findById(dealer_id).get();
		}else {
			return new Dealer();
		}
	}
	
}
