package exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Example {
	public static void main(String[] args) {
		// readOneByte();
		// readOneChar();
		// readArrayOfByte();
		// readArrayOfChar();
		// writeByte();
		// readAndWriteByte();
		// writeChars();
		readAndWriteChars();

	}

	private static void readOneByte() {

		try (InputStream input = new FileInputStream("C:\\javaclass\\lecture2\\project1\\bytes.txt")) {

			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;

				System.out.print(byteVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readArrayOfByte() {
		try (InputStream input = new FileInputStream("C:\\javaclass\\lecture2\\project1\\bytes.txt")) {

			int length;
			byte[] byteBuff = new byte[10];
			while ((length = input.read(byteBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					byte byteVal = byteBuff[i];
					System.out.print(byteVal);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readOneChar() {
		try (Reader reader = new FileReader("C:\\javaclass\\lecture2\\project1\\char.txt")) {

			int intVal;

			while ((intVal = reader.read()) >= 0) {
				char ch = (char) intVal;
				System.out.print(ch);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readArrayOfChar() {
		try (Reader input = new FileReader("C:\\javaclass\\lecture2\\project1\\char.txt")) {

			int length;
			char[] charBuff = new char[10];
			while ((length = input.read(charBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					char charVal = charBuff[i];
					System.out.print(charVal);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeByte() {

		try (OutputStream output = new FileOutputStream("C:\\\\javaclass\\\\lecture2\\\\project1\\\\writebyte.txt")) {

			byte byteVal = 100;
			output.write(byteVal);

			byte[] byteBuff = { 0, 63, 127 };
			output.write(byteBuff);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readAndWriteByte() {

		try (OutputStream output = new FileOutputStream(
				"C:\\\\\\\\javaclass\\\\\\\\lecture2\\\\\\\\project1\\\\\\\\readwritebyte.txt");
				FileInputStream input = new FileInputStream("C:\\javaclass\\lecture2\\project1\\bytes.txt")) {

			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;

				output.write(byteVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeChars() {

		try (Writer writer = new FileWriter("C:\\javaclass\\lecture2\\project1\\writechar.txt")) {
			char charVal = 'a';
			writer.write(charVal);
			char[] charBuff = { 'a', 'b', 'c' };
			writer.write(charBuff);

			String stringVal = "Hello World";
			writer.write(stringVal);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void readAndWriteChars() {

		try (Reader reader = new FileReader("C:\\javaclass\\lecture2\\project1\\char.txt");
				Writer writer = new FileWriter("C:\\javaclass\\lecture2\\project1\\readandwritechar.txt")) {

			int intVal;

			while ((intVal = reader.read()) >= 0) {
				char ch = (char) intVal;
				writer.write(ch);

			}

			int length;
			char[] charBuff = new char[10];
			while ((length = reader.read(charBuff)) >= 0) {
				for (int i = 0; i < length; i++) {
					char charVal = charBuff[i];
					writer.write(charVal);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
