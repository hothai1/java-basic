package java_ytb;

//import java.util.Scanner;

public class main {

	public static void main(String[] args) {
//		
//		hoadoncf hd = new hoadoncf("trung nguyen",100,1.5);
//		hoadoncf hd1 = new hoadoncf("trung nguyen",100,5.5);
//		System.out.println("tong tien :"+ hd.tinhTongTien());
//		System.out.println("tong tien :"+ hd1.tinhTongTien());
//		System.out.println("kiem tra khoi luong>2"+hd.kiemTrakhoiluong(2));
//		System.out.println("kiem tra tien > 500"+hd.kiemTraTongTien());
//		System.out.println("giam gia 10%"+ hd.giamGia(10));
//		System.out.println("giamgia 10%"+ hd1.giamGia(10));
//	    System.out.println("tien sau giam gia"+ hd.tienSauGiam(10));
//	    System.out.println("tien sau giam gia"+ hd1.tienSauGiam(10));
//	bai hoa don cf
		MyDate md = new MyDate (29,2,1995);
		System.out.println(" day= "+md.getDay());
		md.setDay(30);
		System.out.println(" day= "+md.getDay());
		
		System.out.println("month = "+ md.getMonth());
		md.setMonth(3);
		System.out.println("month = "+ md.getMonth());
		System.out.println("year = "+md.getYear());
		md.setYear(2000);
		System.out.println("year = "+md.getYear());
	}
	
	
	

}
