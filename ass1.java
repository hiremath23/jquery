public class ass1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http:/www.jqueryui.com");
		 driver.findElement(By.linkText("Demos")).click();
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		driver.findElement(By.linkText("Droppable")).click();
		driver.findElement(By.cssSelector("a[href=\'https://jqueryui.com/resizable/\']")).click();
		
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		
		

	}

}