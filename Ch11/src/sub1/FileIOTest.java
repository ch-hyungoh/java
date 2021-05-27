package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 
 *	파일 입출력 실습
 */
public class FileIOTest {
	
	
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\chlgu\\Desktop\\text1.txt";
		String path2 = "C:\\Users\\chlgu\\Desktop\\text2.txt";
		
		//파일과 입력스트림 연결
		try {
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value = 0;
			
			while(true) {
				//스트림으로 부터 데이터 읽기
				value = fis.read();
				
				if(value == -1) {
					//더이상 읽을 데이터가 없을때 종료
					break;
				}
				
				char ch = (char)value;
				System.out.print(ch);
				
				fos.write(value);
				
			}
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
