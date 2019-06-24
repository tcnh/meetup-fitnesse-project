package nl.praegus;

import fitnesse.junit.FitNesseRunner;
import nl.praegus.fitnesse.junit.runner.ToolchainTestRunner;
import org.junit.runner.RunWith;

/**
 * Test class to allow fixture code to be debugged, or run by build server.
 */
@RunWith(ToolchainTestRunner.class)
@FitNesseRunner.Suite("TesterChallenge.ClickInLennardBug")
public class FixtureDebugTest {
}
