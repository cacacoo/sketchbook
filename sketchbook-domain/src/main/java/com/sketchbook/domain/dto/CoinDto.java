package com.sketchbook.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CoinDto {
	private Long coinId;
	private String coinName;
	private Long coinValue;
}
