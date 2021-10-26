


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1_BrowserValidate {

	public static void main(String[] args) 
	{
				Scanner myObj = new Scanner(System.in);  // Create a Scanner object
			    System.out.println("Enter Browser Name");
			    String vBrowser = myObj.nextLine();
			    
			    if (vBrowser.contains("Edge"))
			    {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\msedgedriver.exe");
				WebDriver myD=new EdgeDriver();
				//WebDriver myD=new FireFoxDriver();
				myD.get("https://www.google.com");
				String vTitle=myD.getTitle();
				System.out.println("URL is "+myD.getCurrentUrl());
				System.out.println("Title is "+vTitle);
				myD.close();
			    }
			    else if (vBrowser.contains("Chrome"))
			    {
			    System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Desktop\\AriseGlobalB4\\Driver\\chromedriver.exe");
				WebDriver myD=new ChromeDriver();
				myD.get("https://www.google.com");
				String vTitle=myD.getTitle();
				System.out.println("URL is "+myD.getCurrentUrl());
				System.out.println("Title is "+vTitle);
				myD.close();
			    }
			    else
			    {
			    	System.out.println("Invalid Browser");
			    }
			    	
		
		
		

	}

}
