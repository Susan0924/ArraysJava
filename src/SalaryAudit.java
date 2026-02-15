import java.util.Scanner;

public class SalaryAudit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the no of cols: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        int MaxSum = Integer.MIN_VALUE;
        int MaxIndex = 0;
        for(int i=0;i<m;i++){
            int Sum=0;
            for (int j=0;j<n;j++){

                System.out.println("Enter the Element "+i + j + " :");
                arr[i][j] = sc.nextInt();
                Sum = Sum + arr[i][j];
                System.out.println("RowSum = "+Sum);
                if(Sum > MaxSum){
                    MaxSum = Sum;
                    MaxIndex = i;
                }
            }
        }
        System.out.println("Department: "+MaxIndex);
    }
}
