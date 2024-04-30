import java.util.Scanner;

public class checkYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=sc.nextInt();
        if(year%4==0&&year%100!=0&&year%400==0)
        {
            System.out.println("Your year is a leap year");
        }
        if(year%100==0&&year%400!=0)
        {
            System.out.println("Your year is not a leap year");

        }
        if(year%100==0&&year%400==0)
        {
            System.out.println("Your year is a leap year");
        }
    }
}
