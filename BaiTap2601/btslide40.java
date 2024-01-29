package BaiTap2601;
import java.util.Scanner;

public class btslide40 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ngay :");
        int ngay = scanner.nextInt();


        switch(ngay){
            case 0:
            System.out.print("Chu nhat");
            break;
            case 1:
            System.out.print("Thu Hai");
            break;
            case 2:
            System.out.print("Thu Ba");
            break;
            case 3:
            System.out.print("Thu Tu");
            break;
            case 4:
            System.out.print("Thu Nam");
            break;
            case 5:
            System.out.print("Thu Sau");
            break;
            case 6:
            System.out.print("Thu Bay");
            break;
        default:
        System.out.println("So ngay trong tuan sai");}
        scanner.close();


    
}
}
