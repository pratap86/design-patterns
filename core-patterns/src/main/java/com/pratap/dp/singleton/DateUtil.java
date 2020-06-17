package com.pratap.dp.singleton;

import java.io.Serializable;
/**
 * <p>A singleton (lazy and eager) class must support multithreading, serialization & clone </>
 * @author 835698
 *
 */
public class DateUtil implements Serializable, Cloneable {

	private static final long serialVersionUID = -1998880230310678006L;
	
	private static volatile DateUtil instance;
	
	private DateUtil() {
		
	}
	
	public static DateUtil getInstance() {

		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new CloneNotSupportedException();
	}
	
	
}
