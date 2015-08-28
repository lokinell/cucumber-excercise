package com.netfinworks.excercise;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = {"json:build/cucumber/json/cucumber.json"},
        glue = {"com.netfinworks.excercise.steps"})
public class CucumberRunner {
    //Do not add anything here
}
