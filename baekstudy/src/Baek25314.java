import java.util.Scanner;

public class Baek25314 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int div = num / 4;

//        for(int i = 1; i <= div; i++) {
//            System.out.println("long");
//            }
        System.out.println("long ".repeat(div) + "int");

    }


}
