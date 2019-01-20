package com.spring.limits.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.limits.microservices.entity.ExchangeDTO;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<ExchangeDTO, Long> {
	public ExchangeDTO findByToAndFrom(String to, String from);
}
