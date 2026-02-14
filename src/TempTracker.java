import java.util.Arrays;
import java.util.Scanner;

public class TempTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int [] arr = new int [n];

        for(int i=0;i<n;i++){
            System.out.println("Enter the element: "+ (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Max : "+ max);
        System.out.println("Min : "+ min);

        System.out.println("Difference = "+ (max - min)+"$");




    }

}
