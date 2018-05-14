package RegressionTestSuit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.org.dbserver.helloworld.testcases.LoginTestCase;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTestCase.class
})
public class AllTests {
	@BeforeClass
	public static void init() {
		System.out.println("Iniciando execução...");
	}
	
	@AfterClass
	public static void end() {
		System.out.println("Finalizando.");
	}
}
