package com.sketchbook.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "coins", schema = "sketchbook")
public class Coin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "coin_id", nullable = false)
	private Long coinId;

	@Column(name = "coin_name")
	private String coinName;

	@Column(name = "coin_value")
	private Long coinValue;
}
