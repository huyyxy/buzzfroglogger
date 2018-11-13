package com.github.huyyxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger slf4jLogger = LoggerFactory.getLogger(App.class);
        slf4jLogger.debug("Hello world!");
    }
}
