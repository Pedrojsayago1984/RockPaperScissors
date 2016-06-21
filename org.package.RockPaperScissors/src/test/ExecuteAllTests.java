package test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class ExecuteAllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for whole package");
		suite.addTestSuite(TestRock.class);
		suite.addTestSuite(TestPaper.class);
		suite.addTestSuite(TestScissors.class);
		return suite;
	}
}
