package com.seleniumconcepts.SELENIUMCONCEPT;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicWebtable extends BaseTestClass{
	String max;
	double m=0,r=0;

	@Test
    public void findMaxValueinWebtable() throws ParseException
    {
       WebElement table= driver.findElement(By.className("dataTable"));
     List<WebElement> lst_rows=  table.findElements(By.xpath("//tr//td[1]"));
      List<WebElement> lst_columns=table.findElements(By.xpath("//tr//th"));
     int row_size=lst_rows.size();
     int col_size= lst_columns.size();
     System.out.println("row size is: "+row_size+"column size is :"+col_size);
     
     for(int i=1;i< row_size-1;i++)
     {
    	 max=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+(i+1)+"]//td[4]")).getText();
    	 NumberFormat f=NumberFormat.getInstance();
    	
			Number num =f.parse(max);
		   max=num.toString();
		  m= Double.parseDouble(max);
		  if(m>r)
		  {
			  r=m;
		  }
     }
     System.out.println("Maximum current price is:"+r);
    }

}
