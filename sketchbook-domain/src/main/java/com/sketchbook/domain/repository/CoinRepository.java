package com.sketchbook.domain.repository;

import com.sketchbook.domain.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin, Long> {
}
