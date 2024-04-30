import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        if(bmi < 18.5)
        {
            System.out.println("Underweight");
        }
        if(bmi >= 18.5 && bmi <= 24.9)
        {
            System.out.println("Normal");
        }
        if(bmi >= 25 && bmi <= 29.9)
        {
            System.out.println("Overweight");
        }
        if(bmi >= 30 && bmi <= 39.9)
        {
            System.out.println("Obesity");
        }
    }
}
