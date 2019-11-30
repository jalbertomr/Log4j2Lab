package com.bext;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.spi.LoggerContext;


public class ServiceA {
    final static Logger logger = LogManager.getLogger( ServiceA.class);

    public String info() {

        logger.trace("ServiceA.info()  [...");
        if (!logger.isTraceEnabled()) System.out.println("ServiceA Trace is Disabled");
        if (!logger.isInfoEnabled()) System.out.println("ServiceA Info id Disabled");
        if (!logger.isDebugEnabled()) System.out.println("ServiceA Debug is Disabled");
        if (!logger.isWarnEnabled()) System.out.println("ServiceA Warn is Disabled");
        if (!logger.isErrorEnabled()) System.out.println("ServiceA Error is Disabled");
        if (!logger.isFatalEnabled()) System.out.println("ServiceA Fatal is Disabled");
        logger.debug("logging debug");
        logger.info("logging info");
        logger.warn("logging warn ");
        logger.error("logging error ");
        logger.fatal("logging fatal ");
        logger.trace("ServiceA.info()  ...]");
        return "MessageSerivice.info Junit5";
    }
}
