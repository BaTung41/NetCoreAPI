package BaiTap2601;
import java.util.Scanner;

public class btslide47 {
    public static void main(String[] args) {
        int n, tong = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so nguyen bat ky");
            n = scanner.nextInt();
            tong += n;
         } while (tong < 100); 
     System.out.println("Tong cac so vua nhap = "+tong);
     scanner.close();


        }
    
}

