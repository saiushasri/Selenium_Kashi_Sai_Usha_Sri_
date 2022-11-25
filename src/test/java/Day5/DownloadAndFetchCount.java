package Day5;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadAndFetchCount {

	public int countOfFiles()
	{
		List<String> fileNames = new ArrayList<String>();
	    try {
	      DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("C:\\JavaBrahman\\Level1"));
	      for (Path path : directoryStream) {
	        fileNames.add(path.toString());
	      }
	    } catch (IOException ex) {
	    }
	    return (fileNames.size());
	}
	@BeforeMethod
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		Map<String,Object> prefs=new HashMap<String,Object>();
		prefs.put("", "");
	}
	@Test
	public void myTest()
	{
		
	}
}
