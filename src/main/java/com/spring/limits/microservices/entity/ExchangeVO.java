package com.spring.limits.microservices.entity;

public class ExchangeVO {

	private String from;
	private String to;
	private int id;
	private long conversion;
	private int port;

	public ExchangeVO() {
		super();
	}

	public ExchangeVO(String from, String to, int id, long conversion) {
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getConversion() {
		return conversion;
	}

	public void setConversion(long conversion) {
		this.conversion = conversion;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
