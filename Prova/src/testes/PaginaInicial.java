package testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginaInicial extends PageObject{

	@FindBy(id="suggestion-search")
	private WebElement campoPesquisa;
	
	@FindBy(xpath="//*[@id=\'site-topbar\']/div[2]/form/button")
	private WebElement btnPesquisa;
	
	
	public PaginaInicial(WebDriver driver) {
		super(driver);
	}
	
	public void enterPesquisa(String campoPesquisa) {
		this.campoPesquisa.clear();
		this.campoPesquisa.sendKeys(campoPesquisa);
	}
	
	public void clickPesquisa() {
		this.btnPesquisa.click();
	}
}

