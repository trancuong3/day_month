import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter vnd");
        int  vnd=sc.nextInt();
        int dola= vnd/23000;
        System.out.println(dola);
        System.out.println("enter dola");
        dola=sc.nextInt();
        vnd=dola*23000;
        System.out.println(vnd);

    }
}
