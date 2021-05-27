package sub1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * ���� ���� Ȯ��
 */

public class BufferFileIOTest {
public static void main(String[] args) {
		
		String path1 = "C:\\Users\\chlgu\\Desktop\\sample.jpg";
		String path2 = "C:\\Users\\chlgu\\Desktop\\sample2.jpg";
		
		//���ϰ� �Է½�Ʈ�� ����
		try {
			
			//���� ��Ʈ�� ����
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path1));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2));
			
			int value = 0;
			
			while(true) {
				//��Ʈ������ ���� ������ �б�
				value = bis.read();
				
				if(value == -1) {
					//���̻� ���� �����Ͱ� ������ ����
					break;
				}
				
				char ch = (char)value;
				System.out.print(ch);
				
				bos.write(value);
				
			}
			
			bis.close();
			bos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}