package pom1;

import org.testng.annotations.Test;

public class Execuation {
	@Test
	public static void logout() throws InterruptedException {
		BROWSER.setup();
		Login.login();
	}

}
