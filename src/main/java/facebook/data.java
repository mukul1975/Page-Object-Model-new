package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class data {
	WebDriver driver;
	
	
By email=By.xpath("//input[@name='email']");

public void name1(String name)
{
	driver.findElement(email).sendKeys(name);
}

@FindBy(css="[name='pass']")
WebElement pass;

public void pass1(String text)
{
	pass.sendKeys(text);
}

@FindBy(how=How.CSS,using="[name='firstname']")
WebElement fname;
public void ftname1(String text)
{
	fname.sendKeys(text);
}

@FindBy(css="[name='lastname']")
WebElement lname;
public void lname1(String text)
{
	lname.sendKeys(text);
}

@FindBy(how=How.XPATH,using="//input[@name='reg_email__']")
WebElement mobile;
public void mobile1(String text)
{
	mobile.sendKeys(text);
}

@FindBy(how=How.XPATH,using="//input[@name='reg_passwd__']")
WebElement npassword;
public void newpassword1(String text)
{
	npassword.sendKeys(text);
}
@FindBy(how=How.ID,using="month")
WebElement month;

public void smonth(String text)
{
	Select sc=new Select(month);
	sc.selectByVisibleText(text);
}
@FindBy(how=How.XPATH,using="//select[@id='day']")
WebElement day;
public void sday(String text)
{
	Select sc=new Select(day);
	sc.selectByVisibleText(text);
}

@FindBy(how=How.CSS,using="[id='year']")
WebElement year;
public void syear(String text)
{
	Select sc = new Select(year);
	sc.selectByVisibleText(text);
}

@FindBy(xpath="//span[3]//input[1]")
WebElement gender;

public void gender1()
{
	gender.click();
}
@FindBy(how=How.XPATH,using="//select[@name='preferred_pronoun']")
WebElement select2;

public void select2(String text)
{
	Select sc=new Select(select2);
	sc.selectByValue(text);
	
}


public data(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
