package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("D:\\javaStudy\\File\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 땡땡땡");
		bw.newLine();//줄바꿈
		bw.write("어서 모이자");
		bw.newLine();//줄바꿈
		bw.write("선생님이 우리를");
		bw.newLine();//줄바꿈
		bw.write("기다리신다");
		
		
		bw.close();
	}
}
