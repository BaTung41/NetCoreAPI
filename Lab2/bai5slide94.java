package Lab2;
import java.util.Scanner;
public class bai5slide94 {public static void main(String[] args) {
    int number, tong = 0;
    Scanner sc = new Scanner(System.in);      
    String reString = "" ;
    while (tong < 100){
     System.out.print("Nhap vao so nguyen bat ky: ");
       number = sc.nextInt();
       tong += number;
     reString = reString + number + " + ";
     }
     System.out.println(reString.substring(0,reString.length()-2)+ "= "+tong);
    sc.close();
    } 
    
}
