package java_G8;
import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("n = ");
			n = sc.nextInt();
		}while (n<=0);
		System.out.format("%d fibonacci: %d",n,fibo(n));
	}
  public static int fibo(int n) {
	  if(n==1 || n==2) {
		  return 1;
	  }else {
		  return (fibo(n-2)+fibo(n-1));
	  }
  }
}
