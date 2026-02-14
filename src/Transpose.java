import java.util.Arrays;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n: ");
        int m = sc.nextInt();


        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter the element " + i + " " + j + ": ");
                arr[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
