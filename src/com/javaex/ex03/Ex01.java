package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Reader r = new FileReader("D:\\javaStudy\\File\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(r);
		
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
