package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("D:\\javaStudy\\File\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] person = str.split(",");
			System.out.println("이름: " + person[0]);
			System.out.println("핸드폰: " + person[1]);
			System.out.println("회사: " + person[2]);
			System.out.println();
		}

		
		
		br.close();
	}
}
