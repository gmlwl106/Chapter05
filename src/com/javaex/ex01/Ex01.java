package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("D:\\javaStudy\\File\\img.jpg");
		OutputStream out = new FileOutputStream("D:\\javaStudy\\File\\byteimg.jpg");
		
		while(true) {
			int data = in.read();
			System.out.println(data);
			
			if(data == -1) {
				break;
			}
			
			out.write(data);
			
		}
		
		out.close();
		in.close();
		
	}
}
