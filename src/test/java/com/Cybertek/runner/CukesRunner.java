package com.Cybertek.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       features = "src/test/resources/features" ,
        glue = "com/Cybertek/step_definition",
        dryRun = false,
        tags = "@login"
)
public class CukesRunner {
}
