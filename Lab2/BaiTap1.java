package Lab2;
import java.util.Scanner;
public class BaiTap1 {
    public static void main(String[] args) {
    double So1, So2;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap vao so thu nhat:");
    So1 = scanner.nextDouble();
    System.out.println("Nhap vao so thu hai:");
    So2 = scanner.nextDouble();

    //Tinh tong hieu tich thuong chia lay du
    double Tong = So1 + So2;
    System.out.println(So1 + "+" + So2 + "=" + Tong);
    Double Hieu = So1 - So2;
    System.out.println(So1 + "-" + So2 + "=" + Hieu);
    Double Tich = So1 * So2;
    System.out.println(So1 + "*" + So2 + "=" + Tich);
    Double Thuong = So1 / So2;
    System.out.println(So1 + ":" + So2 + "=" + Thuong);
    double SoDu = So1 % So2;
    System.out.println(So1 + "%" + So2 + "=" + SoDu);

    //So sanh 2 so do
    System.out.println("So sanh bang " + So1 + " va " + So2 + ( So1 == So2));
    System.out.println("So sanh khong bang " + So1 + " va " + So2 + ( So1 != So2));
    System.out.println("So sanh lon hon " + So1 + " va " + So2 + ( So1 > So2));
    System.out.println("So sanh be hon " + So1 + " va " + So2 + ( So1 < So2));

    scanner.close();


}
}
