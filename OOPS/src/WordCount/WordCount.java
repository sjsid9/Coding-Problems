package WordCount;

import java.io.File;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws Exception {
// Put the file in OOPS File
		File file = new File("sample.txt");
//		System.out.println(new File(".").getAbsolutePath());
		Scanner s = new Scanner(file);
		int words = 0;

		while (s.hasNextLine()) {
			String line = s.nextLine();
			words += line.split(" ").length;

		}
		System.out.println("Total words in file are " + words);
	}

}
