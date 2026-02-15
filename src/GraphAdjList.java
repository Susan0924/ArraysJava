import java.util.Scanner;

class GraphAdjList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][];


        for (int i = 0; i < n; i++) {

            System.out.print("Enter number of neighbors for node " + i + ": ");
            int neighbors = sc.nextInt();

            graph[i] = new int[neighbors];

            System.out.println("Enter neighbors of node " + i + ":");

            for (int j = 0; j < neighbors; j++) {
                graph[i][j] = sc.nextInt();
            }
        }


        System.out.println("\nAdjacency List:");

        for (int i = 0; i < n; i++) {
            System.out.print(i + " -> ");

            for (int j = 0; j < graph[i].length; j++) {
                System.out.print(graph[i][j] + " ");
            }

            System.out.println();
        }
    }
}
