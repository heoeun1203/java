package basic.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File f1 = new File("D:/Temp");
		File f2 = new File("D:/Temp/test");
		File f3 = new File("D:/Temp/ttt.txt");

		String res = "";
		if (f1.isFile()) {
			res = "파일";
		} else {
			res = "폴더";
		}
		System.out.println("결과 : " + res);

		if (!f2.exists()) {
			f2.mkdir();
		}

		if (!f3.exists()) {
			f3.createNewFile();

		}

		f3.renameTo(new File("D:/Temp/sss.txt"));

		File[] names = f1.listFiles();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i].getName());
		}

		System.out.println("================================================");
		for (File str : names) {
			System.out.println(str);
		}

		System.out.println("================================================");

		System.out.println("날짜시간                    형태\t크기 \t이름");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

		for (File file : names) {
			System.out.print(sdf.format(new Date(file.lastModified())));

			if (file.isDirectory()) {
				System.out.println("\t<DIR>\t\t" + file.getName());
			} else {
				System.out.println("\t<FILE>\t" + file.length() + "\t" + file.getName());
			}

		}
		System.out.println("================================================");

	}
}
