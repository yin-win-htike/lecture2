package exercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class Example {
	public static void main(String[] args) {
		// readOneByte();
		// readOneChar();
		// readArrayOfByte();
		// readArrayOfChar();
		//writeByte();
		readAndWriteByte();

	}

	private static void readOneByte() {
		InputStream input = null;

		try {
			input = new FileInputStream("C:\\javaclass\\lecture2\\project1\\bytes.txt");

			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;

				System.out.print(byteVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	private static void readArrayOfByte() {
		InputStream input = null;
		try {
			input = new FileInputStream("C:\\javaclass\\lecture2\\project1\\bytes.txt");
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
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	private static void readOneChar() {
		Reader reader = null;
		try {
			reader = new FileReader("C:\\javaclass\\lecture2\\project1\\char.txt");
			int intVal;

			while ((intVal = reader.read()) >= 0) {
				char ch = (char) intVal;
				System.out.print(ch);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	private static void readArrayOfChar() {
		Reader input = null;
		try {
			input = new FileReader("C:\\javaclass\\lecture2\\project1\\char.txt");
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
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	private static void writeByte() {
		OutputStream output = null;

		try {
			output = new FileOutputStream("C:\\\\javaclass\\\\lecture2\\\\project1\\\\writebyte.txt");
			byte byteVal = 100;
			output.write(byteVal);

			byte[] byteBuff = { 0, 63, 127 };
			output.write(byteBuff);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	private static void readAndWriteByte() {
		OutputStream output = null;
		FileInputStream input = null;
		try {
			output = new FileOutputStream(
					"C:\\\\\\\\javaclass\\\\\\\\lecture2\\\\\\\\project1\\\\\\\\readwritebyte.txt");
			input = new FileInputStream("C:\\javaclass\\lecture2\\project1\\bytes.txt");
			int intVal;
			while ((intVal = input.read()) >= 0) {
				byte byteVal = (byte) intVal;

				output.write(byteVal);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

}
