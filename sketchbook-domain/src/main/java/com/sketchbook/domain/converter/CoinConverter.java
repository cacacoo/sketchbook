package com.sketchbook.domain.converter;

import com.sketchbook.domain.dto.CoinDto;
import com.sketchbook.domain.entity.Coin;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CoinConverter {

	public static List<CoinDto> convertList(List<Coin> in) {
		if (CollectionUtils.isEmpty(in)) {
			return new ArrayList<>();
		}
		return in.stream().map(CoinConverter::convert).collect(Collectors.toList());
	}

	private static CoinDto convert(Coin in) {
		if (Objects.isNull(in)) {
			return null;
		}

		return CoinDto.builder()
			.coinId(in.getCoinId())
			.coinName(in.getCoinName())
			.coinValue(in.getCoinValue())
			.build();
	}
}
