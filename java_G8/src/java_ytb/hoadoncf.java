package java_ytb;

public class hoadoncf {
     private String tenLoaicaphe;
     private double giaTien1kg, khoiLuong;
     public hoadoncf(String ten, double gia, double kl) {
    	 this.tenLoaicaphe = ten;
    	 this.giaTien1kg = gia;
    	 this.khoiLuong = kl;
    	 
     }
     public double tinhTongTien() {
    	 return this.giaTien1kg * this.khoiLuong;
     }
     public boolean kiemTrakhoiluong(double kl) {
//	   if (this.khoiLuong> kl) {
//		   return true;
//	   }else {
//		   return false;
//	   }
          return this.khoiLuong > kl;

     }
     public boolean kiemTraTongTien() {
    	 return this.tinhTongTien()>500;
     }
     public double  giamGia(double x) {
    	 if(this.tinhTongTien()>500) {
    	 return (x/100)*this.tinhTongTien();
    	 }else {
    		 return 0;
    	 }
     }
     public double tienSauGiam(double x) {
    	 return this.tinhTongTien()-this.giamGia(x);
     }
     
}
