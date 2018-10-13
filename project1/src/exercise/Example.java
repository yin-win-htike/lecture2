package exercise;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Example {
	public static void main(String[] args) {
		readOneChar();

	}

	private static void readOneByte() {

		try {
			InputStream input = new FileInputStream("C:\\javaclass\\lecture2\\project1\\bytes.txt");

			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;

				System.out.print(byteVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readOneChar() {
		try {
			Reader reader = new FileReader("C:\\javaclass\\lecture2\\project1\\char.txt");
			int intVal;

			while ((intVal = reader.read()) >= 0) {
				char ch = (char) intVal;
				System.out.print(ch);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
