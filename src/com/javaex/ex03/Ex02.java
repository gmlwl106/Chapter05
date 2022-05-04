package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("D:\\javaStudy\\File\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		
		List<Person> pList = new ArrayList<Person>();
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			} else {
				String[] person = str.split(",");
				pList.add(new Person(person[0], person[1], person[2]));
			}
		}
		
		for(Person p : pList) {
			System.out.println("이름: " + p.getName());
			System.out.println("핸드폰: " + p.getPhone());
			System.out.println("회사: " + p.getCompany());
			System.out.println();
		}
		
		
		br.close();
	}
}
