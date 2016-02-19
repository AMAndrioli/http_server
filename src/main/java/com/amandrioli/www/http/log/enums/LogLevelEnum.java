package com.amandrioli.www.http.log.enums;

public enum LogLevelEnum {
	DEBUG(1, "DEBUG"), 
	INFO(2, "INFO"), 
	WARN(3, "WARNING"), 
	ERROR(4, "ERROR");
	
	private Integer value;
	private String text;
	
	LogLevelEnum(Integer value, String text) {
		this.value = value;
		this.text = text;
	}
	
	@Override
	public String toString() {
		return this.text;
	}
	
	private Integer getValue() {
		return this.value;
	}
	
	public boolean equals(LogLevelEnum other) {
		if (other.getValue() >= this.getValue()) {
			return true;
		} else {
			return false;
		}
	}
}
