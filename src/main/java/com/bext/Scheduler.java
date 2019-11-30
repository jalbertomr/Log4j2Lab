package com.bext;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.apache.logging.log4j.core.*;
import org.apache.logging.log4j.core.appender.AsyncAppender;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.apache.logging.log4j.core.impl.Log4jLogEvent;
import org.apache.logging.log4j.spi.LoggerContextFactory;

import java.util.Iterator;
import java.util.Map;

public class Scheduler {
    final static Logger logger = LogManager.getLogger();
    //final static Logger logger = LogManager.getLogger( Scheduler.class);   // same

    public static void main(String... args) {
        LoggerContext loggerContext = LoggerContext.getContext();

        System.out.println( String.format("logger.getName(), getLevel() = %s, %s", logger.getName(), logger.getLevel()));  //com.bext.Scheduler
        System.out.println( "loggerContext.getName(): " + loggerContext.getName()); // Default
        System.out.println( "Congifuration.toString(): " + LoggerContext.getContext().getConfiguration().toString());
        //Configurator.setRootLevel( Level.ALL);
        logger.trace("Scheduler  [...");
        if (!logger.isTraceEnabled()) System.out.println("Scheduler Trace is Disabled");
        if (!logger.isInfoEnabled()) System.out.println("Scheduler Info id Disabled");
        if (!logger.isDebugEnabled()) System.out.println("Scheduler Debug is Disabled");
        if (!logger.isWarnEnabled()) System.out.println("Scheduler Warn is Disabled");
        if (!logger.isErrorEnabled()) System.out.println("Scheduler Error is Disabled");
        if (!logger.isFatalEnabled()) System.out.println("Scheduler Fatal is Disabled");
        logger.debug("Scheduler logging debug");
        logger.info("Scheduler logging info");
        logger.warn("Scheduler logging warn ");
        logger.error("Scheduler logging error ");
        logger.fatal("Scheduler logging fatal ");

        ServiceA serviceA = new ServiceA();
        serviceA.info();

        logger.trace("Scheduler  ...]");

    }
}
