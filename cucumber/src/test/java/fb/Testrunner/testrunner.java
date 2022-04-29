package fb.Testrunner;

import org.testng.annotations.*;

import JVM.report.FBreport;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Alex\\.eclipse\\cucumber\\src\\test\\resources\\fb.feature",glue="fb.stepdef", monochrome= true,
                 plugin= {"pretty",
                		 "html:C:\\Users\\Alex\\.eclipse\\cucumber\\target",
                		 "json:C:\\Users\\Alex\\.eclipse\\cucumber\\target\\sample.jason",
                		 "junit:C:\\Users\\Alex\\.eclipse\\cucumber\\target\\sample.xml"}, snippets=SnippetType.CAMELCASE)
public class testrunner {
  @AfterClass
  public static void afterClass() {
	  FBreport.generatingJVMReport("C:\\Users\\Alex\\.eclipse\\cucumber\\target\\sample.jason");
  
  
  }
}
	
