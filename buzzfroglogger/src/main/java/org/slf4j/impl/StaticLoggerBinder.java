package org.slf4j.impl;

import org.slf4j.ILoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

import com.github.huyyxy.buzzfroglogger.BuzzFrogLoggerFactory;

public class StaticLoggerBinder implements LoggerFactoryBinder {

	private static StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
	
	private BuzzFrogLoggerFactory buzzFrogLoggerFactory = new BuzzFrogLoggerFactory();
	
	public static StaticLoggerBinder getSingleton() {
		return SINGLETON;
	}
	
	@Override
	public ILoggerFactory getLoggerFactory() {
		return buzzFrogLoggerFactory;
	}

	@Override
	public String getLoggerFactoryClassStr() {
		return this.getClass().getName();
	}

}
