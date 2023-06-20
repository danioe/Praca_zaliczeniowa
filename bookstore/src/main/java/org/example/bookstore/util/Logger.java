package org.example.bookstore.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logger {
    private static final Logger logger = LogManager.getLogger(Logger.class);

    public static void logInfo(String message) {
        logger.info(message);
    }

    public static void logError(String message) {
        logger.error(message);
    }
}