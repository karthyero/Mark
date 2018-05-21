package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/java/features/lgoin.feature"},glue= {"steps","pages"},monochrome=true)

public class RunTest {

}
