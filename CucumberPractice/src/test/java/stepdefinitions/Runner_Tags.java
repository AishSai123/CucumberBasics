package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature_withTags",glue= {"stepdefinitions"},
tags = " not @regression")

public class Runner_Tags {

}
