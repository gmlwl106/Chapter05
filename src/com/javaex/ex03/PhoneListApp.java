package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class PhoneListApp {

	public static void main(String[] args) throws IOException {
		
		//input
		InputStream in = new FileInputStream("D:\\javaStudy\\File\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		//output
		OutputStream out = new FileOutputStream("D:\\javaStudy\\File\\PhoneDB-copy.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		
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
