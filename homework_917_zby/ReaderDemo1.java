/*----------------------------------------------
           Homework 2020.9.17

                BY:  wyuibm521  zhoubingyao 
Q:用字符流实现对一个文件读操作
 -------------------------------------------------*/
package homework_917_zby;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\GBA\\IO" + File.separator + "test.txt");
		Reader input = new FileReader(f);
		char[] c = new char[1024];
		int len = input.read(c);
		input.close();
		System.out.println(new String(c, 0, len));
	}
}
