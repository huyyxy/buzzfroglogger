package com.github.huyyxy.buzzfroglogger;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;

public class BuzzFrogLoggerFactory implements ILoggerFactory{
	private BuzzFrogLogger logger = new BuzzFrogLogger();

	@Override
	public Logger getLogger(String name) {
		/**
		 * 使用BuzzFrogLogger
		 */
		return logger;
	}

}
