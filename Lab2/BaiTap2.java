package Lab2;
import java.util.Scanner;
public class BaiTap2 {
    public static void main(String[] args) {
    int Number;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap So:" );
    Number = scanner.nextInt();
    if (Number % 2 != 0) {
        System.out.println("So vua nhap la so le");
    } else {
        if (Number == 0) {
        System.out.println("So vua nhap la so 0");
        } else {
        System.out.println("So vua nhap la so chan");
    }
    scanner.close();
    
}
}
}
