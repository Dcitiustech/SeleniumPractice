package com.seleniumconcepts.SELENIUMCONCEPT;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebTableMoneyControl extends BaseTestClass {
	String max;
	double m=0,r=0;
	
	@Test
	public void MaxLastpricevalue() throws ParseException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement table = driver.findElement(By.xpath("//div[@id='in_maNSE']//table[@class='rhsglTbl']"));
		js.executeScript("arguments[0].scrollIntoView();", table);
		List<WebElement> lst_row=table.findElements(By.xpath("//tr"));
		List<WebElement> lst_col=table.findElements(By.xpath("//tr//th"));
		int rowsize= lst_row.size();
		System.out.println("the length of row is:" +rowsize);
		
		int colsize= lst_col.size();
		System.out.println("the length of column is:" +colsize);
		 for(int i=1;i<rowsize;i++)
		 {
			 max= driver.findElement(By.xpath("//div[@id='in_maNSE']//table[@class='rhsglTbl']//tr["+i+"]//td[4]")).getText();
			 NumberFormat number=NumberFormat.getInstance();
			 Number num=number.parse(max);
			 max=num.toString();
			m=Double.parseDouble(max);
			if(m>r)
			{
				r=m;
			}
		 }
		 System.out.println("The maximum value is :"+r);
	}

}
