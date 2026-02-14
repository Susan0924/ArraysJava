import java.util.Arrays;
import java.util.Scanner;

public class CinemaMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the no of cols: ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];
        int count = 0;
        for (int i =0; i<m ;i++){
            for (int j = 0;j<n;j++){
                System.out.println("Enter the element "+ i + " " + j +": ");
                arr[i][j] = sc.nextInt();

                if(arr[i][j] == 0){
                    count++;
                }
            }
        }
        System.out.println("No of avaiable seats = "+ count);


    }
}
