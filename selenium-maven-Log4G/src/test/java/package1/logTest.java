package package1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logTest {

	public static void main(String[] args) {

		Logger log = LogManager.getLogger(logTest.class.getName());

		log.debug("I am logging"); // When each selenium action is perfomed like click(), sendKeys(), getText()

		log.info("Object is present"); // When operation is succesfully completed. exp. After loading page

		log.debug("starting");

		if (0 > 2) {
			log.info("Object is present");
		} else {
			log.error("Object is not present");
		}

	}

}
