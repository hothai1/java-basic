package java_ytb;

import java.util.Scanner;

public class hangso {
       public static void main(String[] args) {
		final int x = 10;
		System.out.println("x ="+x);
		//nhập dữ liệu từ bàn phím bài 9
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ho va ten:");
		String hovaTen = sc.nextLine();
		System.out.println(" nhap masv:");
		long maSinhVien = sc.nextLong();
		System.out.println("nhap diem tb:");
		float diemTB = sc.nextFloat();
		System.out.println("--------------------");
		System.out.println("ho ten:"+hovaTen);
		System.out.println("masv:"+maSinhVien);
		System.out.println("diem trung binh:"+diemTB);
		// ep kieu du lieu bai10
		// ep kieu ngam dinh
		int a = 100;
		int b = 345;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		float c = a;
		float d = b;
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		// ep kieu tuong minh khi du lieu moi lon hon
		
		float e = 2.3f;
		System.out.println("ep kieu ve int"+e);
		int f = (int)e;
		System.out.println("kieu du lieu moi:"+f);
		//ep kieu giua bien nguyen thuy va doi tuong
		int n = new Integer(45);
		System.out.println(n);
		
	}
}
