package testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginaPesquisa extends PageObject {
	
	public PaginaPesquisa(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id=\'product-list\']/section/ul/li[1]/section/a/span")
	private WebElement enterElemento;
	
	@FindBy(xpath="//*[@id=\'main\']/h1")
	private WebElement checkPesquisa;
	
	public void clickElemento() {
		this.enterElemento.click();
	}
	
	public String checkElemento () {
		return this.checkPesquisa.getText();
	}

}
