package sub1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 버퍼 파일 확인
 */

public class BufferFileIOTest {
public static void main(String[] args) {
		
		String path1 = "C:\\Users\\chlgu\\Desktop\\sample.jpg";
		String path2 = "C:\\Users\\chlgu\\Desktop\\sample2.jpg";
		
		//파일과 입력스트림 연결
		try {
			
			//버퍼 스트림 생성
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path1));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2));
			
			int value = 0;
			
			while(true) {
				//스트림으로 부터 데이터 읽기
				value = bis.read();
				
				if(value == -1) {
					//더이상 읽을 데이터가 없을때 종료
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
