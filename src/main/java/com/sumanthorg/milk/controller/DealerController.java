package com.sumanthorg.milk.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumanthorg.milk.model.Dealer;

@RestController
public class DealerController {
	
	@RequestMapping("/dealers")
	public List<Dealer> getDealers() {
		Dealer d1 = new Dealer();
		d1.setId(1);
		d1.setName("Ram");
		
		Dealer d2 = new Dealer();
		d2.setId(2);
		d2.setName("Krishna");
		
		List<Dealer> dealers = Arrays.asList(d1, d2);//new ArrayList<>(d1, d2);
		return dealers;
	}
	
	public Dealer getDealerById() {
		
		return null;
	}
	
	public boolean addDealer() {
		
		return false;
	}

}
