package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "wip"
)
public class CukesRunner {
}


/*
- How do we use different tags together?

- or :
    - "or" keyword can be used for checking condition
    - when we use or, we are being LESS specific, less selective
    - if either one of the tags are matching, the scenario or feature will be executed
    - or is like || in java.
    - if either one of the sides are matching, it will execute the scenario or feature file.

- and
    - "and" keyword can be used for checking conditions as well
    - when we use "and" keyword, we are being MORE specific
    - "and" is similar to "&&" in java
    - the tags on the both side has to be matching for a scenario or feature to be executed

- and not
    - "and not" keyword can be used for excluding conditions

    @Regression and not @student
 */
