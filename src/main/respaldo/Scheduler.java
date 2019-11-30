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
    final static Logger logger = LogManager.getLogger( Scheduler.class);

    public static void main(String... args) {

        LoggerContext loggerContext = LoggerContext.getContext();
        Logger otroLogger = loggerContext.getLogger("com.bext");

        //Configurator.setRootLevel( Level.ALL);
/*
        Map<String, LoggerConfig> loggers = LoggerContext.getContext().getConfiguration().getLoggers();
        for (Map.Entry logger: loggers.entrySet()) {
            System.out.println("logger key: " + logger.getKey());
            System.out.println("logger level: " + ((LoggerConfig) logger.getValue()).getLevel());
            System.out.println("logger Appenders: " + ((LoggerConfig) logger.getValue()).getAppenders().toString());
            System.out.println("logger Filters: " + ((LoggerConfig) logger.getValue()).getFilter().toString());
        }
        Iterator iter = loggers.entrySet().iterator();
        while (iter.hasNext()){
            Object e = iter.next();
            System.out.println("LOGGER: " + e.toString());
        }
        Map<String, Appender> appenders = LoggerContext.getContext().getConfiguration().getAppenders();
        for (Map.Entry appender : appenders.entrySet()){
            System.out.println( "APPENDER: " + appender.getKey().toString() + ((Appender) appender.getValue()).toString());
            System.out.println( "Layout type: "  + ((Appender) appender.getValue()).getLayout().getContentType() );
            Map<String, String> appContFormat = ((Appender) appender.getValue()).getLayout().getContentFormat();
            for (Map.Entry appElem : appContFormat.entrySet()) {
                System.out.println( "Layout ContentFormat: " + appElem.toString());
            }
        }
*/
        ThreadContext.put("test", "123");
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
