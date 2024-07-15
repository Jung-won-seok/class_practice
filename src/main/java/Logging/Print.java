package Logging;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Print {
    static Logger log = LogManager.getLogger(Print.class);
    public static void printMessage(){

        log.info("Print.printMessage (Hello world!)");
        System.out.println("Hello world!");
    }
}
