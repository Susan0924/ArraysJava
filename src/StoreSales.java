import java.util.Scanner;

class StoreSales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stores: ");
        int stores = sc.nextInt();

        int[][] sales = new int[stores][];

        int maxTotal = Integer.MIN_VALUE;
        int maxStoreIndex = -1;

        for (int i = 0; i < stores; i++) {

            System.out.print("Enter number of products in store " + (i + 1) + ": ");
            int products = sc.nextInt();

            sales[i] = new int[products];

            int total = 0;

            System.out.println("Enter sales values:");

            for (int j = 0; j < products; j++) {
                sales[i][j] = sc.nextInt();
                total += sales[i][j];
            }

            System.out.println("Total sales for store " + (i + 1) + ": " + total);

            if (total > maxTotal) {
                maxTotal = total;
                maxStoreIndex = i;
            }
        }

        if (stores > 0) {
            System.out.println("\nStore with highest sales: " + (maxStoreIndex + 1));
            System.out.println("Highest total sales: " + maxTotal);
        }
    }
}
