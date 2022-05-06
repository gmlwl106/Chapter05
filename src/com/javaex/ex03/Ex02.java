package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		Reader r = new FileReader("D:\\javaStudy\\File\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(r);
		
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
