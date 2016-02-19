package com.amandrioli.www.http.log.interfaces;

import com.amandrioli.www.http.log.enums.LogLevelEnum;
import com.amandrioli.www.http.log.enums.LogOutputEnum;

public interface InternalLoggerInterface {
	public void setLogLevel(LogLevelEnum level);
	public void setOutput(LogOutputEnum output);
	public void setLocalPath(Class<?> clazz);
	public void debug(String msg);
	public void info(String msg);
	public void warning(String msg);
	public void error(String msg);
	public void setoutputImpl(OutputLoggertInterface implement);
}
