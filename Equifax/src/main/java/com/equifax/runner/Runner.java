package com.equifax.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.equifax.stepdefinition"}
        ,monochrome = true,
        plugin = {"pretty", "html:target/cucumber.html"}

)

public class Runner  extends AbstractTestNGCucumberTests {

}
