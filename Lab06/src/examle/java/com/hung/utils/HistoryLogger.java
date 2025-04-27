package examle.java.com.hung.utils;

import examle.java.com.hung.logs.FileLogger;
import examle.java.com.hung.logs.Logger;

public class HistoryLogger {
    private static Logger logger = new FileLogger(); // default dùng FileLogger

    public static void setLogger(Logger customLogger) {
        logger = customLogger;
    }

    public static void log(String commandName) {
        logger.log(commandName);
    }
}
