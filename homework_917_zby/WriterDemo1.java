/*----------------------------------------------
           Homework 2020.9.17

                BY:  wyuibm521  zhoubingyao 
Q:用字符流实现对一个文件写操作
 -------------------------------------------------*/
package homework_917_zby;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\GBA\\IO" + File.separator + "test.txt");
		Writer out = new FileWriter(f);
		String str = "Hello 字符流";
		out.write(str);
		out.close();
	}

}
