package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {
	public static void main(String[] args) {
		//표준출력
		//System.out
		//System.out.print("입력해라 : ");
		
		//
		try {
//			System.out.println("입력1 : ");
//			int x = System.in.read();
//			System.out.println("x == " + x);
//			System.out.println("x == " + (char)x);
			
			System.out.print("입력2 : ");
			byte b[] = new byte[100];
			int x = System.in.read(b);
			System.out.println("2. x == " + x);
			int len = b.length;
//			for (int i = 0; i < len; i++) {
//				System.out.println(b[i]);
//			}
			String s = new String(b, 0, x-2);
			System.out.println(s);
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
