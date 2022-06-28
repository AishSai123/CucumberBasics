package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/LoginDemo.feature",glue= {"stepdefinitions"},
monochrome = true,
plugin= {"pretty","junit:target/JnuitReports/report.xml","json:target/JSONReports/report.json","html:target/HtmlReports/htmlreport"}
)
public class Runner {

}
