package browserControl;

import org.junit.After;
import org.junit.Before;



    public class CucumberHooks extends WebConnector {

        @Before
        public void setup() {
            openBrowser();
        }

        @After
        public void teardown() {
            closeBrowser();
        }

    }


