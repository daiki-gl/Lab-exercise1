import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many integers will be added?");
        int times = scan.nextInt();

        int sum = 0;
        while(0 < times) {
            System.out.println("Enter an integer:");
            int addNum = scan.nextInt();
            sum += addNum;
            times--;
        }
        System.out.println("The sum is " +sum);

        scan.close();
    }
}
