import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestDriver {

	WebDriver driver = null;
	RemoteWebDriver dr= null;
	TakesScreenshot sc;
	
	void methods()
	{
		driver = new ChromeDriver();
	}
}
