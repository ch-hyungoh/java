package sub1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 
 * 
 *	���� ����� �ǽ�
 */
public class FileIOTest {
	
	
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\chlgu\\Desktop\\text1.txt";
		String path2 = "C:\\Users\\chlgu\\Desktop\\text2.txt";
		
		//���ϰ� �Է½�Ʈ�� ����
		try {
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			int value = 0;
			
			while(true) {
				//��Ʈ������ ���� ������ �б�
				value = fis.read();
				
				if(value == -1) {
					//���̻� ���� �����Ͱ� ������ ����
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
