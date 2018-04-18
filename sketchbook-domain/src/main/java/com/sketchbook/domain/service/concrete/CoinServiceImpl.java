package com.sketchbook.domain.service.concrete;

import com.sketchbook.domain.converter.CoinConverter;
import com.sketchbook.domain.dto.CoinDto;
import com.sketchbook.domain.entity.Coin;
import com.sketchbook.domain.repository.CoinRepository;
import com.sketchbook.domain.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinServiceImpl implements CoinService {

	@Autowired
	private CoinRepository coinRepository;

	@Override
	public List<CoinDto> findAll() {
		List<Coin> allCoin = coinRepository.findAll();
		return CoinConverter.convertList(allCoin);
	}
}
