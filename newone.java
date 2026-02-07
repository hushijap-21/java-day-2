import java.util.Scanner;
public class newone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();

        
        
        int sum = a + b;


        if (sum >= 0) {
            System.out.println("positive");
        }

        if (sum > 0 && sum % 2 == 0) {
            System.out.println("positive and even");
        }

        System.out.println(a++);
    }
}
