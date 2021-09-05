package FileManipulationss;

import java.io.*;
import java.util.Scanner;

public class filefun {

	public static void main(String[] args) throws IOException {

		File file = new File("filetests.txt");

		if (!file.exists()) {
			file.createNewFile();

		}
		Scanner scan = new Scanner(System.in);
		System.out.println("How long do you want your file to be?");
		int numberOfLines = scan.nextInt();
		PrintWriter writer = new PrintWriter(file);
		for (int i = 0; i < numberOfLines; i++) {
			String line = scan.nextLine();
			writer.println(line);
		}

		writer.println("End of file!");
		writer.close();
		System.out.println("Done!");
		scan.close();

	}

}
