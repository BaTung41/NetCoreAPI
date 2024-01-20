package Lab2;
import java.util.Scanner;
public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
    double SoA, SoB;
    double NghiemX;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhap SoA: ");
    SoA = scanner.nextDouble();
    System.out.println("Nhap SoB: ");
    SoB = scanner.nextDouble();
    if (SoA == 0) {
        if (SoB == 0) {
            System.out.println("Phuong Trinh vo so nghiem");
        } else {
            System.out.println("Phuong Trinh vo nghiem");

        }
    } else {
        NghiemX = - SoB / SoA;
        System.out.println("Nghiem cua phuong trinh la = " +  NghiemX);


    }
    scanner.close();

    }
}
