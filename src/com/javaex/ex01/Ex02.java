package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("D:\\javaStudy\\File\\img.jpg");
		OutputStream out = new FileOutputStream("D:\\javaStudy\\File\\byteBuffImg.jpg");
		
		byte[] buff = new byte[1024]; //buff에 담아서 복사
		
		System.out.println("복사시작");
		while(true) {
			int data = in.read(buff);
			System.out.println(data);
			
			if(data == -1) {
				System.out.println("복사끝"+data);
				break;
			}
			
			out.write(buff);
			
		}
		
		
		out.close();
		in.close();
	}
}
