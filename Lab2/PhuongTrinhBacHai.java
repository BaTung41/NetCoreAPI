package Lab2;
import java.util.Scanner;
public class PhuongTrinhBacHai {
    public static void main(String[] args) {
    // Phuong trinh bac 2: SoAx^2 + SoBx + SoC = 0
    double SoA, SoB, SoC, delta;
    double NghiemX1, NghiemX2;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Nhap SoA: ");
    SoA = scanner.nextDouble();
    System.out.println("Nhap SoB: ");
    SoB = scanner.nextDouble();
    System.out.println("Nhap SoC: ");
    SoC = scanner.nextDouble();
    delta = Math.pow(SoB, 2) - 4*SoA*SoC;
    if (SoA == 0 ) {
        System.out.println("Giai nhu phuong trinh bac nhat ");
    }else{
        if(delta<0){
            System.out.println("Phuong trinh vo nghiem");
    
        }else if (delta==0) {
            NghiemX1 =-SoB / 2*SoA;
            System.out.println("Phuong trinh co nghiem kep =" +NghiemX1);
            
        }else {
            NghiemX1 = (-SoB - Math.sqrt(delta)) / (2*SoA);
            NghiemX2 = (-SoB + Math.sqrt(delta)) / (2*SoA);
            System.out.println("Phuong trinh co 2 nghiem");
            System.out.println("NghiemX1" +NghiemX1);
            System.out.println("NghiemX2" +NghiemX2);
    
    
        }
    }
    scanner.close();
    

    }

}

