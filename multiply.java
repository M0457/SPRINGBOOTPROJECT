import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
       Scanner it = new Scanner(System.in);
       System.out.println("Enter the value of a");
       int a = it.nextInt();
       System.out.println("Enter the value of b");
       int b = it.nextInt();
       int ans = a*b;
       System.out.println("multiply of a and b "+ ans);
    }
    
}
