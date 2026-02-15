import java.util.Scanner;

class SentenceWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sentences: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] words = new String[n][];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter sentence " + (i + 1) + ": ");
            String sentence = sc.nextLine().trim();

            if (sentence.isEmpty()) {
                words[i] = new String[0];
            } else {
                words[i] = sentence.split("\\s+");
            }
        }

        System.out.println("\nWord Counts:");

        for (int i = 0; i < n; i++) {
            System.out.println("Sentence " + (i + 1) + " -> " + words[i].length + " words");
        }
    }
}
