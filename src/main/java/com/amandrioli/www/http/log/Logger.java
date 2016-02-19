package com.amandrioli.www.http.log;

import com.amandrioli.www.http.log.enums.LogLevelEnum;
import com.amandrioli.www.http.log.enums.LogOutputEnum;
import com.amandrioli.www.http.log.interfaces.InternalLoggerInterface;
import com.amandrioli.www.http.log.interfaces.OutputLoggertInterface;

public class Logger implements InternalLoggerInterface {
	
	private static InternalLoggerInterface instance = null;
	
	private LogLevelEnum level;
	private LogOutputEnum output;
	private OutputLoggertInterface outputImpl;
	private String localPath = "";
	
	private static InternalLoggerInterface getInstace() {
		if (instance == null) {
			instance = new Logger();
			instance.setoutputImpl(OutputImplementFactory.getImplement(LogOutputEnum.STDTXT));
		}
		
		return instance;
	}
	
	public void setoutputImpl(OutputLoggertInterface outImpl) {
		this.outputImpl = outImpl;
	}
	
	private Logger() {}
	
	public void setLogLevel(LogLevelEnum level) {
		this.level = level;
	}

	public void setOutput(LogOutputEnum output) {
		this.output = output;
	}

	public void setLocalPath(Class<?> clazz) {
		this.localPath = clazz.getName();
	}

	public void debug(String msg) {
		
	}

	public void info(String msg) {
		
	}

	public void warning(String msg) {
		
	}

	public void error(String msg) {
		
	}

}