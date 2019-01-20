package com.spring.limits.microservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "exchange_detail")
@Table(name = "EXCHANGE_DETAIL")
public class ExchangeDTO {

	@Id
	private Long id;

	@Column(name = "CURRENCY_FROM")
	private String from;

	@Column(name = "CURRENCY_TO")
	private String to;

	@Column(name = "CURRENCY_CONVERSION")
	private Long conversion;

	@Transient
	private int port;

	public ExchangeDTO() {
		super();
	}

	public ExchangeDTO(Long id, String from, String to, Long conversion) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversion = conversion;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getConversion() {
		return conversion;
	}

	public void setConversion(Long conversion) {
		this.conversion = conversion;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
