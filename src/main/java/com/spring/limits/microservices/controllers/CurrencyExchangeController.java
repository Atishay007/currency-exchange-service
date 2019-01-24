package com.spring.limits.microservices.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.limits.microservices.entity.ExchangeDTO;
import com.spring.limits.microservices.repository.CurrencyExchangeRepository;

@RestController
public class CurrencyExchangeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyExchangeController.class);

	@Value("${server.port}")
	private int port;

	@Autowired
	private CurrencyExchangeRepository repo;

	@GetMapping("exchangeService/from/{from}/to/{to}")
	public ExchangeDTO getConversion(@PathVariable String from, @PathVariable String to) {
		ExchangeDTO exchangeDTO = repo.findByToAndFrom(to, from);
		exchangeDTO.setPort(port);
		LOGGER.info("{}", exchangeDTO);
		return exchangeDTO;
	}
}
