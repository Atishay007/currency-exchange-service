package com.spring.limits.microservices.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.limits.microservices.entity.ExchangeVO;

@RestController
public class CurrencyExchangeController {

	@Value("${server.port}")
	private int port;

	@GetMapping("exchangeService/from/{from}/to/{to}")
	public ExchangeVO getConversion(@PathVariable String from, @PathVariable String to) {
		ExchangeVO exchangeVO = new ExchangeVO("inr", "usd", 10, 73l);
		exchangeVO.setPort(port);
		return exchangeVO;
	}
}
