import java.util.Scanner;

public class checkprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n<2)
        {
            System.out.println("number is not prime");
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                System.out.println("number is not prime");
            }
            else{
                System.out.println("number is  prime");
            }
        }
    }
}
