package Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger log = LogManager.getFormatterLogger("demo");

        log.info("System.out.prntln(\"Hello world!\")");
        Print.printMessage();
    }
}