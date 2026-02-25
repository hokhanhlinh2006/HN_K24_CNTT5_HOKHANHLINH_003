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
        int sum2 = Integer.MIN_VALUE;
        
          for (int i = 0; i < n - 1; i++){  
             sum1 = arr[i] + arr[i + 1];

               if (sum1 > sum2) {
                sum2 = sum1;
                sumMax[0] = arr[i];
                sumMax[1] = arr[i + 1];
                }
                
            }
System.out.printf("Cap so lien ke co tong lon nhat");
            for (int k = 0; k < 2; k++){
            System.out.print(sumMax[k] + " ");
            }
        }
    }
}
