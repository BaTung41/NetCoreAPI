package BaiTap2601;
import java.util.Scanner;

public class btslide30 {
    public static void main(String[] args) {
        int n, sodu, tong=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        while (n>0) {
            sodu = n % 10;
            n = n / 10;
            tong += sodu;
        }
    System.out.println("Tong cac chu so cua n =" + tong); 
    scanner.close();
}
}
