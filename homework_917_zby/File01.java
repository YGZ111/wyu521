/*----------------------------------------------
           Homework 2020.9.17

                BY:  wyuibm521  zhoubingyao 
Q��ʹ���ļ�������myfile.txt�ļ�Ϊmyfile_cp.txt
 -------------------------------------------------*/
package homework_917_zby;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File01 {
	private static Scanner scan;

	public static void main(String[] args) throws IOException {
		scan = new Scanner(System.in);
		// �����ļ�
		createFile();

		FileInputStream fis = new FileInputStream("myfile.txt");
		FileOutputStream fos = new FileOutputStream("myfile_cp.txt");
		int len = -1;
		while ((len = fis.read()) != -1) {
			fos.write(len);
		}
		System.out.println("���Ƴɹ�������");

		fis.close();
		fos.close();
		scan.close();
	}

	public static FileOutputStream createFile() throws IOException {
		FileOutputStream fos = new FileOutputStream("myfile.txt", true);
		System.out.println("�������ļ����ݣ�");
		String str = scan.nextLine();
		byte[] bytes = str.getBytes();
		fos.write(bytes);
		System.out.println("д��ɹ�������");
		fos.close();
		return fos;
	}

}
