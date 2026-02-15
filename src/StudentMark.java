import java.util.Scanner;

public class StudentMark {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Students: ");
        int n = sc.nextInt();


        int [][] marks = new int[n][];


        for (int i =0;i<n;i++){
            System.out.println("Enter the no of subjects: ");
            int Subjects = sc.nextInt();
            float Sum = 0;
            float Avg = 0;
            marks[i] = new int[Subjects];
            System.out.println("Enter mark: ");
            if(Subjects > 0){
                for (int j=0;j<Subjects;j++){
                    marks[i][j] = sc.nextInt();
                    Sum+= marks[i][j];
                }
            }else System.out.println("Enter valid subject!");
            Avg = Sum/Subjects;
            System.out.println("Total Marks: "+Sum);
            System.out.println("Average Marks: "+ Avg);
        }
        
    }

}
