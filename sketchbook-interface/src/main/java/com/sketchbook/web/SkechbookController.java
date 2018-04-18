package com.sketchbook.web;

import com.sketchbook.domain.dto.CoinDto;
import com.sketchbook.domain.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SkechbookController {

	@Autowired
	private CoinService coinService;

	@RequestMapping("/coin/all")
	public List<CoinDto> findAll() {
		return coinService.findAll();
	}

}
