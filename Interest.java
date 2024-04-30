import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tiền gửi");
        double tiengui=sc.nextDouble();
        System.out.println("nhập số tháng đã gửi tiền");
        int month=sc.nextInt();
        System.out.println("nhập lãi suất");
        int laisuat=sc.nextInt();
        double tienlai;
        tienlai=tiengui*laisuat/12*month;
        System.out.println(tienlai+"vnd");
    }
}
