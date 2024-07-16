import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean grade = true;
        while (grade) {
            System.out.println("Enter the Marks : ");
            int marks = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            if (marks >= 90) {
                System.out.println("The student is graded A");
            } else if (marks >= 80) {
                System.out.println("The student is graded B");
            } else if (marks >= 70) {
                System.out.println("The student is graded C");
            } else if (marks >= 60) {
                System.out.println("The student is graded D");
            } else if(marks>=50){
                System.out.println("The student is graded E");
            } else {
                System.out.println("The student has Failed");
            }

            System.out.println("Do you want to check more grades? (y/n) : ");
            String res = sc.nextLine().toLowerCase();
            if (!res.equals("y")) {
                grade = false;
            }
        }
        System.out.println("Exit...");
        sc.close();
    }
}