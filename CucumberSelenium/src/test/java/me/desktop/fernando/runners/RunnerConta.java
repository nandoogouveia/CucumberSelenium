package me.desktop.fernando.runners;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/inserir_conta.feature",
		glue = "me.desktop.fernando.steps",
		tags = {},
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)


public class RunnerConta {
	
	@BeforeClass 
	public static void reset() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Fernando\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seubarriga.wcaquino.me");
		driver.findElement(By.id("email")).sendKeys("batata@batata.com");
		driver.findElement(By.name("senha")).sendKeys("batatafrit@");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
		
	}
	

}
