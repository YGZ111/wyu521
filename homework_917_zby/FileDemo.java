/*----------------------------------------------
           Homework 2020.9.17

                BY:  wyuibm521  zhoubingyao 
Q:�г�������ĳ���ļ����������е����ļ��к��ļ���
 -------------------------------------------------*/
package homework_917_zby;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File file = new File("D:\\Appium-Python-Client-0.17");
		getFileAll(file);
	}

	// ��ȡ�ƶ�Ŀ¼�Լ���Ŀ¼�е����е��ļ�
	public static void getFileAll(File file) {
		File[] files = file.listFiles();
		// ������ǰĿ¼�µ������ļ����ļ���
		for (File f : files) {
			// �жϵ�ǰ���������Ƿ�ΪĿ¼
			if (f.isDirectory()) {
				// ��Ŀ¼��������ȡ���Ŀ¼�µ������ļ���
				getFileAll(f);
			} else {
				// ����Ŀ¼��˵����ǰf�����ļ�����ô�ʹ�ӡ����
				System.out.println(f);
			}
		}
	}

}
