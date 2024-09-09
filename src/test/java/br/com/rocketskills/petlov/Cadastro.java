package br.com.rocketskills.petlov;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


class Cadastro {

	@Test
	@DisplayName("Deve Poder cadastrar um ponto de doação")
	void createPoint() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://petlov.vercel.app/signup");

		WebElement title = driver.findElement(By.cssSelector("h1"));

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(d -> title.isDisplayed());


		assertEquals("Conectando corações, mudando vidas!", title.getText(), "Verificando o Slogan");
		
		driver.close();
	}
}
