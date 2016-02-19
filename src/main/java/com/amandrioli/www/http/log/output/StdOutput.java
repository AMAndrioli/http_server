package com.amandrioli.www.http.log.output;

import com.amandrioli.www.http.log.interfaces.OutputLoggertInterface;

public class StdOutput implements OutputLoggertInterface {

	public void print(String msg) {
		System.out.println(msg);
	}

}