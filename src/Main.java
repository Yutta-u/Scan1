import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("enter number: ");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num < 10) {
            System.out.println("one more plz: ");
            num = scan.nextInt();
        } else if (num < 10) {
            System.out.println("the end game ");
        }
    }
}
