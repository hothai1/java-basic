package java_G8;
import java.util.Scanner;
public class bai10 {
	 private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Nhập số tự nhiên n = ");
        int n = scanner.nextInt();
        System.out.printf("Các số fibonacci nhỏ hơn %d và "
                + "là số nguyên tố: ", n);
        int i = 0;
        while (fibonacci(i) < n) {
            int fi = fibonacci(i);
            if (isPrimeNumber(fi)) {
                System.out.print(fi + " ");
            }
            i++;
        }
	}
	public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
	 public static boolean isPrimeNumber(int n) {
	        // so nguyen n < 2 khong phai la so nguyen to
	        if (n < 2) {
	            return false;
	        }
	        // check so nguyen to khi n >= 2
	        int squareRoot = (int) Math.sqrt(n);
	        for (int i = 2; i <= squareRoot; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	

}
