import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Generates several log messages to test Log4j2 setup.
 */
public class LoggerSetup {

	/**
	 * Outputs all levels of messages to a logger.
	 *
	 * @param log the logger to use
	 */
	public static void outputMessages(Logger log) {
		log.trace("Tucan");
		log.debug("Dodo");
		log.info("Ibis");
		log.warn("Wren");
		log.error("Egret", new Exception("Eagle"));
		log.catching(Level.FATAL, new RuntimeException("Finch"));
	}

	/**
	 * Generates several log messages to two different loggers.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) {
		outputMessages(LogManager.getLogger());
		outputMessages(LogManager.getRootLogger());
	}

}
