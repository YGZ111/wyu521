/*----------------------------------------------
           Homework 2020.9.17

                BY:  wyuibm521  zhoubingyao 
Q:ʹ�û���������myfile.txt�ļ�Ϊmyfile_cp2.txt
 -------------------------------------------------*/
package homework_917_zby;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File02 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("myfile.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);

		FileOutputStream fos = new FileOutputStream("myfile_cp2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		int len = -1;
		while ((len = bis.read()) != -1) {
			bos.write(len);
		}
		System.out.println("���Ƴɹ�������");
		bos.close();
		bis.close();
	}

}
