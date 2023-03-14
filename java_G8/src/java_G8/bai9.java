package java_G8;

public class bai9 {
	public static void main(String[] args) {
		display();

	}
	 static boolean thuannghich(int n) {
		 int tg = n;
		 int temp = 0;
		 while(n>0) {
			 temp = temp*10 + n%10;
			 n/= 10;
		 }
		 if(temp == tg)
			   return true;
		 return false;
	 }
	 static void display() {
		 int m = 0;
		 for (int i=100000;i<=999999;i++)
			 if(thuannghich(i)) {
			 if(m%10 == 0)System.out.println("");
		 m++;
		 System.out.print(" "+i);
	 }
	 }
}
