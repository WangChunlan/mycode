package com.smartpos.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


public class LogUtils {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogUtils.class);

    public static void info(String message) {
        LOGGER.info(message);
    }

    public static void warn(String message) {
        LOGGER.warn(message);
    }

    public static void error(String errorMessage, String className, String methodName, String exceptionClassName, String exceptionMessage, Map<String, String> parameters) {
        LOGGER.error("{}:{}.{}-{}-{}-{}", errorMessage, className, methodName, exceptionClassName, exceptionMessage, parameters);
    }

    public static void error(String errorMessage, String className, String methodName, String exceptionClassName, String exceptionMessage) {
        LOGGER.error("{}:{}.{}-{}-{}", errorMessage, className, methodName, exceptionClassName, exceptionMessage);
    }

    public static void error(String errorMessage, String className, String methodName, Throwable throwable, Map<String, String> parameters) {
        LOGGER.error("{}:{}.{}-{}-{}-{}", errorMessage, className, methodName, throwable.getClass().getName(), throwable.getMessage(), parameters);
    }

    public static void error(String errorMessage, String className, String methodName, Throwable throwable) {
        LOGGER.error("{}:{}.{}-{}-{}", errorMessage, className, methodName, throwable.getClass().getName(), throwable.getMessage());
    }

    public static void error(String errorMessage, String className, String methodName, Throwable throwable, Object parameters) {
        LOGGER.error("{}:{}.{}-{}-{}-{}", errorMessage, className, methodName, throwable.getClass().getName(), throwable.getMessage(), parameters);
    }

    public static void error(String errorMessage) {
        LOGGER.error(errorMessage);
    }
}
