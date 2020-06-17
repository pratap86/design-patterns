package com.pratap.dp.singleton.assignment;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable{

	private static final long serialVersionUID = 8123095956226311907L;
	
	private static volatile Logger instance;
	
	private Logger() {
		
	}
	
	protected String log(String msg) {
		return msg;
	}
	
	public static Logger getInstance() {
		
		if(instance == null) {
			synchronized (instance) {
				if(instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}
	
	protected Object reatResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
	
	
}
