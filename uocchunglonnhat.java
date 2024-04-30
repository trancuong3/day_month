import java.util.Scanner;

public class uocchunglonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

    }
}
