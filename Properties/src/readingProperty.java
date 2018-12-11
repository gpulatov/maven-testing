import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readingProperty {

	public static void main(String[] args) throws IOException {
		
		//Create an instance of Properties class from JAVA
		Properties prop = new Properties();
		
		//Provide the path of the file to constructor of the class
		FileInputStream ip = new FileInputStream("C:\\Users\\NWCFOOD\\Desktop\\JAVA_SELENIUM\\SELENIUM\\testing-maven\\Properties\\employee.properties");
		
		prop.load(ip);
		
		//Retrieve those properties
		String name = prop.getProperty("name");
		System.out.println(name);
	
		System.out.println(prop.getProperty("age"));

	}

}
