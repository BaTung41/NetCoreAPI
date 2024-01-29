package BaiTap2601;
import java.util.Scanner;

public class btslide35 {
    public static void main(String[] args) {
        double A, B;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap A: ");
        A = scanner.nextDouble();
        System.out.println("Nhap B: ");
        B = scanner.nextDouble();
        double SoNhoNhat = Math.min(A,B);
        System.out.println("So nho nhat la:" + SoNhoNhat);
        scanner.close();

    
}
}
