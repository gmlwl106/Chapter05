package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class PhoneListApp {

	public static void main(String[] args) throws IOException {
		
		//input
		Reader r = new FileReader("D:\\javaStudy\\File\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(r);
		
		
		
		//리스트
		List<Person> pArray = new ArrayList<Person>();
		
		
		//파일 읽어와서 리스트에 추가
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			} else {
				String[] person = str.split(",");
				pArray.add(new Person(person[0], person[1], person[2]));
			}
		}
		
		
		//파일에 없는 내용 추가
		pArray.add(new Person("박희지", "010-4444-2222", "02-111-2222"));
		
		//output
		Writer w = new FileWriter("D:\\javaStudy\\File\\PhoneDB-copy.txt");
		BufferedWriter bw = new BufferedWriter(w);
		
		for(Person p : pArray) {
			//pArray 출력
			System.out.println("이름: " + p.getName());
			System.out.println("핸드폰: " + p.getPhone());
			System.out.println("회사: " + p.getCompany());
			System.out.println("-------------------------");
			
			//파일에 입력
			String str = p.getName() +  "," + p.getPhone() + "," + p.getCompany();
			bw.write(str);
			bw.newLine();//줄바꿈
		}
		

		
		bw.close();
		br.close();
	}
}
