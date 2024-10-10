package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
glue={"stepDefinitions"},
tags="@Smoke",
plugin={"pretty","html:target/cucmber.html"})
public class Runner extends AbstractTestNGCucumberTests {

}

//mvn test -Dcucumber.filter.tags="@smoke"
//mvn clean
//mvn test
