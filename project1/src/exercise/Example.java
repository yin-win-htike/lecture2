package exercise;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {
	public static void main(String[] args) {
		readOneByte();
		
	}
	
	
	private static void  readOneByte(){

		try {
		InputStream input = new FileInputStream("C:\\javaclass\\project1\\bytes.txt");

		int intVal;
		while ((intVal = input.read()) >=0){
		byte byteVal = (byte) intVal;

		System.out.print(byteVal);
		}
		}catch (IOException e){
		e.printStackTrace();
		}
		}
}



