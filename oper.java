import java.util.Scanner;

public class oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("A grade: pass");
        } 
        else if (marks >= 80 && marks < 90) {
            System.out.println("B grade: pass");
        } 
        else {
            System.out.println("fail");
        }

        sc.close();
    }
}
