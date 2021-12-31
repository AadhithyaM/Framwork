package com.runner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","json:src/test/resources/out.json"},features= {"src/main/resources"},glue= {"com.stepDifinition"},strict=true,monochrome=true,dryRun=false,snippets=SnippetType.CAMELCASE)

public class TestRunnerClass {
@AfterClass

private void afterclass() {
	String path=System.getProperty("user.dir");
	Reporting reporting=new Reporting();
	reporting.generateJvmReport(path+"\\src\\test\\resoures\\Reports\\out.json");
}

}
