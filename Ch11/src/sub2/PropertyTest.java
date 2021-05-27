package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyTest {
public static void main(String[] args) {
		
		String path = "C:\\Users\\chlgu\\Desktop\\city1.properties";
		
		Properties props = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			props.load(fis);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("101번 도시 : "+props.getProperty("101"));
		System.out.println("101번 도시 : "+props.getProperty("102"));
		
		
	}
}
