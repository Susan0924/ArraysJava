import java.util.Arrays;
import java.util.Scanner;

public class TragetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int [] arr = new int [n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the element: "+ (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        for (int i=0;i<n;i++){
           for (int j=i+1;j<n;j++){
               int tSum = arr[i] + arr[j];
               if(tSum == target) {
                   System.out.println("Indices: [" + i + ", " + j + "]");
                   return;
               }
           }
        }
        System.out.println("No targetsum found!");


    }
}
