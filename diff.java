import java.util.Scanner;

class diff{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        int ans = a-b;
        System.out.println("Difference between a and b " +ans);
    }
}
