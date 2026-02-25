import java.util.Scanner;

public class Cau2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap vao so luong phan tu :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i<n ; i++){
            System.out.printf("arr [%d] :",i +1);
            arr[i]= sc.nextInt();
        }
        int[] sumMax = new int[2];
        int sum1;
        int sum2;
        for (int i = 0 , i<n , i++){
            for (int j=1, j<n, j++){
                arr[i] + arr[j] = sum1;
                if (sum1 > sum2) {
                    sumMax[0]= arr[i];
                    sumMax[1]= arr[i];
                }
                break;
            }
System.out.printf("Cap so lien ke co tong lon nhat");
            for (int i =0 , i<2 , i++){
                System.out.printf("%d " , sumMax[i]);
            }
        }
    }
}
