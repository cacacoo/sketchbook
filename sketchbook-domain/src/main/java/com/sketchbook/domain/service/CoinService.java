package com.sketchbook.domain.service;

import com.sketchbook.domain.dto.CoinDto;

import java.util.List;

public interface CoinService {
	List<CoinDto> findAll();
}
