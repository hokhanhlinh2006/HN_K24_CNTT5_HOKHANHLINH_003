//Cau 1.2: Nhap vao mot chuoi ky tu la ho ten day du tu ban phim
import java.util.Scanner;
public class Cau12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao ho va ten: ");
        String name = sc.nextLine();
        System.out.println("Ban vua nhap: " + name);
    }
}
