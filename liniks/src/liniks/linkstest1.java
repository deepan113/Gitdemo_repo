package liniks;


import java.sql.Driver;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class linkstest1 {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("myprofile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://expidia.com");
		WebElement fromDrop=driver.findElement(By.id("buses-origin"));
		List<WebElement> dropdown=fromDrop.findElements(By.id("buses-destination"));
		
		for(int i=0;i<dropdown.size();i++)
		{
			dropdown.get(i).click();
			String city=dropdown.get(i).getText();
			WebElement todrop=driver.findElement(By.id("buses-destination"));
			
				 if( todrop.getText().contains(city))
				    {
				     System.out.println(city+"is not working correctly");
				    }
				  	else
				       {
				        System.out.println(city="is working correct");
				       }
			
					}
			}

}
