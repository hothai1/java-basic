package java_G8;
import java.util.Scanner;
public class bai2 {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		n = sc.nextInt();
		giaithua(n);
	}
	public static void giaithua(int n){
		int ketqua = 1;
		for(int i=1; i <= n; i++)
			ketqua= ketqua*i;
		System.out.println("ket qua :"+ketqua);

	}
}
